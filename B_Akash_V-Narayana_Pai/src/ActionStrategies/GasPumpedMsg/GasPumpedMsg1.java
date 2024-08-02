package ActionStrategies.GasPumpedMsg;
/*
This is a concret strategy class of GasPump 1 for function
GasPumpedMsg()
 */
import DataStore.DataStore;
import DataStore.GP_1_Data;

public class GasPumpedMsg1 extends GasPumpedMsgab {
    public GasPumpedMsg1(DataStore ds) {
        super(ds);
    }

    @Override
    public void GasPumpedMsg() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            System.out.println("****************GasPumped********************");
            System.out.println(" Amount of Gas Dispensed: " + d.get_L() + "Liters. Current Total:" + d.get_total() +"$");
        }
    }
}
