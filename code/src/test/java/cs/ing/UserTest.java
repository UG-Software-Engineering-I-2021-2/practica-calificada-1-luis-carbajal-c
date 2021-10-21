package cs.ing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {
    @Test//(threadPoolSize = 80, invocationCount = 10,  timeOut = 10000)
    public void TestConstructor() {
        User u = new User(5);
        Assert.assertEquals(u.getId(), 5);
    }

    @Test
    public void TestSetters() {
        User u = new User(5);
        u.setId(1);
        Assert.assertEquals(u.getId(), 1);
    }
}
