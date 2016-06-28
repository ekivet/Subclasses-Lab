/**
 * Created by erickivet on 6/28/16.
 */
public class Mammal extends Animals {
    private int mWeight;

    public Mammal(int weight, String name){
        super(name);
        mWeight = weight;
    }

    public int getWeight(){
        return mWeight;
    }
}
