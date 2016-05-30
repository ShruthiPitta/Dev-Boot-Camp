import com.thoughtworks.shapes.Rectangle;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RectangleTest {

    @org.junit.Test
    public void shouldReturnCorrectArea() throws Exception {
        Rectangle rectangle = new Rectangle(10,20);
        double area = rectangle.area();
        Assert.assertEquals(200,area,0);
    }

    @org.junit.Test
    public void shouldReturnZeroAreaWhenOneOfItIsNull() throws Exception {
        Rectangle rectangle = new Rectangle(0,20);
        double area = rectangle.area();
        Assert.assertEquals(0,area,0);
    }
}