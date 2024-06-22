package gr.aueb.cf.ch17.exercise17;

import gr.aueb.cf.ch16.firstexercise16.AbstractShape;

public class Rectangle extends AbstractShape implements IRectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return 2 * ((long) width + (long) height);
    }
}
