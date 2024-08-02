package State;

import MainClass.MDAEFSM;
// this is the 0th state of the EFSM model
public class State0 extends State {
    public State0(MDAEFSM m) {
        super(m);
    }

    @Override
    public void Start(){
        /* implements payMsg() action
     of OutPut Class and then changes the state to State1
     by calling ChangeState function in MDAEFSM class
     */
        System.out.println(" START ");
        m.getOP().payMsg();
        m.ChangeState(1);

    }
}
