package State;
import MainClass.MDAEFSM;

// this is the 4th state of the EFSM model
public class State4 extends State {
    public State4(MDAEFSM m) {
        super(m);
    }

    @Override
    public void StartPump() {
        /* implements setInitialValues action
     of OutPut Class and then changes the state to State5
     by calling ChangeState function in MDAEFSM class
     */
        m.getOP().setInitialValues();
        System.out.println("Initialized GasPump and Ready");
        m.ChangeState(5);
    }
}


