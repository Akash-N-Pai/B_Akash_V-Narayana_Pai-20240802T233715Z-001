package State;

import MainClass.MDAEFSM;
/*
    State is an abstract class that links MDAEFSM class to required State classes in the De-centralized State Design Pattern

    Each of the methods in this class are supposed to be  abstract in nature but in case a method is selected
    which doesn't belong to the current state in which the system currently is in then the user needs to be
    intimated that they have chosen an incorrect option hence "The option you have chosen is Incorrect" message needs
    to be printed.
    hence a method Incorrect() is used in each of the main methods in Class State which will do the needfull and only the methods
    that are overridden by the current state class will be executed and all the rest methods will show the msg.
                                          "The option you have chosen is Incorrect"
 */
public abstract class State {
    MDAEFSM m;

    public State(MDAEFSM m) {
        this.m = m;
    }

    public  void Activate() {
        Incorrect();
    }

    public void Start() {
        Incorrect();
    }

    public void PayType(int t) {
        Incorrect();// credit: t=1; cash: t=2;
    }

    public void Reject() {
        Incorrect();
    }

    public void Cancel() {
        Incorrect();
    }

    public void Approved() {
        Incorrect();
    }

    public void StartPump() {
        Incorrect();
    }

    public void Pump() {
        Incorrect();
    }

    public void StopPump() {
        Incorrect();
    }

    public void SelectGas(int g) {
        Incorrect();// Regular: g=1; Premium : g=2; Diesel: g=3
    }

    public void Receipt() {
        Incorrect();
    }

    public void NoReceipt() {
        Incorrect();
    }

    public void Continue() {
        Incorrect();
    }

    private void Incorrect() {
        System.out.println("********The option you have chosen is Incorrect********");
    }
}



