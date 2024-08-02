package ActionStrategies.PrintReceipt;
/*
This is a concret strategy class of GasPump 2 for function
PrintRecipt()
 */
import DataStore.DataStore;
import DataStore.GP_2_Data;

public class PrintReceipt2 extends PrintReceiptab {
    public PrintReceipt2(DataStore ds) {
        super(ds);
    }

    @Override
    public void PrintReceipt() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            System.out.println("****************RECEIPT********************");
            System.out.println(" Total Price: " + d.get_total() + " $ Total Gas:" + d.get_G() +"Gallons");
        }
    }
}
