package GUI;

import Assets.ThemeResource;
import GUI.Component.AdminPanel;
import GUI.Component.FishButton;
import GUI.Component.MenuButton;
import GUI.Component.StatPanel;
import Gameplay.Biome.Biome;
import Gameplay.Player;

import javax.swing.*;
import java.awt.*;

public class GamePage extends JPanel {
    private AdminPanel adminPanel;
    private JPanel playZone;
    private JPanel topPanel;
    private StatPanel statPanel;

    private JLabel GameName;

    private FishButton fishButton;
    private FishButton sellButton;

    private Player player;

    private Biome biome;
    public GamePage() {
        player = new Player();
        setLayout(new BorderLayout());
        setBackground(new Color(143, 203, 214));

        fishButton = new FishButton("Fish");
        sellButton = new FishButton("Sell");

        GameName = new JLabel("Virtual Fishing");
        GameName.setFont(ThemeResource.rubikPuddlesRegular(96));
        GameName.setForeground(Color.WHITE);

        topPanel = new JPanel();
        topPanel.setBackground(ThemeResource.TRANSPARENT);
        topPanel.add(GameName);

        playZone = new JPanel();
        playZone.setBackground(ThemeResource.TRANSPARENT);
        
        statPanel = new StatPanel(player);

        adminPanel = new AdminPanel(player, statPanel);
        adminPanel.setLayout(new BoxLayout(adminPanel, BoxLayout.Y_AXIS));


        add(topPanel, BorderLayout.NORTH);
        add(adminPanel, BorderLayout.WEST);
        add(statPanel,BorderLayout.EAST);
        add(playZone, BorderLayout.SOUTH);

        playZone.add(fishButton, BorderLayout.WEST);
        playZone.add(sellButton, BorderLayout.EAST);
    }


}
