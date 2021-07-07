import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() {
        Assert.assertEquals(true, new Controller().test());
    }
}