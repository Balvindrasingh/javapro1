// Define a Rectangle class that extends the Shape class
public class Rectangle extends Shape {
    // Private instance variables to store the width and height of the rectangle
    private double width;
    private double height;

    // Default constructor sets the width and height to 1.0, and inherits color and filled properties from the parent Shape class
    public Rectangle() {
        super(); // Call the default constructor of the parent Shape class
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor that allows setting the width and height, while color and filled properties are inherited from Shape
    public Rectangle(double width, double height) {
        super(); // Call the default constructor of the parent Shape class
        this.width = width;
        this.height = height;
    }

    // Constructor that allows setting the width, height, color, and filled properties
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled); // Call a constructor of the parent Shape class with color and filled properties
        this.width = width;
        this.height = height;
    }

    // Getter method to retrieve the width of the rectangle
    public double getWidth() {
        return width;
    }

    // Setter method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method to retrieve the height of the rectangle
    public double getHeight() {
        return height;
    }

    // Setter method to set the height of the rectangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Override the getArea method to calculate and return the area of the rectangle
    @Override
    public double getArea() {
        return width * height;
    }

    // Override the getPerimeter method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Override the toString method to provide a string representation of the Rectangle object
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", height=" + height + "]";
    }
}
