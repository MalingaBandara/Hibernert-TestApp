import entity.Book;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AppInitializer {

    public static void main (String[]args){

                // Student
                Student student = new Student( 1, "Jayantha", 80 );
                //savestudent( student );

                // Book
                Book book = new Book( 2 , "Hibernate" );
                //saveBook( book );

                // find student
                //findStudnet( 2 );

        // find all students
        findAllStudents();


        }


            private  static void savestudent( Student student) {

            try (Session session = HibernateUtill.getSessionFactory().openSession()) {

                // save [ it returns a serializable object, saved object primary key ]
                // persist , saveOrUpdate

                Transaction transaction = session.beginTransaction(); // save, update,delete

                    session.save( student );

                transaction.commit();

            }


        }

            private  static void saveBook(Book book ) {

        try (Session session = HibernateUtill.getSessionFactory().openSession()) {

            // save [ it returns a serializable object, saved object primary key ]
            // persist  [Void]
            // saveOrUpdate

            Transaction transaction = session.beginTransaction(); // save, update,delete

            long primaryKey = (Long) session.save( book );

            transaction.commit();

            System.out.println(primaryKey);


        }

    }


            private static void findStudnet( long id ) {

        try ( Session session = HibernateUtill.getSessionFactory().openSession() ) {

            Student student = session.find( Student.class, id );

            if ( student!= null ) {
                System.out.println( student.toString() );
            }
            else {
                System.out.println( "Can't find recode" );
            }

        }

    }

    private static void findAllStudents () {

        try ( Session session = HibernateUtill.getSessionFactory().openSession() ) {

            Query query = session.createQuery("FROM Student"); // HQL (Hibernate Query Language)
            List <Student> students = query.list();
            System.out.println( students );

        }

    }

}

