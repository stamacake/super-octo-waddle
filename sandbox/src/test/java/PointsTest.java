import org.testng.Assert;
import org.testng.annotations.Test;

public class PointsTest {

    @Test
    public void pointsDistanceTest1() {
        Assert.assertEquals(new Point(1., 1.).distance(new Point(1., 2.)), 1.);
    }

    @Test
    public void pointsDistanceTest2() {
        Assert.assertEquals(new Point(0., 0.).distance(new Point(3., 4.)), 5.);
    }
}
