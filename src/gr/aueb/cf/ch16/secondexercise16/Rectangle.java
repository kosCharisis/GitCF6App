package gr.aueb.cf.ch16.secondexercise16;

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
