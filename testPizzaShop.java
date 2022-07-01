import javax.swing.*;
import java.awt.*;

public class testPizzaShop
{
    public static void main(String[] args)
    {
        JFrame screen = new JFrame ("Pizza Shop");
        screen.setSize (1280,720);
        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);
        screen.getContentPane().setBackground(Color.CYAN);
        new pizzaShop(screen);
    }
}
