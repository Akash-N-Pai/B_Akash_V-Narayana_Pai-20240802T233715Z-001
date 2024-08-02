package ActionStrategies.SetInitialValues;

import DataStore.DataStore;
/*
This is a abstract class inherited by concret strategy classes
SetInitialValues1 and SetInitialValues2
 */
public abstract class SetInitialValuesab {
    DataStore ds;

    public SetInitialValuesab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void SetInitialValues();
}
