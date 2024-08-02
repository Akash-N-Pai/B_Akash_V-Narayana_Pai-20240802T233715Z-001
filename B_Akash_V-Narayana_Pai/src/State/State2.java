package State;

import MainClass.MDAEFSM ;
// this is the 2nd state of the EFSM model
public class State2 extends State {
    public State2(MDAEFSM m) {
        super(m);
    }

    @Override
    public void Approved() {/*  implements displayMenu ,setPayType(1),ejectCard()
         action of OutPut Class and then changes the state to State3
         by calling ChangeState function in MDAEFSM class
     */
        m.getOP().displayMenu();
        m.getOP().setPayType(1);
        m.getOP().ejectCard();
        m.ChangeState(3);
    }

    @Override
    public void Reject() {/*  implements rejectMsg ,ejectCard()
         action of OutPut Class and then changes the state to State3
         by calling ChangeState function in MDAEFSM class
     */

        m.getOP().rejectMsg();
        m.getOP().ejectCard();
        m.ChangeState(0);
    }
}



