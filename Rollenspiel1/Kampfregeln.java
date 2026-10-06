package Rollenspiel1;



public class Kampfregeln {
    //private Wuerfel W6;

    public Kampfregeln() {
        //W6 = new Wuerfel(6);
    }

    public void kampf(Held k1, Monster k2) {
        if (k2.getHpM() / k1.getDmg() < k1.getHp() / k2.getHpM()) {
            System.out.println("Held gewinnt");
        } else if (k2.getHpM() / k1.getDmg() > k1.getHp() / k2.getHpM()) {
            System.out.println("Monster gewinnt");
        } else {
            System.out.println("Alle sterben");
            
        }
    }


}
