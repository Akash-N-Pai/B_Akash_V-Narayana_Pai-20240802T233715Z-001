package ActionStrategies.StoreCash;

import DataStore.DataStore;
/*
This is a abstract class inherited by concret strategy classes
StoreCash1 and StoreCash2
 */
public abstract class StoreCashab {
    DataStore ds;

    public StoreCashab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void StoreCash();
}
