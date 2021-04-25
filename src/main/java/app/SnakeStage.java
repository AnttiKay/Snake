package app;

import java.util.ArrayList;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class SnakeStage {
    private ArrayList<Rectangle> stage = new ArrayList<>();

    private Point2D position;
    private double rectSideLength = 0;

    public SnakeStage(double x, double y, double width, double height, int rows, int columns) {
        position = new Point2D(x, y);
        rectSideLength = Math.floor(Math.min(width / columns, height / rows)) ;

        double stageX = position.getX();
        double stageY = position.getY();
        System.out.println(rectSideLength);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                stage.add(new Rectangle(stageX, stageY, rectSideLength));
                stageX += rectSideLength ;
            }
            stageX = position.getX();
            stageY += rectSideLength;
        }
    }

    public void draw(GraphicsContext gc) {
        for (Rectangle rectangle : stage) {
            rectangle.draw(gc);
        }
    }
}
