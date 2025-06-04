import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber()
    {
        MainClass Number = new MainClass();
        int result = Number.getLocalNumber();
        Assert.assertTrue("метод getLocalNumber не возвращает число 14",result == 14);
    }
}
