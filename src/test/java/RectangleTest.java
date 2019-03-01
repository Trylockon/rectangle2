import org.junit.Assert;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(2,3);

    @org.junit.Test
    public void getArea() {
        Assert.assertEquals(rectangle.getArea(),6);
    }

    @org.junit.Test
    public void getPerimetre() {
        Assert.assertEquals(rectangle.getPerimeter(),10);
    }
}