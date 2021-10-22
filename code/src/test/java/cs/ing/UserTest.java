package cs.ing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {
    @Test
    public void TestConstructor() {
        User u = new User(5);
        Assert.assertEquals(u.getId(), 5);
    }
}
