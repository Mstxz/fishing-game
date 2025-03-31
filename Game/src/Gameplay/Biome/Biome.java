package Gameplay.Biome;

import java.awt.*;

public abstract class Biome {
    private String biomeName;
    private Color biomeColor;
    public Biome(String biomeName, Color biomeColor) {
        this.biomeName = biomeName;
        this.biomeColor = biomeColor;
    }
}
