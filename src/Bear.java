/**
 * Created by erickivet on 6/28/16.
 */
public class Bear extends Mammal {
    private boolean mHibernates;

    public Bear (boolean hibernates){
        super();
        mHibernates = hibernates;
    }

    public boolean doesItHibernate(){
        return mHibernates;
    }
}

}
