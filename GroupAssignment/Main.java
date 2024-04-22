public class Main {
    public static void main(String[] args) {
        // Created instances of Shape, Circle, and Rectangle in one go
        Shape shape = new Shape("Blue", true);
        Circle circle = new Circle(2.0, "Blue", false);
        Rectangle rectangle = new Rectangle(2.0, 6.0, "Green", true);

        // Display information about each shape and calculate/display area and perimeter
        displayShapeInfo("Shape", shape);
        displayShapeInfo("Circle", circle);
        displayShapeInfo("Rectangle", rectangle);
    }

    //  method to display shape information and calculate/display area and perimeter
    private static void displayShapeInfo(String label, Shape shape) {
        System.out.println(label + ": " + shape);
        System.out.println("Area of " + label + ": " + shape.getArea());
        System.out.println("Perimeter of " + label + ": " + shape.getPerimeter());
    }
}
