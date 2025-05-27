abstract  class FirstYearCourse {
    abstract public  void printCode(); 
        public abstract void printName();

    public void printTotalWeeks() {
        System.out.println("Total weeks in first year: 32 weeks");
    }
}

 class MathCourse extends FirstYearCourse {
    @Override
    public void printName() {
        System.out.println("Course Name: Introduction to Programming");
    }

    @Override
    public void printCode() {
        System.out.println("Course Code: CS101");
    }

    public static void main(String[] args) {
        FirstYearCourse course = new MathCourse();
        course.printName();
        course.printCode();
        course.printTotalWeeks();  
    }
}
