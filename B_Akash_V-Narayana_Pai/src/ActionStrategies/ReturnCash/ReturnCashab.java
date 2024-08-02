package ActionStrategies.ReturnCash;
/*
This is a abstract class inherited by concret strategy classes
ReturnCash1 and ReturnCash2
 */
import DataStore.DataStore;

public abstract class ReturnCashab {
    DataStore ds;

    public ReturnCashab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void ReturnCash();
}
