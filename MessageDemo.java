public class MessageDemo {
    interface Messaging {
        public String getMessage();
        public void print();
        public String getRecipient();

        default void printConnection() {
            System.out.println("connection is successful");
        }
    }
    static class EmailMessage implements Messaging {

        public String getMessage() {
            return "This is an email message.";
        }

        public void print() {
            System.out.println(getMessage());
        }

        public String getRecipient() {
            return "biddya@gmail.com";
        }
    }
  public static void main(String[] args) {
        Messaging message = new EmailMessage(); 

        message.printConnection();             
        message.print();                        
        System.out.println("To: " + message.getRecipient()); 
    }
}
