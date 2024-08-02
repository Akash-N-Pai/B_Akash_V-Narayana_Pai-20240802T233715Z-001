package ActionStrategies.PumpGasUnit;
/*
This is a concret strategy class of GasPump 2 for function
PumpGasUnit()
 */
import DataStore.DataStore;
import DataStore.GP_2_Data;
public class PumpGasUnit2 extends PumpGasUnitab {
    public PumpGasUnit2(DataStore ds) {
        super(ds);
    }

    @Override
    public void PumpGasUnit() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
           float p = d.get_price();
           int G = d.get_G();
           G +=1;
           float total = p*G;
           d.set_G(G);
           d.set_total(total);
        }

    }
}
