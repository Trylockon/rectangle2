import org.junit.Assert;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(2,3);

    @org.junit.Test
    public void getArea() {
        Assert.assertEquals(rectangle.getArea(),6);
    }

    @org.junit.Test
    public void getPerimeter() {
        Assert.assertEquals(rectangle.getPerimeter(),10);
    }

    @org.junit.Test
    public void getC() {
        Assert.assertEquals(rectangle.getC(), 5);
    }

    @org.junit.Test
    public void getAlpha() {
        Assert.assertEquals(rectangle.getAlpha(), 0);
    }

    @org.junit.Test
    public void getBeta(){
        Assert.assertEquals(rectangle.getBeta(), 1);
    }

    public void getGamma(){
        Assert.assertEquals(rectangle.getGamma(), 1);
    }

    @org.junit.Test
    public void isIsosceles(){
        Assert.assertEquals(rectangle.isIsosceles(), false);
    }

    @org.junit.Test
    public void getHeight(){
        Assert.assertEquals(rectangle.getHeight(), 1);
    }
}