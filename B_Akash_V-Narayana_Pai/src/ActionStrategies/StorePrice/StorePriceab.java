package ActionStrategies.StorePrice;

import DataStore.DataStore;
/*
This is a abstract class inherited by concret strategy classes
StorePrice1 and StorePrice2
 */
public abstract class StorePriceab {
    DataStore ds;

    public StorePriceab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void StorePrice();
}
