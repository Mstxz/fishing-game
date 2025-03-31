package Assets;

import java.awt.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

public class ThemeResource {
    public static final Color BROWN = new Color(184, 167, 144);
    public static final Color TRANSPARENT = new Color(255, 255, 255, 0);

    private static final String RUBIK_PUDDLES = "src/Assets/Fonts/RubikPuddles-Regular.ttf";
    private static final String FINGERPAINT_REGULAR = "src/Assets/Fonts/FingerPaint-Regular.ttf";

    public static Font rubikPuddlesRegular(float fontSize) {
        return loadFont(RUBIK_PUDDLES, fontSize);
    }

    public static Font fingerPaintRegular(float fontSize) {
        return loadFont(FINGERPAINT_REGULAR, fontSize);
    }

    private static Font loadFont(String fontPath, float fontSize) {
        try {
            // Load the font from the file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath)).deriveFont(fontSize);

            // Register the font with the system
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont;
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return new Font("SansSerif", Font.PLAIN, (int) fontSize); // Fallback font
        }
    }
}
