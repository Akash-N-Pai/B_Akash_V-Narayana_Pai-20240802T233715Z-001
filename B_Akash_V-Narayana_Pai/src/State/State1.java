package State;

import MainClass.MDAEFSM;
// this is the 1st state of the EFSM model
public class State1 extends State {
    public State1(MDAEFSM m) {
        super(m);
    }

    public void PayType(int t) {
        if (t == 1) {/* when pay type is Credit Card, changes the state to State2
         by calling ChangeState function in MDAEFSM class
     */
            m.ChangeState(2);
        } else if (t == 2) {/* when pay type is Cash implements storeCash ,displayMenu,setPayType
         action of OutPut Class and then changes the state to State3
         by calling ChangeState function in MDAEFSM class
     */
            m.getOP().storeCash();
            m.getOP().displayMenu();
            m.getOP().setPayType(2);
            m.ChangeState(3);
        }
    }
}




