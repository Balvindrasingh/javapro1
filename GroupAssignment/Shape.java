// Define a Shape class as the base class
public class Shape {
    // Private instance variables to store the color and whether the shape is filled
    private String color;
    private boolean filled;

    // Default constructor sets color to "Unknown" and filled to false
    public Shape() {
        this.color = "Unknown";
        this.filled = false;
    }

    // Constructor that allows setting the color and filled properties
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter method to retrieve the color of the shape
    public String getColor() {
        return color;
    }

    // Setter method to set the color of the shape
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method to check if the shape is filled
    public boolean isFilled() {
        return filled;
    }

    // Setter method to set whether the shape is filled or not
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Placeholder method for subclasses to override and calculate the area of the shape
    public double getArea() {
        return 0.0;
    }

    // Placeholder method for subclasses to override and calculate the perimeter of the shape
    public double getPerimeter() {
        return 0.0;
    }

    // Override the toString method to provide a string representation of the Shape object
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
