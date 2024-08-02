package ActionStrategies.SetPrice;

import DataStore.DataStore;
import DataStore.GP_2_Data;
/*
This is a concret strategy class of GasPump 2 for function
SetPrice(int g)
 */
public class SetPrice2 extends SetPriceab{
    public SetPrice2(DataStore ds) {
        super(ds);
    }
    @Override
    public void SetPrice(int g) {
        GP_2_Data d = (GP_2_Data) ds;
        if (d != null) {
            if (g == 1){
                float rprice = d.get_RPrice();
                d.set_price(rprice);
            }
            else if (g == 2){
                float pprice = d.get_PPrice();
                d.set_price(pprice);
            }
            else if (g == 3){
                float dprice = d.get_DPrice();
                d.set_price(dprice);
            }
        }
    }
}
