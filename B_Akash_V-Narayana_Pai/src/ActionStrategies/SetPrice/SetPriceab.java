package ActionStrategies.SetPrice;

import DataStore.DataStore;
/*
This is a abstract class inherited by concret strategy classes SetPrice1
and SetPrice
 */
public abstract class SetPriceab {
    DataStore ds;

    public SetPriceab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void SetPrice(int g);
}
