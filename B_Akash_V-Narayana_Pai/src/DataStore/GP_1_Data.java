package DataStore;
//Code of B Akash V Narayana Pai

/* CLass used for Holding of the data of Gas Pump 1 which are used across the platform
   Each of the getter and setter is used either to store or to return the specified data */
public class GP_1_Data extends DataStore {

    private int temp_a;
    private int price;
    private int L;
    private int total;
    private int temp_ca;
    private int W;
    private int cash;

    public int get_temp_a() {
        System.out.println("GasPump 1 Data");
        return temp_a;
    }

    public void set_temp_a(int a) {
        temp_a = a;
    }

    public int get_price() {
        return price;
    }

    public void set_price(int p) {
        price = p;
    }

    public int get_L() {
        return L;
    }

    public void set_L(int l) {
        L = l;
    }

    public int get_total() {
        return total;
    }

    public void set_total(int t) {
        total = t;
    }

    public int get_temp_ca() {
        return temp_ca;
    }

    public void set_temp_ca(int ca) {
        temp_ca = ca;
    }

    public int get_W() {
        return W;
    }

    public void set_W(int w) {
        W = w;
    }

    public int get_cash() {
        return cash;
    }

    public void set_cash(int ca) {
        cash = ca;
    }
}


