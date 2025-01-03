package HomeWork;

interface Shape {

    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }

    String getFillColor();
    String getBorderColor();
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private double a, b, c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "red", "black");
        Shape rectangle = new Rectangle(4, 6, "blue", "green");
        Shape triangle = new Triangle(3, 4, 5, "yellow", "purple");

        printShapeDetails("Circle", circle);
        printShapeDetails("Rectangle", rectangle);
        printShapeDetails("Triangle", triangle);
    }

    private static void printShapeDetails(String shapeName, Shape shape) {
        System.out.println(shapeName + ":");
        System.out.println("  Perimeter: " + shape.calculatePerimeter());
        System.out.println("  Area: " + shape.calculateArea());
        System.out.println("  Fill Color: " + shape.getFillColor());
        System.out.println("  Border Color: " + shape.getBorderColor());
        System.out.println();
    }
}