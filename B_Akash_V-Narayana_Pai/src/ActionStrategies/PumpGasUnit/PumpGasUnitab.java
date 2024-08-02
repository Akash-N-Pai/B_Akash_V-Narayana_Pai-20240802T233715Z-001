package ActionStrategies.PumpGasUnit;
/*
This is a abstract class inherited by concret strategy classes
PumpGasUnit1 and PumpGasUnit2
 */
import DataStore.DataStore;

public abstract class PumpGasUnitab {
    DataStore ds;

    public PumpGasUnitab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void PumpGasUnit();
}
