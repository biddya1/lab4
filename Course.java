public interface Course {
    public void printTotalWeeks();
}


abstract class First {
    abstract public void printName();     
    abstract void printCode();
}
class Subject extends First implements Course {

    @Override
    public void printName() {
        System.out.println("Programming");
    }

    @Override
    public void printCode() {
        System.out.println("CS102");
    }

    @Override
    public void printTotalWeeks() {
        System.out.println("Total weeks in first year: 32 weeks");
    }

    public static void main(String[] args) {
        Subject course = new Subject();
        course.printName();         
        course.printCode();          
        course.printTotalWeeks();  
    }
}
