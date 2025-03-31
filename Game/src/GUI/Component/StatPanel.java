package GUI.Component;

import Assets.ThemeResource;
import Gameplay.Player;

import javax.swing.*;
import java.awt.*;

public class StatPanel extends JPanel {
    private JLabel levelLabel;
    private JLabel expLabel;
    private JLabel coinLabel;

    private MenuButton menuButton;
    private MenuButton inventoryButton;

    public StatPanel(Player player) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(250, 200));
        setMaximumSize(new Dimension(250, 200));
        add(Box.createRigidArea(new Dimension(30, 30)));

        levelLabel = new JLabel("Level: " + player.getlevel());
        levelLabel.setFont(ThemeResource.fingerPaintRegular(24));

        expLabel = new JLabel("Exp: " + player.getexp() +"/"+ player.getexp_cap());
        expLabel.setFont(ThemeResource.fingerPaintRegular(24));

        coinLabel = new JLabel("Coin: " + player.getcoins());
        coinLabel.setFont(ThemeResource.fingerPaintRegular(24));

        menuButton = new MenuButton("Menu");
        inventoryButton = new MenuButton("Inventory");

        JLabel statsWord = new JLabel("Stats");
        statsWord.setFont(ThemeResource.fingerPaintRegular(48));
        add(statsWord);
        add(levelLabel);
        add(expLabel);
        add(coinLabel);
        add(menuButton);
        add(inventoryButton);
    }

    public void setLevelLabel(int level) {
        levelLabel.setText("Level: " + level);
    }

    public void setExpLabel(int exp, int cap) {
        expLabel.setText("Exp: " + exp +"/"+ cap);
    }

    public void setCoinLabel(int coins) {
        coinLabel.setText("Coin: " + coins);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new StatPanel(new Player()));
        frame.pack();
        frame.setVisible(true);
    }
}
