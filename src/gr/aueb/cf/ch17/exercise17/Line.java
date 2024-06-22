package gr.aueb.cf.ch17.exercise17;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine, Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line() {

    }

    public Line(double length) {
        this.length = length;
    }

    //Copy Constructor
    public Line(Line line) {
        this.length = line.getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        Line line = (Line) super.clone();
        line.setLength(length);
        return line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }
}
