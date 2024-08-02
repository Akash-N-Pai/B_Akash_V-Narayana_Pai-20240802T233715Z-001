package ActionStrategies.StorePrice;
import DataStore.DataStore;
import DataStore.GP_2_Data;

/*
This is a concret strategy class of GasPump 2 for function StorePrice()
 */
public class StorePrice2 extends StorePriceab{
    public StorePrice2(DataStore ds) {
        super(ds);
    }

    @Override
    public void StorePrice() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            float a = d.get_temp_a();
            float b = d.get_temp_b();
            float c = d.get_temp_c();
            d.set_RPrice(a);
            d.set_PPrice(b);
            d.set_DPrice(c);
        }
    }
}
