package ActionStrategies.GasPumpedMsg;
/*
This is a abstract class inherited by concret strategy classes
GasPumpedMsg1 and GasPumpedMsg2
 */
import DataStore.DataStore;

public abstract class GasPumpedMsgab {
    DataStore ds;

    public GasPumpedMsgab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void GasPumpedMsg();
}
