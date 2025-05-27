import java.util.Scanner;
public class EmailDemo {
    interface Messaging {
        public String getMessage();
        public void print();
        public String getRecipient();

        default void printConnection() {
            System.out.println("connection is successful");
        }
    }
    static class Email implements Messaging {
        Scanner scanner = new Scanner(System.in);

        public String getMessage() {
            System.out.print("Enter your email message: ");
            return scanner.nextLine();
        }

        public String getRecipient() {
            System.out.print("Enter recipient email address: ");
            return scanner.nextLine();
        }

        public void print() {
            String message = getMessage();
            String recipient = getRecipient();

            System.out.println("\nEmail Sent");
            System.out.println("To: " + recipient);
            System.out.println("Message: " + message);
        }
    }

    public static void main(String[] args) {
        Messaging email = new Email();  
        email.printConnection();        
        email.print();               
    }
}
