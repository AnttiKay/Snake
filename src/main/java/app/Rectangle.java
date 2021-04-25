package app;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle {

    private double x, y;
    private double sideLength;

    public Rectangle(double x, double y, double sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
        System.out.println("x: " + this.x + " y: " + this.y);
    }

    public void draw(GraphicsContext gc) {

        gc.rect(x, y, x + sideLength, y + sideLength);

    }

}
