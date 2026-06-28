import java.util.Scanner;
import java.util.ArrayList;

class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    Book(int id , String title , String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;

    }
    public String toString(){
        return "ID: " + id +", Title: " +title +",Author: " +author +",Issued: " +(isIssued ? "Yes" : "No");
    
    
    }
}
class Library {
    ArrayList<Book> books = new ArrayList<>();

    //Add book
    void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully!");
    }

    //Display books
    void showBooks(){
        if(books.isEmpty()){
            System.out.println("No books available.");
            return;
        }

        for(Book b : books){
            System.out.println(b);
        }
    }

    //Issue book
    void issueBook(int id){
        for(Book b : books){
            if(!b.isIssued){
                b.isIssued = true;
                System.out.println("Book issued successfully!");
            }else{
                System.out.println("Book is already issued.");
            }
            return;
        }
    System.out.println("Book not found!");
    }


//Return book
void returnBook(int id){
    for(Book b : books){
        if(b.id == id){
            if(b.isIssued){
                b.isIssued = false;
                System.out.println("Book returned successfully!");
            }else{
                System.out.println("Book was not issued.");
            }
            return;
        }
        System.out.println("Book not found!");
    }
}
}

public class library_management_system{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while(true) {
            System.out.println("\n====Library Management System=====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id  = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    lib.addBook(new Book(id, title, author));
                    break;

                    case 2:
                        lib.showBooks();
                        break;

                        case 3:
                            System.out.print("Enter Book ID to issue: ");
                            lib.issueBook(sc.nextInt());
                            break;

                            case 4:
                                System.out.print("Enter Book ID to return: ");
                                lib.returnBook(sc.nextInt());
                                break;

                                case 5:
                                    System.out.println("Exiting.... Goodbye!!");
                                    sc.close();
                                    return;

                                    default:
                                        System.out.println("Invalid choice!");
            }
        }
    }
}