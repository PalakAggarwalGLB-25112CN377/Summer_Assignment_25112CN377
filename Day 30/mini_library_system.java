import java.util.Scanner;

public class mini_library_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String books[] = new String[10];
        int count = 0;
        int choice;

        while(true){
            System.out.println("\n===MINI LIBRARY SYSTEM===");
            System.out.println("1. Add Book");
            System.err.println("2. Display Books");
            System.out.println("3. Search Books");
            System.out.println("4. Exit");
            System.err.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    if(count<books.length){
                        System.out.print("Enter book name: ");
                        books[count] = sc.nextLine();
                        count++;
                        System.out.println("Book added sucessfully!");

                    }else{
                        System.out.println("Library is full!");
                    }
                    break;
                    
                    case 2:
                        System.out.println("\nAvailable Books:");
                        if(count == 0){
                            System.out.println("No books available .");
                        }else{
                            for(int i=0 ; i<count ; i++){
                                System.out.println((i + 1) + ". " + books[i]);

                            }
                        }
                        break;
                        
                        case 3:
                            System.out.print("Enter book name to search: ");
                            String search = sc.nextLine();
                            boolean found = false;
                            for(int i=0; i<count ; i++){
                                if(books[i].equalsIgnoreCase(search)){
                                    System.out.println("Book found : " +books[i]);
                                    found = true;
                                    break;
                                }
                            }
                            if(!found){
                                System.out.println("Book not found.");
                            }
                            break;

                            case 4:
                                System.out.println("Exiting program.....");
                                sc.close();
                                return;

                                default:
                                    System.out.println("Inavalid choice!");
            }
        }
        
    }
}

