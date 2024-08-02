package ActionStrategies.ReturnCash;
import DataStore.DataStore;
/*
This is a concret strategy class of GasPump 1 for function
ReturnCash()
 */
public class ReturnCash1 extends ReturnCashab{
        public ReturnCash1(DataStore ds) {
            super(ds);
        }

        @Override
        public void ReturnCash() {
              //cash return method is non-existent for GP_1
    }
}
