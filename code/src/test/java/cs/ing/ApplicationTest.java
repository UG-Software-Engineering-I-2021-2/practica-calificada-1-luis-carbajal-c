package cs.ing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationTest {
    @Test
    public void TestMain() {
        Main.main(new String[0]);
    }

    @Test
    public void TestUser() {
        User u = new User(2);
        Assert.assertEquals(u.getId(), 2);
    }
}
