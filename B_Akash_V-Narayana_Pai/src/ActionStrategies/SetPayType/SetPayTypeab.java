package ActionStrategies.SetPayType;

import DataStore.DataStore;
/*
This is a abstract class inherited by concret strategy classes
SetPayType1 and SetPayType2
 */
public abstract class SetPayTypeab {
    DataStore ds;

    public SetPayTypeab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void SetPayType(int t);
}
