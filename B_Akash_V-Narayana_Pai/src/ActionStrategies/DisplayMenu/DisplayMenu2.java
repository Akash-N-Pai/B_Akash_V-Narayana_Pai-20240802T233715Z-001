package ActionStrategies.DisplayMenu;
import DataStore.DataStore;
import DataStore.GP_2_Data;
/*
This is a concret strategy class of GasPump 2 for function
DisplayMenu()
 */
public class DisplayMenu2 extends DisplayMenuab {
    public DisplayMenu2(DataStore ds) {
        super(ds);
    }

    @Override
    public void DisplayMenu() {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            System.out.println("*********MENU*************");
            System.out.println("Payment has been received Select Gas Type");
            System.out.println("Regular " + d.get_RPrice() + "/Gallon  ");
            System.out.println("Premium" + d.get_PPrice() + "/Gallon  ");
            System.out.println("Diesel" + d.get_DPrice() + "/ Gallon  ");
        }
    }
}
