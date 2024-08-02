package ActionStrategies.StorePrice;
import DataStore.DataStore;
import DataStore.GP_1_Data;
/*
This is a concret strategy class of GasPump 1 for function StorePrice()

 */
public class StorePrice1 extends StorePriceab{
    public StorePrice1(DataStore ds) {
        super(ds);
    }

    @Override
    public void StorePrice() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
        int a = d.get_temp_a();
        d.set_price(a);
        }
    }
}
