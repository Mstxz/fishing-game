package GUI.Component;

import Gameplay.Player;

import javax.swing.*;
import java.awt.event.*;

public class AdminPanel extends JPanel implements ActionListener {
    private MenuButton levelUpButton;
    private MenuButton levelDownButton;
    private MenuButton addEXPButton;
    private MenuButton addCoinButton;

    private JTextField expArea;
    private JTextField coinArea;

    private StatPanel statPanel;
    private Player player;

    public AdminPanel(Player player, StatPanel statPanel) {
        this.player = player;
        this.statPanel = statPanel;
        levelUpButton = new MenuButton("Level Up");
        levelDownButton = new MenuButton("Level Down");
        addEXPButton = new MenuButton("Add EXP");
        addCoinButton = new MenuButton("Add Coin");

        expArea = new JTextField();
        coinArea = new JTextField();

        add(levelUpButton);
        add(levelDownButton);
        add(addEXPButton);
        add(expArea);

        add(addCoinButton);
        add(coinArea);

        levelUpButton.addActionListener(this);
        levelDownButton.addActionListener(this);
        addEXPButton.addActionListener(this);
        addCoinButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == levelUpButton) {
            player.setlevel(player.getlevel() + 1);
            player.setexp_cap(player.getlevel());
            statPanel.setLevelLabel(player.getlevel());
            statPanel.setExpLabel(player.getexp(), player.getexp_cap());
        }
        if (e.getSource() == levelDownButton) {
            if (player.getlevel() > 1) {
                player.setlevel(player.getlevel() - 1);
            }
            player.setexp_cap(player.getlevel());
            statPanel.setLevelLabel(player.getlevel());
            statPanel.setExpLabel(player.getexp(), player.getexp_cap());
        }
        if (e.getSource() == addEXPButton) {
            player.setexp(player.getexp() + Integer.parseInt(expArea.getText()));
            statPanel.setExpLabel(player.getexp(), player.getexp_cap());
            expArea.setText("");
            if (player.getexp() > player.getexp_cap()) {
                player.setexp(player.getexp() - player.getexp_cap());
                player.setlevel(player.getlevel() + 1);
                statPanel.setLevelLabel(player.getlevel());
                statPanel.setExpLabel(player.getexp(), player.getexp_cap());
            }
        }
        if (e.getSource() == addCoinButton) {
            player.setcoins(player.getcoins() + Integer.parseInt(coinArea.getText()));
            statPanel.setCoinLabel(player.getcoins());
            coinArea.setText("");
        }
    }
}
