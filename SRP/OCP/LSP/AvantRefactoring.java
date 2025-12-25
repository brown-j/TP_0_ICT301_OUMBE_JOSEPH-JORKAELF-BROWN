package ict301.solid.lsp;

// Violation du LSP
class Rectangle {

    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

public class MainLSP {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du rectangle = " + rectangle.getArea()); // 20 attendu

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(4);
        System.out.println("Aire du carré = " + square.getArea()); // 16 obtenu ❌
    }
}
