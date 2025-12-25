package ict301.solid.lsp;

public interface Shape {
    int getArea();
}

package ict301.solid.lsp;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

package ict301.solid.lsp;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

package ict301.solid.lsp;

public class MainLSP2 {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(3, 4);
        Shape square = new Square(3);

        System.out.println("Aire rectangle = " + rectangle.getArea());
        System.out.println("Aire carré = " + square.getArea());
    }
}
