package AbstractFactory;

import ActionStrategies.CancelMsg.CancelMsgab;
import ActionStrategies.CancelMsg.CancelMsg1;
import ActionStrategies.DisplayMenu.DisplayMenuab;
import ActionStrategies.DisplayMenu.DisplayMenu1;
import ActionStrategies.EjectCard.EjectCardab;
import ActionStrategies.EjectCard.EjectCard1;
import ActionStrategies.GasPumpedMsg.GasPumpedMsgab;
import ActionStrategies.GasPumpedMsg.GasPumpedMsg1;
import ActionStrategies.PayMsg.PayMsgab;
import ActionStrategies.PayMsg.PayMsg1;
import ActionStrategies.PrintReceipt.PrintReceiptab;
import ActionStrategies.PrintReceipt.PrintReceipt1;
import ActionStrategies.PumpGasUnit.PumpGasUnitab;
import ActionStrategies.PumpGasUnit.PumpGasUnit1;
import ActionStrategies.RejectMsg.RejectMsgab;
import ActionStrategies.RejectMsg.RejectMsg1;
import ActionStrategies.ReturnCash.ReturnCashab;
import ActionStrategies.ReturnCash.ReturnCash1;
import ActionStrategies.SetInitialValues.SetInitialValuesab;
import ActionStrategies.SetInitialValues.SetInitialValues1;
import ActionStrategies.SetPayType.SetPayTypeab;
import ActionStrategies.SetPayType.SetPayType1;
import ActionStrategies.SetPrice.SetPriceab;
import ActionStrategies.SetPrice.SetPrice1;
import ActionStrategies.StoreCash.StoreCashab;
import ActionStrategies.StoreCash.StoreCash1;
import ActionStrategies.StorePrice.StorePriceab;
import ActionStrategies.StorePrice.StorePrice1;
import DataStore.GP_1_Data;
import DataStore.DataStore;
//Code of B Akash V Narayana Pai
/*
This class picks the instances related to Gas Pump 1 of the required
strategy class and returns it to Output class and pics the required
DataStore class and returns where ever needed.
 */
public class GPFactory1 extends AbstractFactory {
    private DataStore ds;

    public GPFactory1() {
        ds = new GP_1_Data();
    }

    @Override
    public DataStore getData() {
        return ds;
    }

    @Override
    public StorePriceab getStorePrices() {
        return new StorePrice1(ds);
    }

    @Override
    public PayMsgab getPayMsg() {
        return new PayMsg1();
    }

    @Override
    public StoreCashab getStoreCash() {
        return new StoreCash1(ds);
    }

    @Override
    public DisplayMenuab getDisplayMenu() {
        return new DisplayMenu1(ds);
    }

    @Override
    public RejectMsgab getRejectMsg() {
        return new RejectMsg1();
    }

    @Override
    public SetPriceab getSetPrice() {
        return new SetPrice1(ds);
    }

    @Override
    public SetInitialValuesab getSetInitialValues() {
        return new SetInitialValues1(ds);
    }

    @Override
    public PumpGasUnitab getPumpGasUnit() {
        return new PumpGasUnit1(ds);
    }

    @Override
    public GasPumpedMsgab getGasPumpedMsg() {
        return new GasPumpedMsg1(ds);
    }

    @Override
    public PrintReceiptab getPrintReceipt() {
        return new PrintReceipt1(ds);
    }

    @Override
    public CancelMsgab getCancelMsg() {
        return new CancelMsg1();
    }

    @Override
    public ReturnCashab getReturnCash() {
        return new ReturnCash1(ds);
    }

    @Override
    public SetPayTypeab getSetPayType() {
        return new SetPayType1(ds);
    }

    @Override
    public EjectCardab getEjectCard() {
        return new EjectCard1();
    }
}



