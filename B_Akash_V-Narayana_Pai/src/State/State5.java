package State;
import MainClass.MDAEFSM;

// this is the 5th state of the EFSM model
public class State5 extends State {
    public State5(MDAEFSM m) {
        super(m);
    }

    @Override
    public void Pump() {
        /* implements pumpGasUnit,gasPumpedMsg action
     of OutPut Class
     */
        System.out.println("PUMP");
        m.getOP().pumpGasUnit();
        m.getOP().gasPumpedMsg();
    }

    @Override
    public void StopPump() {/*  changes the state to State6
     by calling ChangeState function in MDAEFSM class
     */
        System.out.println("STOP PUMP");
        m.ChangeState(6);
    }
}



