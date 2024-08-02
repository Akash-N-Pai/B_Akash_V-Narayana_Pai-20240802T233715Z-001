package ActionStrategies.StoreCash;
import DataStore.DataStore;
import DataStore.GP_1_Data;

/*
This is a concret strategy class of GasPump 1 for function StoreCash()
 */
public class StoreCash1 extends StoreCashab{
    public StoreCash1(DataStore ds) {
        super(ds);
    }

    @Override
    public void StoreCash() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            int a = d.get_temp_ca();
            d.set_cash(a);
        }
    }
}
