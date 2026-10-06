package Rollenspiel1;

/**
 *
 * @author Jmania
 */
public class Monster {
    private double dmgM;
    private double hpM;

    public Monster(double dmgM, double hpM) {
        this.dmgM = dmgM;
        this.hpM = hpM;
    }

    public double getDmgM() {
        return dmgM;
    }

    public double getHpM() {
        return hpM;
    }
}