package ActionStrategies.GasPumpedMsg;
/*
This is a concret strategy class of GasPump 2 for function
GasPumpedMsg()

 */
import DataStore.DataStore;
import DataStore.GP_2_Data;

public class GasPumpedMsg2 extends GasPumpedMsgab {
    public GasPumpedMsg2(DataStore ds) {
        super(ds);
    }

    @Override
    public void GasPumpedMsg() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            System.out.println("****************GasPumped********************");
            System.out.println(" Amount of Gas Dispensed: " + d.get_G() + "Gallons. Current Total:" + d.get_total() +"$");
        }
    }
}
