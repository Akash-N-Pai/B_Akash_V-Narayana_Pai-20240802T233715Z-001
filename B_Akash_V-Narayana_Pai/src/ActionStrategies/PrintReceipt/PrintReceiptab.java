package ActionStrategies.PrintReceipt;
/*
This is a abstract class inherited by concret strategy classes
PrintRecipt1 and PrintRecipt2
 */
import DataStore.DataStore;

public abstract class PrintReceiptab {
    DataStore ds;

    public PrintReceiptab(DataStore ds) {
        this.ds = ds;
    }
    public abstract void PrintReceipt();
}
