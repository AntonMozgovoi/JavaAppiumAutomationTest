import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber()
    {
        MainClass Number = new MainClass();
        int result = Number.getClassNumber();
        Assert.assertTrue("метод getClassNumber возвращает число не больше 45",result > 45);
    }
}
