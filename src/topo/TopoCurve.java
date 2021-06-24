package topo;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import edu.macalester.graphics.Path;
import edu.macalester.graphics.Point;

public class TopoCurve extends Path {
    private static final int POINTS = 200;
    public TopoCurve(Point center, double radius) {
        super(
            IntStream.range(0, POINTS)
                .mapToDouble(x -> 2 * x * Math.PI / POINTS)
                .mapToObj(Point::atAngle)
                .map(p -> p.scale(radius).add(center))
                .collect(Collectors.toList()),
            true
        );
        setFilled(false);
        setStrokeColor(Color.BLACK);
    }
}
