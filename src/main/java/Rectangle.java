import org.apache.log4j.Logger;


//Developed by Kirill on the 28th of February 2019
public class Rectangle {
    private int a;
    private int b;
    private int c;
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
        logger.info("Executing toString();");
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Perimeter="+ getPerimeter() +
                ", Height="+getHeight() +
                ", Area="+ getArea() +
                ", Alpha="+getAlpha() +
                ", Beta="+getBeta() +
                ",Gama="+getGamma() +
                "Is Isosceles:" + isIsosceles()+
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
        int res = this.a*this.b;
        logger.info(res);
        return res;
    }
    public  int getPerimeter()
    {
        int res = 2*(this.a+this.b);
        logger.info(res);
        return  res;
    }
    public int getC()
    {
        int res = this.a+this.b;
        logger.info(res);
        this.c = res;
        return c;
    }
    public int getAlpha()
    {
        if(this.c == 0)
            getC();
        int res = ((this.a*this.a)+(this.c*this.c)-(this.b*this.b))/(2*this.b*this.c);
        logger.info(res);
        return res;
}
    public int getBeta()
    {
        if(this.c == 0)
            getC();
        int res = ((this.a*this.a)+(this.c*this.c)-(this.b*this.b))/(2*this.a*this.c);
        logger.info(res);
        return res;
    }
    public int getGamma()
    {
        if(this.c == 0)
            getC();
        int res = ((this.a*this.a)+(this.b*this.b)-(this.c*this.c))/(2*this.a*this.b);
        logger.info(res);
        return res;
    }
    public int getHeight()
    {
        if(this.c == 0)
            getC();
        int res = this.b / (this.c/2);
        logger.info(res);
        return res;
    }
    public boolean isIsosceles()
    {
        if(this.a==this.b) {
            logger.info("true");
            return true;
        }
        else {
            logger.info("false");
            return false;
        }
    }
}
