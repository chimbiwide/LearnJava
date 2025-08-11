package ObjectOriented.Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.printf("%s was established %d years ago. \n", this.name, this.year);
        System.out.println("Books available: ");
        for (Book books : this.books){
            System.out.println(books.displayInfo());
        }
    }
}
