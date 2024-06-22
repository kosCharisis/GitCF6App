package gr.aueb.cf.ch17.exercise17;

public class Circle extends AbstractShape implements ICircle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public long getDiameter() {
        return 2 * (long) radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return (long) Math.PI * (long) radius * 2;
    }
}
