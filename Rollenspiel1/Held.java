package Rollenspiel1;


public class Held {
    private String name;
    private int staerke;
    private double dmg;
    private double hp;
    private Waffe W1;
    
    public Held(String name, int staerke, double dmg, double hp, Waffe W1){
    this.name = name;
    this.staerke = staerke;
    this.dmg = dmg * W1.getBonus();
    this.hp = hp;
    this.W1 = W1;
    }

    public void angreifen(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public Waffe getW1() {
        return W1;
    }

    public void setW1(Waffe W1) {
        this.W1 = W1;
    }
}
