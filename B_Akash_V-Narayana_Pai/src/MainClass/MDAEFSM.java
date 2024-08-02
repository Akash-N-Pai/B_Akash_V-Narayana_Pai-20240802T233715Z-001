package MainClass;
import State.*;
//Code of B Akash V Narayana Pai
/*
    De-centralized State design pattern is use and the first method ChangeState(int i) is used for State transitions
    Rest of the methods are MDAEFSM Events
 */
public class MDAEFSM {
    private static State s;
    private static State[] LS;
    private OutPut op;

    public MDAEFSM() {
        LS = new State[8];// list of states

        LS[7] = new Start(this);
        LS[0] = new State0(this);
        LS[1] = new State1(this);
        LS[2] = new State2(this);
        LS[3] = new State3(this);
        LS[4] = new State4(this);
        LS[5] = new State5(this);
        LS[6] = new State6(this);
        s = LS[7];//state pointer is initialised to start state
    }

    public void ChangeState(int i) {
        s = LS[i];
        System.out.println(" STATE:" + i);
    }
/*
below methods are for directing the function call from both the GasPumps to State class
 */
    public void activate() {
        s.Activate();
    }

    public void start() {
        s.Start();
    }

    public void payType(int t) {// t = 1 Credit Card  t= 2 Cash
        s.PayType(t);
    }

    public void approve() {
        s.Approved();
    }

    public void reject() {
        s.Reject();
    }

    public void cancel() {
        s.Cancel();
    }

    public void selectGas(int g) {// g=1 Regular g=2 Premium g=3 Diesel
        s.SelectGas(g);
    }

    public void startPump() {
        s.StartPump();
    }

    public void pump() {
        s.Pump();
    }

    public void stopPump() {
        s.StopPump();
    }

    public void receipt() {
        s.Receipt();
    }

    public void noReceipt() {
        s.NoReceipt();
    }

    public void Continue() {
        s.Continue();
    }
    /*
    both methods bellow are used to set and get references of OutPut class
     */
    public OutPut getOP() {
        return op;
    }

    public void setOP(OutPut op) {
        this.op = op;
    }


}


