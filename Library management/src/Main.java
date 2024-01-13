import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Book b1 = new Book("java","leo",1) ;
        Book b2 = new Book("python","vikram",2) ;
        Library lib = new Library() ;
        //adding books to library
        lib.addBook(b1);
        lib.addBook(b2);
        //remove book
        lib.removeBook(b1);
        // printing the book
        lib.printAllBooks();

        Student s1 = new Student("sathish","j1") ;
        Student s2 = new Student("yeshwanth","i2") ;
        // add as library members
        lib.addStudent(s1);
        lib.addStudent(s2);
        //remove membership
        lib.removeStudent(s2);
        // show members of library
        lib.printAllStudents();
        // like update ,search also implemented

        //permission for book
        // members , available book
        lib.GrantTheBook(s1,b2);
        // member , not available book
        lib.GrantTheBook(s1,b1);
        // not a member ,available book
        lib.GrantTheBook(s2,b2);
        // not a member , not available book
        lib.GrantTheBook(s2,b1);



    }
}

class Book
{
    private String BookName ;
    private String Author ;
    private int Id ;
    public Book(String BookName,String author,int id)
    {
        this.BookName = BookName ;
        this.Author = author ;
        this.Id = id ;
    }
    public String GetBookName()
    {
        return this.BookName ;
    }
    public String getAuthor()
    {
        return this.Author  ;
    }
    public int getId()
    {
        return this.Id ;
    }
    
}

class Student
{
    private String Name ;
    private String RollNo ;
    public Student(String Name,String RollNo)
    {
        this.Name = Name ;
        this.RollNo = RollNo ;
    }
    public String GetName()
    {
        return this.Name ;
    }
    public String getRollNo()
    {
        return this.RollNo  ;
    }

}

class Library {
    private List<Book> booksList = new ArrayList<>(); // collection of books as list (it is a main variable)
    private List<Student> studentsList = new ArrayList<>(); // collection of members of the students

    public Library() {
        this.booksList = booksList;
        this.studentsList = studentsList;
    }

    /* operations on books collection in the library */
    public void addBook(Book book) {
        this.booksList.add(book);
    }

    public void removeBook(Book book) {
        if (this.booksList.contains(book)) {
            this.booksList.remove(book);
            System.out.println("book removed successfully");
        } else {
            System.out.println("book cannot removed ");
        }

    }

    public boolean searchBook(Book book) {
        for (Book books : this.booksList) {
            if (book == books) {
                return true;
            }
        }
        return false;
    }

    public void updateBook(Book book1, Book book2) {
        if (this.searchBook(book1)) {
            this.booksList.remove(book1);
            this.booksList.add(book2);
        } else {
            this.booksList.add(book2);
        }
    }

    public void printAllBooks() {
        int i = 1;
        if (this.booksList.isEmpty()) {
            System.out.println("the library is empty !!!");
        } else {
            for (Book book : this.booksList) {

                System.out.println("Book " + i + " :bookname : " + book.GetBookName() + " author :" + book.getAuthor() + " " + " id :" + book.getId());
                i = i + 1;
            }
        }
    }

    /* operations on students list as members in the library */

    public void addStudent(Student student) {
        this.studentsList.add(student);
    }

    public void removeStudent(Student student) {
        if (this.studentsList.contains(student)) {
            this.studentsList.remove(student);
            System.out.println("student removed successfully");
        } else {
            System.out.println("student cannot removed ");
        }

    }

    public boolean searchStudent(Student student) {
        for (Student students : this.studentsList) {
            if (students == student) {
                return true;
            }
        }
        return false;
    }

    public void updateStudent(Student student1, Student student2) {
        if (this.searchStudent(student1)) {
            this.studentsList.remove(student1);
            this.studentsList.add(student2);
        } else {
            this.studentsList.add(student2);
        }
    }

    public void printAllStudents() {
        int j = 1;
        if (this.studentsList.isEmpty()) {
            System.out.println("no members in the library!!!");
        } else {
            for (Student student : this.studentsList) {

                System.out.println("Student " + j + " :name : " + student.GetName() + " roll no :" + student.getRollNo());
                j = j + 1;
            }
        }
    }

    /*  all above function only related to book or student classes to library only like addbook() , removestudent() etc..
        but below function creates relationship between student and book entities through library class
        when student asks a book , who is a member of the library get book for 5 ruppes
        who is not a member of the library get book for 50 ruppes
        function takes student details and checks he is in studentslist or not in the libarary after checking it search for the book and grant the book according to conditions.

     */
        public void GrantTheBook(Student student , Book book)
        {
            if(this.searchStudent(student))
            {
                if(this.searchBook(book))
                {
                    System.out.println("Grant the Book for 5 rupees only") ;
                }
                else
                {
                    System.out.println("dear student no availability of books!!!") ;
                }
            }
            else
            {
                if(this.searchBook(book))
                {
                    System.out.println("Grant the Book for 50 rupees only") ;
                }
                else
                {
                    System.out.println("dear unknown no availability of books!!!") ;
                }
            }
        }
}
