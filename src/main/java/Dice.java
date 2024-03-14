import java.util.Random;

public class Dice {
    private Random rand = new Random();

    private int numFacesPerDie;
    private int numDice;

    // Choose number of faces and number of dice for this object
    // if you want you can use the enum Faces that I wrote
    // you don't have to though
    public Dice() {
        this.numDice = 1;
        this.numFacesPerDie = Faces.SIX.getFaces();
    }

    public Dice(int numDice) {
        this.numDice = numDice;
        this.numFacesPerDie = Faces.SIX.getFaces();
    }

    public Dice(int numDice, int numFacesPerDie) {
        this.numDice = numDice;
        this.numFacesPerDie = numFacesPerDie;
    }

    public Dice(int numDice, Faces numFaces) {
        this.numDice = numDice;
        this.numFacesPerDie = numFaces.getFaces();
    }

    public Integer tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numDice; i++) {
            sum += rand.nextInt(numFacesPerDie) + 1;
        }
        return sum;
//        return (rand.nextInt(numFacesPerDie * numDice - 1)) + numDice;
    }// This gets a value for a random dice roll (6 sided die)

    public void rollDiceXAmounts(int howManyTimesRolled){
        for(int i = 1; i <= howManyTimesRolled; i++){
            tossAndSum();
        }
    }



}
