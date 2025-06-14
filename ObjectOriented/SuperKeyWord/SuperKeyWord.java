package ObjectOriented.SuperKeyWord;

public class SuperKeyWord {
    public static void main (String[] args){

        //super = Refers to the parent class (subclass <- superclass)
        //        used in constructors and method overriding
        //        Calls the parent constructor to initialize attributes
        //        Super refers to the parent class/superclass

        Person person = new Person("Rudra", "Vyas");
        person.showName();

        Student student = new Student("Rudra", "Vyas", 2.7);
        student.showName();
        student.showGPA();

        Employee employee = new Employee("Dave", "Christie", 3000);
        employee.showSalary();
    }
}
