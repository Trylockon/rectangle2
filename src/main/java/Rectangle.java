import org.apache.log4j.Logger;

import java.util.Objects;

public class Rectangle {
    private int a;
    private int b;
    private Logger logger = Logger.getLogger(Rectangle.class);

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getA() == rectangle.getA() &&
                getB() == rectangle.getB();
    }

    @Override
    public int hashCode() {
        return this.a*this.b+this.a*this.b;
    }

    public int getArea()
    {
        int rez = this.a*this.b;
        logger.info(rez);
        return (this.a*this.b);
    }
    public  int getPerimetre()
    {
        return  2*(this.a+this.b);
    }

}
