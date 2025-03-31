import GUI.GamePage;

import javax.swing.*;
import java.awt.*;

public class MainGame extends JFrame {

    public MainGame() {
        /*Setuo*/
        setTitle("Virtual Fishing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setResizable(false);

        add(new GamePage());




        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGame();
    }
}
