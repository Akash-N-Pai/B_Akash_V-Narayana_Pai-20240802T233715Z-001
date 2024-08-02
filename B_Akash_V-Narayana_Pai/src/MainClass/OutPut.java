package MainClass;
import AbstractFactory.AbstractFactory ;
import ActionStrategies.CancelMsg.CancelMsgab;
import ActionStrategies.DisplayMenu.DisplayMenuab;
import ActionStrategies.EjectCard.EjectCardab;
import ActionStrategies.GasPumpedMsg.GasPumpedMsgab;
import ActionStrategies.PayMsg.PayMsgab;
import ActionStrategies.PrintReceipt.PrintReceiptab;
import ActionStrategies.PumpGasUnit.PumpGasUnitab;
import ActionStrategies.RejectMsg.RejectMsgab;
import ActionStrategies.ReturnCash.ReturnCashab;
import ActionStrategies.SetInitialValues.SetInitialValuesab;
import ActionStrategies.SetPayType.SetPayTypeab;
import ActionStrategies.SetPrice.SetPriceab;
import ActionStrategies.StoreCash.StoreCashab;
import ActionStrategies.StorePrice.StorePriceab;
//Code of B Akash V Narayana Pai
/*
    This class is the general output processor for the gas pump system.
    Abstract Factory design pattern is used to link the required meta Action
    Strategy Pattern is used to implement the same Meta Action
    This works By combining Strategy and Abstract Factory Design Pattern.
 */
public class OutPut {
    private AbstractFactory af;

    public OutPut(AbstractFactory af) {
        this.af = af;
    }

    public void storePrice() {
        StorePriceab storeprices = af.getStorePrices();
        storeprices.StorePrice();
    }

    public void payMsg() {
        PayMsgab paymsg = af.getPayMsg();
        paymsg.PayMsg();
    }

    public void storeCash() {
        StoreCashab storecash = af.getStoreCash();
        storecash.StoreCash();
    }

    public void displayMenu() {
        DisplayMenuab displaymenu = af.getDisplayMenu();
        displaymenu.DisplayMenu();
    }

    public void rejectMsg() {
        RejectMsgab rejectmsg = af.getRejectMsg();
        rejectmsg.RejectMsg();
    }

    public void setInitialValues() {
        SetInitialValuesab setinitialvalues = af.getSetInitialValues();
        setinitialvalues.SetInitialValues();
    }

    public void pumpGasUnit() {
        PumpGasUnitab pumpgasunit = af.getPumpGasUnit();
        pumpgasunit.PumpGasUnit();
    }

    public void gasPumpedMsg() {
        GasPumpedMsgab gaspumpedmsg = af.getGasPumpedMsg();
        gaspumpedmsg.GasPumpedMsg();
    }

    public void printReceipt() {
        PrintReceiptab printreceipt = af.getPrintReceipt();
        printreceipt.PrintReceipt();
    }

    public void cancelMsg() {
        CancelMsgab cancelmsg = af.getCancelMsg();
        cancelmsg.CancelMsg();
    }

    public void returnCash() {
        ReturnCashab returncash = af.getReturnCash();
        returncash.ReturnCash();
    }

    public void setPrice(int g) {
        SetPriceab setprice = af.getSetPrice();
        setprice.SetPrice(g);
    }

    public void setPayType(int t) {
        SetPayTypeab setW = af.getSetPayType();
        setW.SetPayType(t);
    }

    public void ejectCard() {
        EjectCardab ejectcard = af.getEjectCard();
        ejectcard.EjectCard();
    }
}


