import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int howManyTimesRollDice = 1000000;
        Bins bins = new Bins();
        bins.setNumDice(2);
        bins.setNumFaces(Faces.SIX);
        bins.makeBins();
        Dice dice = new Dice(2);
        for (int i = 0; i < howManyTimesRollDice; i++) {
            int value = dice.tossAndSum();
            try {
                bins.addDiceValue(value);
            } catch (NullPointerException whatTheFuck) {
                System.out.println("Null ptr due to value " + value);
            }
        }
        for (Map.Entry e : bins.getBins().entrySet()) {
             int totalValue = (int) e.getValue();
             double percent = (double) totalValue / (double) howManyTimesRollDice;
             //int stars = (int) percent;
            System.out.printf("%2s:\t %7s: %.2f %s\n",e.getKey(),e.getValue(),percent,getRow((percent - .01)*100));
        }
    }

    public static String getRow(double numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

}
