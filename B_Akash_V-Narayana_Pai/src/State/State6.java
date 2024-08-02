package State;

import MainClass.MDAEFSM;
// this is the 6th state of the EFSM model
public class State6 extends State {
    public State6(MDAEFSM m) {
        super(m);
    }

    @Override
    public void Receipt() {
        /* implements printReceipt,returnCash action
     of OutPut Class and then changes the state to State0
     by calling ChangeState function in MDAEFSM class
     */
        m.getOP().printReceipt();
        m.getOP().returnCash();
        m.ChangeState(0);
    }

    @Override
    public void NoReceipt() {
        /* implements returnCash action
     of OutPut Class and then changes the state to State0
     by calling ChangeState function in MDAEFSM class
     */
        System.out.println("THANK YOU FOR SAVING PAPER");
        m.getOP().returnCash();
        m.ChangeState(0);
    }
}



