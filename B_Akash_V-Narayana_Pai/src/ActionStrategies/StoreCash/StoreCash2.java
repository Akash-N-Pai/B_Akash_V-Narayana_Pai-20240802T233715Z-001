package ActionStrategies.StoreCash;
import DataStore.DataStore;
import DataStore.GP_2_Data;
/*
This is a concret strategy class of GasPump 2 for function
StoreCash()
 */
public class StoreCash2 extends StoreCashab{
    public StoreCash2(DataStore ds) {
        super(ds);
    }

    @Override
    public void StoreCash() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            int a = d.get_temp_ca();
            d.set_cash(a);
        }
    }
}
