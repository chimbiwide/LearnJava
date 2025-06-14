package Projects;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String[] questions = {
                "What is a sentinel?",
                "What does a constructor return?",
                "What is an accessor method?",
                "What is a setter method?",
                "What are instance variables?",
                "What does % do?",
                "What is scope?",
                "What is the scope of private or public?",
                "Which of the following is NOT a primitive data type in Java?",
                "What is the correct way to declare and initialize an array in Java?",
                "What happens when you attempt to access an array element outside its bounds?",
                "Which statement correctly describes Java's platform independence?",
                "In Java, what does the 'final' keyword indicate when applied to a variable?",
                "What is the correct signature of the main method in Java?",
                "What will be the output of the following code?\nint x = 5;\nSystem.out.println(x++);\nSystem.out.println(x);",
                "What is method overloading in Java?",
                "Which statement about Java packages is correct?",
                "What is the purpose of the 'this' keyword in Java?",
                "What will the following code print?\nString str1 = \"Hello\";\nString str2 = \"Hello\";\nString str3 = new String(\"Hello\");\nSystem.out.println(str1 == str2);\nSystem.out.println(str1 == str3);",
                "Which loop is guaranteed to execute at least once?",
                "Which access modifier is most restrictive in Java?",
                "What is the main purpose of the Java Virtual Machine (JVM)?",
                "Which statement about inheritance in Java is correct?",
                "What is the output of the following code?\nint a = 10;\nint b = 20;\na = a + b;\nb = a - b;\na = a - b;\nSystem.out.println(a + \" \" + b);",
                "Which data structure is represented by java.util.ArrayList?",
                "What does the 'static' keyword mean when applied to a method?",
                "Which statement about constructors is false?",
                "What will be the value of x after the following code executes?\nint x = 0;\nif (x == 0) {\n    x = 1;\n} else if (x == 1) {\n    x = 2;\n}\nif (x < 2) {\n    x = x + 1;\n}",
                "Which statement about Java Strings is correct?",
                "What is polymorphism in Java?",
                "What is the purpose of the 'super' keyword in Java?",
                "What is the correct way to handle exceptions in Java?",
                "Which statement about interfaces in Java is correct?",
                "What will be the output of the following code?\nint[] arr = {1, 2, 3, 4, 5};\nfor (int i = 0; i < arr.length; i++) {\n    if (arr[i] % 2 == 0) {\n        continue;\n    }\n    System.out.print(arr[i] + \" \");\n}",
                "What happens when a variable is declared but not initialized in Java?",
                "What is the output of System.out.println(1 + 2 + \"3\" + 4 + 5);",
                "Which collection class allows duplicate elements and maintains insertion order?",
                "What is an abstract class in Java?",
                "What is the output of the following code?\nString s = \"Hello\";\ns.concat(\" World\");\nSystem.out.println(s);",
                "Which statement about Java's garbage collection is correct?",
                "What is the purpose of the 'break' statement in a loop?",
                "Which of the following is NOT a valid Java identifier?",
                "What is autoboxing in Java?",
                "Which statement about the equals() method is correct?",
                "What is the output of the following code?\nfor (int i = 0; i < 3; i++) {\n    for (int j = 0; j < 3; j++) {\n        if (i == j) {\n            break;\n        }\n        System.out.print(i + \"\" + j + \" \");\n    }\n}",
                "What is the purpose of the 'finally' block in exception handling?",
                "Which statement about method parameters in Java is correct?",
                "What is the output of the following code?\nint x = 5;\nint y = 10;\nSystem.out.println(x > y ? \"x is greater\" : \"y is greater\");",
                "Which of the following cannot be overridden in a subclass?",
                "What is the purpose of the Java package java.util?"
        };
        //Options array
        String[][] choices = {
                // 1. What is a sentinel?
                {"A. A special value used to signal the end of input or a termination condition",
                        "B.A security feature in Java that prevents unauthorized access",
                        "C.A specialized type of exception handler",
                        "D.A method that monitors class performance"},

                // 2. What does a constructor return?
                {"A.The same data type as the class it belongs to",
                        "B.A boolean indicating successful object creation",
                        "C.The memory address of the new object",
                        "D.It doesn't return anything, but creates a new object instance"},

                // 3. What is an accessor method?
                {"A.A method that changes the state of an object",
                        "B.A method that creates new objects",
                        "C.A method that retrieves the value of a private field (getter)",
                        "D.A special method called during object destruction"},

                // 4. What is a setter method?
                {"A.A method that retrieves the value of a private field",
                        "B.A method that changes the value of a private field",
                        "C.A method that sets up the initial constructor",
                        "D.A method that establishes class inheritance"},

                // 5. What are instance variables?
                {"A.Variables declared inside methods that exist only during method execution",
                        "B.Variables that belong to a specific object and represent its state",
                        "C.Variables shared by all objects of a class",
                        "D.Temporary variables used for counting loop iterations"},

                // 6. What does % do?
                {"A.Calculate the percentage of a number",
                        "B.Return the modulus (remainder after division)",
                        "C.Convert a number to a percentage format",
                        "D.Concatenate strings with format specifiers"},

                // 7. What is scope?
                {"A.The region of code where a variable is accessible",
                        "B.The range of values a data type can hold",
                        "C.The lifetime of an object before garbage collection",
                        "D.The visibility setting of a class"},

                // 8. What is the scope of private or public?
                {"A.Private restricts access to the class itself, public allows access from any class",
                        "B.Private allows access only to subclasses, public allows access to everyone",
                        "C.Private variables exist for one method call, public variables exist for the entire program",
                        "D.Private and public determine the memory allocation size"},

                // 9. Which of the following is NOT a primitive data type in Java?
                {"A.int",
                        "B.boolean",
                        "C.String",
                        "D.char"},

                // 10. What is the correct way to declare and initialize an array in Java?
                {"A.int[5] array;",
                        "B.int array[5] = {1, 2, 3, 4, 5};",
                        "C.int[] array = new int[5];",
                        "D.array int[] = int[5];"},

                // 11. What happens when you attempt to access an array element outside its bounds?
                {"A.The program will return a null value",
                        "B.The program will throw an ArrayIndexOutOfBoundsException",
                        "C.The element will be automatically created and initialized to 0",
                        "D.The program will compile but may behave unexpectedly"},

                // 12. Which statement correctly describes Java's platform independence?
                {"A.Java programs can only run on Windows and Mac",
                        "B.Java programs are compiled directly to native machine code",
                        "C.Java source code is interpreted at runtime",
                        "D.Java code is compiled to bytecode which runs on the JVM"},

                // 13. In Java, what does the 'final' keyword indicate when applied to a variable?
                {"A.The variable will be deleted when the program ends",
                        "B.The variable cannot be changed after initialization",
                        "C.The variable can only be used in the final section of code",
                        "D.The variable is only available to final methods"},

                // 14. What is the correct signature of the main method in Java?
                {"A.public void main(String[] args)",
                        "B.public static void main()",
                        "C.public static void main(String[] args)",
                        "D.static public void main(String args)"},

                // 15. What will be the output of the following code?
                {"A.5 followed by 6",
                        "B.6 followed by 6",
                        "C.6 followed by 5",
                        "D.5 followed by 5"},

                // 16. What is method overloading in Java?
                {"A.Creating multiple methods with the same name but different parameters",
                        "B.Overriding a method from a parent class",
                        "C.Creating a method that can perform multiple operations",
                        "D.Extending the functionality of an existing method without modifying it"},

                // 17. Which statement about Java packages is correct?
                {"A.A package is a collection of similar classes only",
                        "B.Package names should start with an uppercase letter",
                        "C.The package statement must be the first statement in a Java file",
                        "D.Packages can only be imported in their entirety, not individually"},

                // 18. What is the purpose of the 'this' keyword in Java?
                {"A.To call a superclass method",
                        "B.To refer to the current object",
                        "C.To create a new instance of a class",
                        "D.To import a package"},

                // 19. What will the following code print?
                {"A.true, true",
                        "B.false, false",
                        "C.true, false",
                        "D.false, true"},

                // 20. Which loop is guaranteed to execute at least once?
                {"A.for loop",
                        "B.while loop",
                        "C.do-while loop",
                        "D.for-each loop"},

                // 21. Which access modifier is most restrictive in Java?
                {"A.public",
                        "B.protected",
                        "C.default (no modifier)",
                        "D.private"},

                // 22. What is the main purpose of the Java Virtual Machine (JVM)?
                {"A.To compile Java source code to bytecode",
                        "B.To execute bytecode on any platform with a JVM",
                        "C.To optimize Java code during development",
                        "D.To provide a graphical user interface for Java applications"},

                // 23. Which statement about inheritance in Java is correct?
                {"A.Java supports multiple inheritance through classes",
                        "B.All classes in Java inherit from the Object class",
                        "C.Private members of the parent class are inherited by child classes",
                        "D.A class can extend multiple parent classes"},

                // 24. What is the output of the following code?
                {"A.10 20",
                        "B.20 10",
                        "C.30 10",
                        "D.10 30"},

                // 25. Which data structure is represented by java.util.ArrayList?
                {"A.Linked List",
                        "B.Dynamic Array",
                        "C.Hash Table",
                        "D.Binary Tree"},

                // 26. What does the 'static' keyword mean when applied to a method?
                {"A.The method cannot be overridden",
                        "B.The method belongs to the class rather than an instance",
                        "C.The method can only be called once during program execution",
                        "D.The method cannot be changed after compilation"},

                // 27. Which statement about constructors is false?
                {"A.Constructors have the same name as the class",
                        "B.Constructors can be overloaded",
                        "C.If no constructor is defined, Java provides a default constructor",
                        "D.Constructors must have a return type specified"},

                // 28. What will be the value of x after the following code executes?
                {"A.0",
                        "B.1",
                        "C.2",
                        "D.3"},

                // 29. Which statement about Java Strings is correct?
                {"A.Strings in Java are mutable",
                        "B.String concatenation is the most efficient way to build complex strings",
                        "C.String objects are stored in a special memory area called the String Pool",
                        "D.String comparison should always be done using the == operator"},

                // 30. What is polymorphism in Java?
                {"A.The ability to create multiple methods with the same name but different parameters",
                        "B.The ability to define multiple classes with the same name",
                        "C.The ability of an object to take on many forms based on its reference type",
                        "D.The ability to hide internal details and show only functionality"},

                // 31. What is the purpose of the 'super' keyword in Java?
                {"A.To call the superclass constructor or methods",
                        "B.To access static members of a class",
                        "C.To exit the current method",
                        "D.To declare a variable with superclass scope"},

                // 32. What is the correct way to handle exceptions in Java?
                {"A.Using if-else statements to check for error conditions",
                        "B.Using try-catch blocks",
                        "C.Using the throws keyword in the main method",
                        "D.Using assert statements"},

                // 33. Which statement about interfaces in Java is correct?
                {"A.Interfaces can contain implemented methods with code",
                        "B.A class can implement only one interface",
                        "C.Interface methods are implicitly public and abstract",
                        "D.Interfaces can have instance variables"},

                // 34. What will be the output of the following code?
                {"A.1 2 3 4 5",
                        "B.2 4",
                        "C.1 3 5",
                        "D.No output"},

                // 35. What happens when a variable is declared but not initialized in Java?
                {"A.It's automatically initialized to 0 or null depending on its type",
                        "B.The compiler raises an error",
                        "C.It's initialized to a random value",
                        "D.Local variables get no default values, instance variables do"},

                // 36. What is the output of System.out.println(1 + 2 + "3" + 4 + 5);?
                {"A.15",
                        "B.33345",
                        "C.3345",
                        "D.12345"},

                // 37. Which collection class allows duplicate elements and maintains insertion order?
                {"A.HashSet",
                        "B.ArrayList",
                        "C.HashMap",
                        "D.TreeSet"},

                // 38. What is an abstract class in Java?
                {"A.A class that cannot be instantiated and may contain abstract methods",
                        "B.A class that can only contain static methods",
                        "C.A class that has no concrete implementation",
                        "D.A class that cannot be extended by other classes"},

                // 39. What is the output of the following code?
                {"A.Hello World",
                        "B.Hello",
                        "C.World",
                        "D.null"},

                // 40. Which statement about Java's garbage collection is correct?
                {"A.The programmer must explicitly delete objects when they're no longer needed",
                        "B.Garbage collection runs at fixed time intervals",
                        "C.The JVM automatically reclaims memory from objects that are no longer accessible",
                        "D.Garbage collection only works on primitive data types"},

                // 41. What is the purpose of the 'break' statement in a loop?
                {"A.To skip the current iteration and continue with the next one",
                        "B.To terminate the loop and continue execution after the loop",
                        "C.To pause the loop until a condition changes",
                        "D.To return to the beginning of the loop"},

                // 42. Which of the following is NOT a valid Java identifier?
                {"A._variable",
                        "B.$variable",
                        "C.1variable",
                        "D.variable1"},

                // 43. What is autoboxing in Java?
                {"A.Automatic conversion between primitive types and their wrapper classes",
                        "B.Automatic creation of new objects when needed",
                        "C.Automatic compression of large objects to save memory",
                        "D.Automatic casting between incompatible types"},

                // 44. Which statement about the equals() method is correct?
                {"A.It compares if two objects have the same memory address",
                        "B.It is the same as using the == operator for objects",
                        "C.Its default implementation in the Object class checks content equality",
                        "D.It should be overridden to provide meaningful comparison for custom classes"},

                // 45. What is the output of the following code?
                {"A.01 02 12",
                        "B.00 11 22",
                        "C.01 02 10 12 20 21",
                        "D.No output"},

                // 46. What is the purpose of the 'finally' block in exception handling?
                {"A.To handle exceptions that were not caught by catch blocks",
                        "B.To execute code whether an exception is thrown or not",
                        "C.To define final variables that cannot be changed",
                        "D.To determine if the program should terminate after an exception"},

                // 47. Which statement about method parameters in Java is correct?
                {"A.Primitive types are passed by reference",
                        "B.Objects are passed by value, but their internal state can be modified",
                        "C.All parameters are passed by reference",
                        "D.Java does not support passing parameters to methods"},

                // 48. What is the output of the following code?
                {"A.x is greater",
                        "B.y is greater",
                        "C.Compilation error",
                        "D.Runtime error"},

                // 49. Which of the following cannot be overridden in a subclass?
                {"A.Static methods",
                        "B.Private methods",
                        "C.Public methods",
                        "D.Both A and B"},

                // 50. What is the purpose of the Java package java.util?
                {"A.To provide utility classes for data structures and algorithms",
                        "B.To provide APIs for database access",
                        "C.To provide utility classes for GUI programming",
                        "D.To provide utility classes for network programming"}
        };
        //declare variables
        char[] answers = {
                'A', 'D', 'C', 'B', 'B', 'B', 'A', 'A', 'C', 'C',
                'B', 'D', 'B', 'C', 'A', 'A', 'C', 'B', 'C', 'C',
                'D', 'B', 'B', 'B', 'B', 'B', 'D', 'C', 'C', 'C',
                'A', 'B', 'C', 'C', 'D', 'C', 'B', 'A', 'B', 'C',
                'B', 'C', 'A', 'D', 'A', 'B', 'B', 'B', 'D', 'A'
        };

        Scanner scanner = new Scanner(System.in);
        int total_questions = questions.length;
        int score = 0;
        char choice;
        String startSeperator = "*****************";
        String endSeperator = "------------------";
        //WELCOME message
        System.out.println(startSeperator);
        System.out.println("Welcome to the Intro to Java Quiz!\n");
        System.out.println("Answer using 'A', 'B', 'C', or 'D'.'");
        System.out.println("Enter 'n' to end the quiz");
        System.out.println(endSeperator);
        //loop through questions
        for (int i = 0; i < total_questions; i++) {
            System.out.println(questions[i]);
            for (String option : choices[i]){
                System.out.println(option);
            }
            System.out.print("Enter your choice: ");
            choice = scanner.next().toUpperCase().charAt(0);
            if (choice == answers[i]){
                score++;
                System.out.println(startSeperator);
                System.out.println("Correct!");
                System.out.println(endSeperator);
            }
            else if (choice == 'N'){
                System.out.println(startSeperator);
                System.out.println("Thanks for taking the quiz!");
                System.out.println(endSeperator);
                break;
            }
            else{
                System.out.println(startSeperator);
                System.out.println("Incorrect. The correct answer is " + answers[i]);
                System.out.println(endSeperator);
            }
        }
        System.out.println("Congratulations🥳, you have completed the quiz!");
        System.out.printf("Your score is %d out of %d.\n", score, total_questions);
        //print result
        scanner.close();
    }
}
