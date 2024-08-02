package ActionStrategies.SetPrice;

import DataStore.DataStore;
/*
This is a concret strategy class of GasPump 1 for function
SetPrice(int g)
 */
public class SetPrice1 extends SetPriceab{
    public SetPrice1(DataStore ds) {
        super(ds);
    }
    @Override
    public void SetPrice(int g) {
        // GP1 as only 1 fuel type hence no SetPrice method
    }
}
