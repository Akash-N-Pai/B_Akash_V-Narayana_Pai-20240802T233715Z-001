package State;
import MainClass.MDAEFSM;

// this is the 3rd state of the EFSM model
public class State3 extends State {
    public State3(MDAEFSM m) {
        super(m);
    }

    @Override
    public void Continue()
    {/*changes the state to State4
        by calling ChangeState function in MDAEFSM class
     */
        m.ChangeState(4);
    }

    @Override
    public void SelectGas(int g) {
        if (g == 1 || g == 2 || g == 3) {/*implements setPrice
         action of OutPut Class */
            m.getOP().setPrice(g);
        } else {
            System.out.println("Invalid Choice Of Gas Type");
        }
    }

    @Override
    public void Cancel() {/*implements cancelMsg
         action of OutPut Class and then changes the state to State0
        by calling ChangeState function in MDAEFSM class
     */
        m.getOP().cancelMsg();
        m.ChangeState(0);
    }
}


