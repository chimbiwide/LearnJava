package ObjectOriented.Constructors;

public class student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //to initiallize a constructor, type the name of the class + () + {}
    student(String name, int age, double gpa) {
        // An instance method is always called for a particular object.
        // This object is an implicit parameter for the method and is referred to with the keyword this
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    student(String name, int age , double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
    void study(){
        System.out.println(this.name + " is studying");
    }
}
