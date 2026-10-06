package Rollenspiel1;

/**
 *
 * @author Jmania
 */
public class Wuerfel {
    private double anzahlSeiten;
    
    public Wuerfel(int anzahlSeiten){
        this.anzahlSeiten = anzahlSeiten + 1;
        
    }
    public int wuerfeln(){
        int random = (int) ((anzahlSeiten * Math.random()));
        System.out.println(random);
        return random;
            
        
    }
}
