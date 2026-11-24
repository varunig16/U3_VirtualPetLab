// Part B

public class VirtualPetB {
   private String name;
   private int energyLevel;
   private int happinessLevel;
   private int weight;
   private int ageM;
   private int ageY;

   public VirtualPetB(String name){
     this.name = name;
     energyLevel = 0;
     happinessLevel = 0;
     weight = 5;
     ageM = 0;
     ageY = 0;
   }
   public String getName() {
     return name;
   }
   public String toString(){
     return name + "'s Information: \n" + "Energy: " + energyLevel + "\n" + "Happiness: " + happinessLevel + "\n" +
            "Weight: " + weight + "\n" + "Age: " + ageM + " months and " + ageY + " years";
   }
   public void feed(Food food) {
       energyLevel += food.getEnergyRating();
       happinessLevel += food.getHappinessRating();
       weight += food.getWeightGain();

       if (energyLevel > 10) {
           energyLevel = 10;
       }
       if (energyLevel < 0) {
           energyLevel = 0;
       }
       if (happinessLevel > 10) {
           happinessLevel = 10;
       }
       if (happinessLevel < 10) {
           happinessLevel = 0;
       }
   }
   public boolean play(Game game){
       weight -= game.getWeightDecr();

       if(weight < 5){
           weight = 5;
       }

       boolean won = game.isWinner();

       if(won){
           happinessLevel += game.getHappinessIncr();
       }
       else{
           happinessLevel -= game.getHappinessIncr();
       }

       if(happinessLevel > 10){
           happinessLevel = 10;
       }
       if(happinessLevel < 10){
           happinessLevel = 0;
       }

       return won;
   }
}