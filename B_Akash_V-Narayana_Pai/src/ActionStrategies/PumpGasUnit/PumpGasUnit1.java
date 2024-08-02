package ActionStrategies.PumpGasUnit;
/*
This is a concret strategy class of GasPump 1 for function
PumpGasUnit()
 */
import DataStore.DataStore;
import DataStore.GP_1_Data;
public class PumpGasUnit1 extends PumpGasUnitab {
    public PumpGasUnit1(DataStore ds) {
        super(ds);
    }

    @Override
    public void PumpGasUnit() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            int p = d.get_price();
            int L = d.get_L();
            L +=1;
            int total = p*L;
            d.set_L(L);
            d.set_total(total);
        }

    }
}
