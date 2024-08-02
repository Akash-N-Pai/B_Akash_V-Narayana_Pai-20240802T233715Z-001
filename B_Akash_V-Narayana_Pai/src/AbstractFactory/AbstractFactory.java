package AbstractFactory;
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
import DataStore.DataStore;
//Code of B Akash V Narayana Pai
/*  Abstract Factory Pattern with OutPut class being the main class
    this abstract superclass is used to group each of the concrete factory class of both the Gas Pumps
 */
public abstract class AbstractFactory {
    // Retrieve data storage object
    public abstract DataStore getData();

    // Retrieve store prices strategy
    public abstract StorePriceab getStorePrices();

    // Retrieve payment message strategy
    public abstract PayMsgab getPayMsg();

    // Retrieve store cash strategy
    public abstract StoreCashab getStoreCash();

    // Retrieve display menu strategy
    public abstract DisplayMenuab getDisplayMenu();

    // Retrieve reject message strategy
    public abstract RejectMsgab getRejectMsg();

    // Retrieve set prices strategy
    public abstract SetPriceab getSetPrice();

    // Retrieve initial values setting strategy
    public abstract SetInitialValuesab getSetInitialValues();

    // Retrieve pump gas unit strategy
    public abstract PumpGasUnitab getPumpGasUnit();

    // Retrieve gas pumped message strategy
    public abstract GasPumpedMsgab getGasPumpedMsg();

    // Retrieve print receipt strategy
    public abstract PrintReceiptab getPrintReceipt();

    // Retrieve cancel message strategy
    public abstract CancelMsgab getCancelMsg();

    // Retrieve return cash strategy
    public abstract ReturnCashab getReturnCash();

    // Retrieve set pay type strategy
    public abstract SetPayTypeab getSetPayType();

    // Retrieve eject card strategy
    public abstract EjectCardab getEjectCard();
}
