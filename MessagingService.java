import java.util.Scanner;

public class MessagingService {
    interface Messaging {
        public String getMessage();
        public void print();
        public String getRecipient();

        default void printConnection() {
            System.out.println("connection is successful");
        }
    }

    static class SMS implements Messaging {
        Scanner scanner = new Scanner(System.in);

        public String getMessage() {
            System.out.print("Enter your SMS message: ");
            return scanner.nextLine();
        }

        public String getRecipient() {
            System.out.print("Enter recipient mobile number: ");
            String number = scanner.nextLine();
            if (number.matches("\\d{10}")) {
                return number;
            } else {
                return "Invalid mobile number!";
            }
        }

        public void print() {
            String message = getMessage();
            String recipient = getRecipient();

            System.out.println("\nSMS Sent");
            System.out.println("To: " + recipient);
            System.out.println("Message: " + message);
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
        Messaging sms = new SMS();
        sms.printConnection();
        sms.print();

        System.out.println(); 

        Messaging email = new Email();
        email.printConnection();
        email.print();
    }
}
