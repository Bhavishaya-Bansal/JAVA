public class Shape {
    // Default implementation for getPerimeter method
    double getPerimeter() {
        return 0.0;
    }

    // Default implementation for getArea method
    double getArea() {
        return 0.0;
    }
}

// Subclass Circle that extends Shape
class Circle extends Shape {
    // Fields specific to Circle
    double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getPerimeter method for Circle
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override getArea method for Circle
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test the Shape and Circle classes
class ShapeTest {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);

        // Calling methods on the Circle object
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
