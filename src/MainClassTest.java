import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassString() {
        MainClass text = new MainClass();
        String result = text.getClassString();
        boolean containsHello = result.contains("Hello") || result.contains("hello");
        Assert.assertTrue("метод getClassString не возвращает строку, в которой есть подстрока “hello” или “Hello”", containsHello);
    }
}
