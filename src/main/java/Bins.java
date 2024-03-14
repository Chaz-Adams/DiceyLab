import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Bins {

    private final Map<Integer, Integer> binMap;
//    private int howManyTimesRolled;
    private int numDice;
    private int numFaces;

    public Bins(Map<Integer, Integer> binMap) {
        this.binMap = new HashMap<Integer, Integer>(binMap);
    }

    public Bins(){
        this.binMap = new HashMap<Integer, Integer>();
    }

    public void setNumDice(int numDice) {
        this.numDice = numDice;
    }

    public void setNumFaces(int n) {
        this.numFaces = n;
    }

    public void setNumFaces(Faces f) {
        this.numFaces = f.getFaces();
    }

    public void makeBins(){
        Integer initialBinValue = 0;
        for(int i = numDice; i <= numDice * numFaces; i++){
            this.binMap.putIfAbsent(i, initialBinValue);
        }
//        this.binMap.get(howManyTimesRolled);
    }//this should make the amount of bins needed for the amount of die rolled

    public void addDiceValue(Integer bin){
        int value = this.binMap.get(bin);
        value++;
        this.binMap.put(bin, value);
    }

    public Map<Integer, Integer> getBins() {
        return this.binMap;
    }

}
