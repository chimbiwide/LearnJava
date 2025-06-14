package ObjectOriented.Constructors;

public class Constructors {
    /*
        Constructor = A special method to initallize objects
                      You can pass arguments to a constructor
                      and set up initial values
     */
    public static void main(String[] args) {
        student student = new student("Ethan", 15, 3.7);
        student student1 = new student("Zannder", 14, 2.5);
        student student2 = new student("Ayan", 13, 3.99, false);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        System.out.println(student.isEnrolled);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student.study();
        student2.study();
        student1.study();
    }
}
