package ActionStrategies.ReturnCash;
import DataStore.DataStore;
import DataStore.GP_2_Data;
/*
This is a concret strategy class of GasPump 2 for function
ReturnCash()
 */
public class ReturnCash2 extends ReturnCashab {
    public ReturnCash2(DataStore ds) {
        super(ds);
    }

    @Override
    public void ReturnCash() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
         float t = d.get_total();
         float cash = d.get_cash();
         float ca = cash - t;
            System.out.println("****Please Take The Change*****");
            System.out.println(" Your Cash Return is " + ca +"$");
        }
    }
}

