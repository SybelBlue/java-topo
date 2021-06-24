package topo;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Point;

public class TopoApp {
    public static final int WIDTH = 600, HEIGHT = 600;

    public static final Point
        DIMENSIONS = new Point(WIDTH, HEIGHT),
        CENTER = DIMENSIONS.scale(0.5);

    private final CanvasWindow canvas;

    public TopoApp() {
        canvas = new CanvasWindow("TopoApp", WIDTH, HEIGHT);
        canvas.add(new TopoCurve(CENTER, 50));
    }
    public static void main(String[] args) {
        new TopoApp();
    }
}