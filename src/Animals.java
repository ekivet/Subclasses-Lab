/**
 * Created by erickivet on 6/28/16.
 */
public class Animals {
    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animals(){
        mNumLegs = 4;
        mTopSpeed = 0 ;
        mIsEndangered = false;
        mName = "turtle";
    }
    public Animals(String name){
        mName = name;
    }

    public Animals (int numLegs, String name){
        mNumLegs = numLegs;
        mName = name;
    }
}
