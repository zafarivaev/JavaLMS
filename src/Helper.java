import java.awt.Toolkit;
import java.awt.Dimension;

public class Helper {

    static Helper shared = new Helper();

    public Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    public void print(String message) {
        System.out.println(message);
    }
}
