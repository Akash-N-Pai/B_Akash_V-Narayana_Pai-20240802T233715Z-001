package State;
import MainClass.MDAEFSM;
// this is the Start state of the EFSM model

public class Start extends State {
    public Start(MDAEFSM m) {
        super(m);
    }

    @Override
    public void Activate() {
    /* implements storePrice action
     of OutPut Class and then changes the state to State0
     by calling ChangeState function in MDAEFSM class
     */
        System.out.println("ACTIVATE");
        m.getOP().storePrice();
        m.ChangeState(0);
    }
}



