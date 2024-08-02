package AbstractFactory;

import ActionStrategies.CancelMsg.CancelMsgab;
import ActionStrategies.CancelMsg.CancelMsg2;
import ActionStrategies.DisplayMenu.DisplayMenuab;
import ActionStrategies.DisplayMenu.DisplayMenu2;
import ActionStrategies.EjectCard.EjectCardab;
import ActionStrategies.EjectCard.EjectCard2;
import ActionStrategies.GasPumpedMsg.GasPumpedMsgab;
import ActionStrategies.GasPumpedMsg.GasPumpedMsg2;
import ActionStrategies.PayMsg.PayMsgab;
import ActionStrategies.PayMsg.PayMsg2;
import ActionStrategies.PrintReceipt.PrintReceiptab;
import ActionStrategies.PrintReceipt.PrintReceipt2;
import ActionStrategies.PumpGasUnit.PumpGasUnitab;
import ActionStrategies.PumpGasUnit.PumpGasUnit2;
import ActionStrategies.RejectMsg.RejectMsgab;
import ActionStrategies.RejectMsg.RejectMsg2;
import ActionStrategies.ReturnCash.ReturnCashab;
import ActionStrategies.ReturnCash.ReturnCash2;
import ActionStrategies.SetInitialValues.SetInitialValuesab;
import ActionStrategies.SetInitialValues.SetInitialValues2;
import ActionStrategies.SetPayType.SetPayTypeab;
import ActionStrategies.SetPayType.SetPayType2;
import ActionStrategies.SetPrice.SetPriceab;
import ActionStrategies.SetPrice.SetPrice2;
import ActionStrategies.StoreCash.StoreCashab;
import ActionStrategies.StoreCash.StoreCash2;
import ActionStrategies.StorePrice.StorePriceab;
import ActionStrategies.StorePrice.StorePrice2;
import DataStore.GP_2_Data;
import DataStore.DataStore;
//Code of B Akash V Narayana Pai
/*
This class picks the instances related to Gas Pump 2 of the required
strategy class and returns it to Output class and pics the required
DataStore class and returns where ever needed.
 */
public class GPFactory2 extends AbstractFactory {
    private DataStore ds;

    public GPFactory2() {
        ds = new GP_2_Data();
    }

    @Override
    public DataStore getData() {
        return ds;
    }

    @Override
    public StorePriceab getStorePrices() {
        return new StorePrice2(ds);
    }

    @Override
    public PayMsgab getPayMsg() {
        return new PayMsg2();
    }

    @Override
    public StoreCashab getStoreCash() {
        return new StoreCash2(ds);
    }

    @Override
    public DisplayMenuab getDisplayMenu() {
        return new DisplayMenu2(ds);
    }

    @Override
    public RejectMsgab getRejectMsg() {
        return new RejectMsg2();
    }

    @Override
    public SetPriceab getSetPrice() {
        return new SetPrice2(ds);
    }

    @Override
    public SetInitialValuesab getSetInitialValues() {
        return new SetInitialValues2(ds);
    }

    @Override
    public PumpGasUnitab getPumpGasUnit() {
        return new PumpGasUnit2(ds);
    }

    @Override
    public GasPumpedMsgab getGasPumpedMsg() {
        return new GasPumpedMsg2(ds);
    }

    @Override
    public PrintReceiptab getPrintReceipt() {
        return new PrintReceipt2(ds);
    }

    @Override
    public CancelMsgab getCancelMsg() {
        return new CancelMsg2();
    }

    @Override
    public ReturnCashab getReturnCash() {
        return new ReturnCash2(ds);
    }

    @Override
    public SetPayTypeab getSetPayType() {
        return new SetPayType2(ds);
    }

    @Override
    public EjectCardab getEjectCard() {
        return new EjectCard2();
    }
}
