/**
 * Created by erickivet on 6/28/16.
 */
public class Lizard extends Reptile {
    private boolean mChangesColors;

    public Lizard (boolean changesColors){
        super();
        mChangesColors = changesColors;
    }

    public boolean doesItChangeColors(){
        return mChangesColors;
    }
}