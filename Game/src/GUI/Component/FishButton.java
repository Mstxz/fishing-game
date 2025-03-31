package GUI.Component;

import Assets.ThemeResource;

import javax.swing.*;
import java.awt.*;

public class FishButton extends JButton {
    public FishButton(String text) {
        super(text);
        setPreferredSize(new Dimension(300, 100));
        setMaximumSize(new Dimension(300, 100));
        setBackground(ThemeResource.BROWN);
        setFont(ThemeResource.rubikPuddlesRegular(64));
        setForeground(Color.WHITE);
    }
}
