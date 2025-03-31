package GUI.Component;

import javax.swing.*;
import java.awt.*;

public class FishButton extends JButton {
    public FishButton() {
        super("Fish");
        setPreferredSize(new Dimension(300, 100));
        setMaximumSize(new Dimension(300, 100));
        setBackground(new Color(184, 167, 144));
    }
}
