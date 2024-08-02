package MainClass;
import AbstractFactory.GPFactory2;
import DataStore.GP_2_Data;
import DataStore.DataStore;
import AbstractFactory.AbstractFactory ;
//Code of B Akash V Narayana Pai
//InputProcessor class for GasPump2
public class GP_2 {
    private static DataStore ds;
    private static MDAEFSM m;
    private static GP_2_Data d;

    public GP_2() {/*
        constructor to get reference of Abstract Factory class of Gas Pump2
        using Abstract Factory reference DataStore reference is loaded to ds
        m holds the reference to MDAEFSM Class
        d holds the reference to Data Class of Gas Pump 2 Class
          */
        AbstractFactory af = new GPFactory2();
        ds = af.getData();
        m = new MDAEFSM();
        m.setOP(new OutPut(af));
        d = (GP_2_Data) ds;
    }

    public void Activate(float a, float b, float c) {
        if (a > 0 && b > 0 && c > 0) {// temporary store of fuel price
            d.set_temp_a(a);
            d.set_temp_b(b);
            d.set_temp_c(c);
            m.activate();//Call the activate() meta-event of the MDAEFSM class
        } else {
            System.out.println("Please enter valid Price for each fuel type");
        }
    }

    public void Start() {//Call the start() meta-event of the MDAEFSM class

        m.start();
    }

    public void PayCash(int ca) {
        GP_2_Data d = (GP_2_Data) ds;
        if (ca > 0) {// temporary store of cash
            d.set_temp_ca(ca);
            m.payType(2);//Call the payType(2) meta-event of the MDAEFSM class
        } else {
            System.out.println("Enter valid cash amount");
        }
    }

    public void Cancel() {//Call the cancel() meta-event of the MDAEFSM class

        m.cancel();
    }

    public void Regular() {//Call the selectGas(1) meta-event of the MDAEFSM class
        m.selectGas(1);
        m.Continue();//Call the Continue() meta-event of the MDAEFSM class
    }

    public void Premium() {
        m.selectGas(2);//Call the selectGas(2) meta-event of the MDAEFSM class
        m.Continue();//Call the Continue() meta-event of the MDAEFSM class
    }

    public void Diesel() {
        m.selectGas(3);//Call the selectGas(3) meta-event of the MDAEFSM class
        m.Continue();//Call the Continue() meta-event of the MDAEFSM class
    }

    public void StartPump() {
        m.startPump();
    }

    public void PumpGallon() {
        GP_2_Data d = (GP_2_Data) ds;
        float cash = d.get_cash();
        float price = d.get_price();
        int ga = d.get_G();
        // based on the output of if condition the further classes are executed
        if (cash < price * (ga + 1)) {
            System.out.println("Cash not enough");
            m.stopPump();//Call the stopPump() meta-event of the MDAEFSM class
        } else {
            m.pump();//Call the pump() meta-event of the MDAEFSM class
        }
    }

    public void Stop() {//Call the stopPump() meta-event of the MDAEFSM clas

        m.stopPump();
    }

    public void Receipt() {//Call the receipt() meta-event of the MDAEFSM class
        m.receipt();
    }

    public void NoReceipt() {//Call the noreceipt() meta-event of the MDAEFSM clas
        m.noReceipt();
    }
}

