package Rollenspiel1;

public class Waffe {
   private String material;
   //private double magie;
   private double Bonus;
   
   public Waffe(String material, double magie){
       this.material = material;
       //this.magie = magie;
       bonusberechnen();
   }
   public void bonusberechnen(){
       if("Titan".equals(material)){
          Bonus = 5.0;
       }
       else if("Diamand".equals(material)){
           Bonus = 4.0;
       }
       else if("Gold".equals(material)){
           Bonus = 3.0;
       }
       else if("Eisen".equals(material)){
           Bonus = 2.0;
       }
       else{
           Bonus = 1.0;
       }
  
    }

    public double getBonus() {
        return Bonus;
    }
       
}