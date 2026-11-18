// Part A
public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageM;
    private int ageY;

    public VirtualPet(String name){
        this.name = name;
        weight = 5;
        energyLevel = 0;
        happinessLevel = 0;
        ageM = 0;
        ageY = 0;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return name + " Status: \n" + "Energy: " + energyLevel + "\n" + "Happiness: " + happinessLevel +
        "\n" + "Weight: " + weight + "\n" + "Age: " + ageM + " months and " + ageY + " years.";
    }
    public void feed(){
        if(energyLevel < 10){
            energyLevel++;
        }
        weight++;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
    public int getHappinessLevel() {
        return happinessLevel;
    }
    public void play(){
        if(happinessLevel < 10){
            happinessLevel++;
        }
        if(weight > 5){
            weight--;
        }
    }
    public void updateStatus(){
        if(energyLevel > 0){
            energyLevel--;
        }
        if(happinessLevel > 0){
            happinessLevel--;
        }
         ageM++;
        if(ageM == 12){
            ageY++;
            ageM = 0;
        }
    }
}
