package ActionStrategies.PrintReceipt;

/*
This is a concret strategy class of GasPump 1 for function
PrintRecipt()
 */
import DataStore.DataStore;
import DataStore.GP_1_Data;

public class PrintReceipt1 extends PrintReceiptab {
    public PrintReceipt1(DataStore ds) {
        super(ds);
    }

    @Override
    public void PrintReceipt() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            System.out.println("****************RECEIPT********************");
            System.out.println(" Total Price: " + d.get_total() +" $ ");
        }
    }
}

