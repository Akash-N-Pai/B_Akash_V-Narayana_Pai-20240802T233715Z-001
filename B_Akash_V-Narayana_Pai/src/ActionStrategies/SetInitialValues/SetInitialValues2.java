package ActionStrategies.SetInitialValues;

import DataStore.DataStore;
import DataStore.GP_2_Data;
/*
This is a concret strategy class of GasPump 2 for function
SetInitialValues()
 */
public class SetInitialValues2 extends SetInitialValuesab {
    public SetInitialValues2(DataStore ds) {
        super(ds);
    }

    @Override
    public void SetInitialValues() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            d.set_G(0);
            d.set_total(0);
        }
    }
}