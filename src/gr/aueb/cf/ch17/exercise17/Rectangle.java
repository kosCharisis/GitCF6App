package gr.aueb.cf.ch17.exercise17;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements IRectangle, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Copy Constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        Rectangle rectangle = (Rectangle) super.clone();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        return rectangle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(width, rectangle.width) != 0) return false;
        return Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
