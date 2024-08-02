package DataStore;
//Code of B Akash V Narayana Pai

/* CLass used for Holding of the data of Gas Pump 2 which are used across the platform
   Each of the getter and setter is used either to store or to return the specified data */
public class GP_2_Data extends DataStore {
        private float temp_a;
        private float temp_b;
        private float temp_c;
        private int temp_ca;
        private float DPrice;
        private float RPrice;
        private float PPrice;
        private int cash;
        private int G;
        private float total;
        private float price;

        public float get_temp_a() {
            return temp_a;
        }

        public float get_temp_b() {
            return temp_b;
        }

        public float get_temp_c() {
            return temp_c;
        }

        public void set_temp_a(float a) {
            temp_a = a;
        }

        public void set_temp_b(float b) {
            temp_b = b;
        }

        public void set_temp_c(float c) {
            temp_c = c;
        }

        public int get_temp_ca() {
            return temp_ca;
        }

        public void set_temp_ca(int ca) {
            temp_ca = ca;
        }

        public float get_PPrice() {
            return PPrice;
        }

        public float get_RPrice() {
            return RPrice;
        }

        public float get_DPrice() {
            return DPrice;
        }

        public void set_PPrice(float pr) {
            PPrice = pr;
        }

        public void set_RPrice(float r) {
            RPrice = r;
        }

        public void set_DPrice(float d) {
            DPrice = d;
        }

        public float get_cash() {
            return cash;
        }

        public void set_cash(int ca) {
            cash = ca;
        }

        public float get_total() {
            return total;
        }

        public void set_total(float t) {
            total = t;
        }

        public int get_G() {
            return G;
        }

        public void set_G(int g) {
            this.G = g;
        }

        public float get_price() {
            return price;
        }

        public void set_price(float p) {
            price = p;
        }
    }



