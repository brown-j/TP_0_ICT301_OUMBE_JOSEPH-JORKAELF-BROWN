package ict301.solid.ocp;

// Abstraction
public interface Shape {
    double calculateArea();
}

package ict301.solid.ocp;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

package ict301.solid.ocp;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

package ict301.solid.ocp;

public class AreaCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

package ict301.solid.ocp;

public class MainOCP {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4, 3);
        Shape circle = new Circle(5);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Aire rectangle = " + calculator.calculateArea(rectangle));
        System.out.println("Aire cercle = " + calculator.calculateArea(circle));
    }
}
