/**
 * Created by erickivet on 6/28/16.
 */
public class Reptile extends Animals {
    private boolean mPoisonous;

    public Reptile(boolean poisonous, String name){
        super(name);
        mPoisonous = poisonous;
    }

    public boolean isItPoisonous(){
        return mPoisonous;
    }
}

