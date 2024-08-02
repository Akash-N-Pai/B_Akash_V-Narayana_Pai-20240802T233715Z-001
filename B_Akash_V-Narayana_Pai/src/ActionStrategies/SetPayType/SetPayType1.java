package ActionStrategies.SetPayType;

import DataStore.DataStore;
import DataStore.GP_1_Data;
/*
This is a concret strategy class of GasPump 1 for function
SetPayType(int w)
 */
public class SetPayType1 extends SetPayTypeab {
    public SetPayType1(DataStore ds) {
        super(ds);
    }
    @Override
    public void SetPayType(int w) {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            d.set_W(w);
        }
    }
}
