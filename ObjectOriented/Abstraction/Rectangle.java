package ObjectOriented.Abstraction;

public class Rectangle extends Shape {

    double width;
    double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    double area() {
        return this.width * this.length;
    }
}
