package GUI;

import GUI.Component.FishButton;
import Gameplay.Biome.Biome;
import Gameplay.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePage extends JPanel implements ActionListener {
    private JPanel adminPanel;
    private JPanel statPanel;

    private JTextField expArea;
    private JTextField coinArea;

    private FishButton fishButton;
    private JButton levelUpButton;
    private JButton levelDownButton;
    private JButton addEXPButton;
    private JButton addCoinButton;

    private JLabel levelLabel;
    private JLabel expLabel;
    private JLabel coinLabel;

    private Player player;

    private Biome biome;
    public GamePage() {
        player = new Player();
        setLayout(new BorderLayout());
        setBackground(new Color(143, 203, 214));
        fishButton = new FishButton();

        adminPanel = new JPanel();
        adminPanel.setLayout(new BoxLayout(adminPanel, BoxLayout.Y_AXIS));

        levelUpButton = new JButton("Level Up");
        levelDownButton = new JButton("Level Down");
        addEXPButton = new JButton("Add EXP");
        addCoinButton = new JButton("Add Coin");

        expArea = new JTextField();
        coinArea = new JTextField();

        statPanel = new JPanel();
        statPanel.setLayout(new BoxLayout(statPanel, BoxLayout.Y_AXIS));

        levelLabel = new JLabel("Level:" + player.getlevel());
        expLabel = new JLabel("Exp:" + player.getexp() +"/"+ player.getexp_cap());
        coinLabel = new JLabel("Coin:" + player.getcoins());

        add(adminPanel, BorderLayout.WEST);
        add(statPanel, BorderLayout.EAST);

        add(fishButton, BorderLayout.SOUTH);
        adminPanel.add(levelUpButton);
        adminPanel.add(levelDownButton);
        adminPanel.add(addEXPButton);
        adminPanel.add(expArea);

        adminPanel.add(addCoinButton);
        adminPanel.add(coinArea);

        statPanel.add(levelLabel);
        statPanel.add(expLabel);
        statPanel.add(coinLabel);

        /*Add actionListener*/
        levelUpButton.addActionListener(this);
        levelDownButton.addActionListener(this);
        addEXPButton.addActionListener(this);
        addCoinButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == levelUpButton) {
            player.setlevel(player.getlevel() + 1);
            player.setexp_cap(player.getlevel());
            levelLabel.setText("Level:" + player.getlevel());
            expLabel.setText("Exp:" + player.getexp() +"/"+ player.getexp_cap());
        }
        if (e.getSource() == levelDownButton) {
            if (player.getlevel() > 1) {
                player.setlevel(player.getlevel() - 1);
            }
            player.setexp_cap(player.getlevel());
            levelLabel.setText("Level:" + player.getlevel());
            expLabel.setText("Exp:" + player.getexp() +"/"+ player.getexp_cap());
        }
        if (e.getSource() == addEXPButton) {
            player.setexp(player.getexp() + Integer.parseInt(expArea.getText()));
            expLabel.setText("Exp:" + player.getexp() +"/"+ player.getexp_cap());
            expArea.setText("");
            if (player.getexp() > player.getexp_cap()) {
                player.setexp(player.getexp() - player.getexp_cap());
                player.setlevel(player.getlevel() + 1);
                levelLabel.setText("Level:" + player.getlevel());
                expLabel.setText("Exp:" + player.getexp() +"/"+ player.getexp_cap());
            }
        }
        if (e.getSource() == addCoinButton) {
            player.setcoins(player.getcoins() + Integer.parseInt(coinArea.getText()));
            coinLabel.setText("Coin:" + player.getcoins());
            coinArea.setText("");
        }
    }
}
