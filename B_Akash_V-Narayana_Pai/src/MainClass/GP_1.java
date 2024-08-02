package MainClass;
import DataStore.GP_1_Data;
import DataStore.DataStore;
import AbstractFactory.AbstractFactory;
import AbstractFactory.GPFactory1;
//Code of B Akash V Narayana Pai
//InputProcessor class for GasPump1

public class GP_1 {
    private static DataStore ds;
    private static MDAEFSM m;
    private static GP_1_Data d;

    public GP_1() {/*
        constructor to get reference of Abstract Factory class of Gas Pump1
        using Abstract Factory reference DataStore reference is loaded to ds
        m holds the reference to MDAEFSM Class
        d holds the reference to Data Class of Gas Pump 1 Class
          */
        AbstractFactory af = new GPFactory1();
        ds = af.getData();
        m = new MDAEFSM();
        m.setOP(new OutPut(af));
        d = (GP_1_Data) ds;
    }

    public void Activate(int a) {
        if (a > 0) { // temporary store of fuel price
            d.set_temp_a(a);
            m.activate();//Call the activate() meta-event of the MDAEFSM class
        } else {
            System.out.println("Enter the valid Price of Fuel");
        }
    }

    public void Start() {
        m.start();//Call the start() meta-event of the MDAEFSM class
    }

    public void PayCredit() {
        m.payType(1);//Call the payType(1) meta-event of the MDAEFSM class
    }

    public void Reject() {//Call the reject() meta-event of the MDAEFSM class
        m.reject();
    }

    public void Cancel() {//Call the cancel() meta-event of the MDAEFSM class
        m.cancel();
    }

    public void Approved() {//Call the approve() meta-event of the MDAEFSM class
        m.approve();
    }

    public void PayCash(int ca) {
        GP_1_Data d = (GP_1_Data) ds;
        if (ca > 0) {// temporary store of cash
            d.set_temp_ca(ca);
            m.payType(2);//Call the payType(2) meta-event of the MDAEFSM class
        } else {
            System.out.println("Enter valid cash amount");
        }
    }

    public void StartPump() {
        if (d.get_price() > 0) {
            m.Continue();//Call the Continue() meta-event of the MDAEFSM class
            m.startPump();//Call the startPump() meta-event of the MDAEFSM class
        }
    }

    public void Pump() {
        GP_1_Data d = (GP_1_Data) ds;
        int cash = d.get_cash();
        int price = d.get_price();
        int li = d.get_L();
        int W = d.get_W();

        // based on the output of if condition the further classes are executed

        if ((W == 2) && cash < price * (li + 1)) {
            System.out.println("Not enough fund present");
            m.stopPump();//Call the stopPump() meta-event of the MDAEFSM class
            m.receipt();//Call the receipt() meta-event of the MDAEFSM class
        } else if ((W == 1) || ((W == 2) && cash >= price * (li + 1))) {
            m.pump();//Call the pump() meta-event of the MDAEFSM class
        }
    }

    public void StopPump() {
        m.stopPump();//Call the stopPump() meta-event of the MDAEFSM class
        m.receipt();//Call the receipt() meta-event of the MDAEFSM class
    }
}
