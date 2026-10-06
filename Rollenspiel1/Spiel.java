package Rollenspiel1;

public class Spiel {


    public static void main(String[] args) {
        Waffe W1 = new Waffe("Eisen", 1);
        Held k1 = new Held("Jadon",1,3,20,W1);
        Monster k2 = new Monster(20,2);
        Kampfregeln K = new Kampfregeln();
        K.kampf(k1, k2);
        Wuerfel W6 = new Wuerfel(6);
        W6.wuerfeln();
       
    }
    
}