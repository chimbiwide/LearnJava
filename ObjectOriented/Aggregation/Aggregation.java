package ObjectOriented.Aggregation;

public class Aggregation {
    public static void main(String[] args) {

        //Aggregation = Represents a "has-a" relationship between objects
        //              One object contains another object as part of its structure
        //              but the contained object/s can exist independently

        Book book1 = new Book("Lord of the Flies", 324);
        Book book2 = new Book("The Witcher", 596);
        Book book3 =  new Book("Heretics and Heroes", 358);

        Book[] books = {book1, book2, book3};

        Library library =  new Library("The Grand Archives", 1052, books);
        library.displayInfo();
    }
}
