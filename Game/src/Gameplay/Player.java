package Gameplay;

public class Player {
    private int level;
    private int exp;
    private int coins;
    private int exp_cap;

    public Player(){
        this.level = 1;
        this.exp = 0;
        this.coins = 0;
        this.exp_cap = 250;
    }

    public Player(int level, int exp, int coins) {
        this.level = level;
        this.exp = exp;
        this.coins = coins;
        this.exp_cap = 250 * (this.level);
    }

    public void setexp(int exp) {
        this.exp = exp;
    }

    public void setcoins(int coins) {
        this.coins = coins;
    }

    public void setexp_cap(int level) {
        this.exp_cap = 250 * (level);
    }

    public void setlevel(int level) {
        this.level = level;
    }

    public int getexp() {
        return this.exp;
    }

    public int getcoins() {
        return this.coins;
    }

    public int getexp_cap() {
        return this.exp_cap;
    }

    public int getlevel() {
        return this.level;
    }
}
