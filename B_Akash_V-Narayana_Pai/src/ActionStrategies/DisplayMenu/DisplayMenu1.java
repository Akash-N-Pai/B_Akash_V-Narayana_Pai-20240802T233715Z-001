package ActionStrategies.DisplayMenu;
/*This is a concret strategy class of GasPump 1 for function
DisplayMenu()

 */
import DataStore.DataStore;
import DataStore.GP_1_Data;
public class DisplayMenu1 extends DisplayMenuab {

    public DisplayMenu1(DataStore ds) {
        super(ds);
    }

    @Override
        public void DisplayMenu() {
        GP_1_Data d = (GP_1_Data) ds;
        if (d != null) {
            System.out.println("****************MENU********************");
            System.out.println(" Payment Received price of fuel is " + d.get_price() + "/liter you can use StartPump ");
        }
    }
}

