package GUI.Component;

import Assets.ThemeResource;

import javax.swing.*;
import java.awt.*;

public class MenuButton extends JButton {
    public MenuButton(String text) {
        super(text);
        setBackground(ThemeResource.BROWN);
        setPreferredSize(new Dimension(250, 50));
        setMaximumSize(new Dimension(250, 50));
        setFont(ThemeResource.fingerPaintRegular(16));
    }
}
