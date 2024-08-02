package ActionStrategies.SetInitialValues;

import DataStore.DataStore;
import DataStore.GP_1_Data;
/*
This is a concret strategy class of GasPump 1 for function
SetInitialValues()
 */
public class SetInitialValues1 extends SetInitialValuesab {
    public SetInitialValues1(DataStore ds) {
        super(ds);
    }

    @Override
    public void SetInitialValues() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            d.set_L(0);
            d.set_total(0);
        }
    }
}