// Define a Circle class that extends the Shape class
public class Circle extends Shape {
    // Private instance variable to store the radius of the circle
    private double radius;

    // Default constructor sets the radius to 1.0, and inherits color and filled properties from the parent Shape class
    public Circle() {
        super(); // Call the default constructor of the parent Shape class
        this.radius = 1.0;
    }

    // Constructor that allows setting the radius, while color and filled properties are inherited from Shape
    public Circle(double radius) {
        super(); // Call the default constructor of the parent Shape class
        this.radius = radius;
    }

    // Constructor that allows setting the radius, color, and filled properties
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Call a constructor of the parent Shape class with color and filled properties
        this.radius = radius;
    }

    // Getter method to retrieve the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Setter method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Override the getArea method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override the getPerimeter method to calculate and return the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override the toString method to provide a string representation of the Circle object
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
