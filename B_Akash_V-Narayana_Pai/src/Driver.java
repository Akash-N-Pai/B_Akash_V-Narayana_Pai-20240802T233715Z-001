
import java.util.Scanner;
import MainClass.GP_1;
import MainClass.GP_2;

public class Driver {

    // Show the menu and handle user input for GasPump-1
    public static void GP_1_Menu() {
        GP_1 gp1 = new GP_1(); // Create an instance of GP_1 class
        int a; // Variables to store int values of fuel price
        int ca; // Variable to store integer value of cash
        char ch; // Variable to store user choice

        // Display the menu for GasPump-1
        System.out.println("GasPump-1");
        System.out.println("MENU of Operations");
        // List of operations for GasPump-1
        System.out.println("-----------------------------------");
        System.out.println("        (0) Activate(int a)        ");
        System.out.println("        (1) Start");
        System.out.println("        (2) PayCash(int c)");
        System.out.println("        (3) PayCredit");
        System.out.println("        (4) Reject");
        System.out.println("        (5) Approved");
        System.out.println("        (6) Cancel");
        System.out.println("        (7) StartPump");
        System.out.println("        (8) Pump");
        System.out.println("        (9) StopPump");
        System.out.println("        {q} Quit the program");
        System.out.println("------------------------------------");

        // Loop to handle user input
        System.out.println("  Please make a note of these operations");
        System.out.println("           GasPump-1 Execution");
        ch = '1';
        Scanner scanner = new Scanner(System.in);
            while (ch != 'q') {
                System.out.println("  Select Operation: ");
                System.out.println("0 - Activate(int a),1 - Start ,2 - PayCash(int ca),3 - PayCredit,4 - Reject,5 - Approved");
                System.out.println("6 - Cancel,7- StartPump, 8 - Pump, 9 - StopPump, q - quit");
                ch = scanner.next().charAt(0);
                switch (ch) {
                    case '0': {
                        System.out.println(" Activate(int a)");
                        System.out.println(" Enter the price value:");
                        a = scanner.nextInt();
                        gp1.Activate(a); // Call Activate function of GP_1 class
                        break;
                    }
                    case '1': {
                        System.out.println(" Start()");
                        gp1.Start(); // Call Start function of GP_1 class
                        break;
                    }
                    case '2': {
                        System.out.println(" PayCash(int ca)");
                        ca = scanner.nextInt();
                        gp1.PayCash(ca); // Call PayCash(int ca) function of GP_1 class
                        break;
                    }
                    case '3': {
                        System.out.println(" PayCredit()");
                        gp1.PayCredit(); // Call PayCredit function of GP_1 class
                        break;
                    }
                    case '4': {
                        System.out.println(" Reject()");
                        gp1.Reject(); // Call Reject function of GP_1 class
                        break;
                    }
                    case '5': {
                        System.out.println(" Approved()");
                        gp1.Approved(); // Call Approved function of GP_1 class
                        break;
                    }
                    case '6': {
                        System.out.println(" Cancel()");
                        gp1.Cancel(); // Call Cancel function of GP_1 class
                        break;
                    }
                    case '7': {
                        System.out.println(" StartPump()");
                        gp1.StartPump(); // Call StartPump function of GP_1 class
                        break;
                    }
                    case '8': {
                        System.out.println(" Pump()");
                        gp1.Pump(); // Call Pump function of GP_1 class
                        break;
                    }
                    case '9': {
                        System.out.println(" StopPump()");
                        gp1.StopPump(); // Call StopPump function of GP_1 class
                        break;
                    }
                    case 'q': {
                        System.exit(0); // Exit the program
                    }
                }
            }

    }

    // Show the menu and handle user input for GasPump-2
    public static void GP_2_Menu() {
        GP_2 gp2 = new GP_2(); // Create an instance of GP_2 class
        float a, b, c; // Variables to store float values
        int ca; // Variable to store integer value
        char ch; // Variable to store user choice

        // Display the menu for GasPump-2
        System.out.println("GasPump-2");
        System.out.println("MENU of Operations");
        // List of operations for GasPump-2
        System.out.println("--------------------------------------------------");
        System.out.println("      (0) Activate(float a ,float b ,float c)");
        System.out.println("      (1) Start");
        System.out.println("      (2) PayCash(int ca)");
        System.out.println("      (3) Cancel");
        System.out.println("      (d) Diesel");
        System.out.println("      (p) Premium");
        System.out.println("      (r) Regular");
        System.out.println("      (7) StartPump");
        System.out.println("      (8) PumpGallon");
        System.out.println("      (9) Stop");
        System.out.println("      (R) Receipt");
        System.out.println("      (N) NoReceipt");
        System.out.println("      {q} Quit the program");
        System.out.println("---------------------------------------------------");

        // Loop to handle user input
        System.out.println("  Please make a note of these operations");
        System.out.println("           GasPump-2 Execution");
        ch = '1';
        Scanner scanner = new Scanner(System.in);
            while (ch != 'q') {
                System.out.println("  Select Operation: ");
                System.out.println("0-Activate,1-Start,2-PayCash(int c),3-Cancel,d-Diesel,p-Premium");
                System.out.println("r-Regular,7- StartPump, 8 - PumpGallon, 9 - Stop,R - Receipt,N - NoReceipt, q - quit");
                ch = scanner.next().charAt(0);
                switch (ch) {
                    case '0': {
                        System.out.println(" Operation:  Activate(float a ,float b ,float c)");
                        System.out.println(" Enter value for a:");
                        a = scanner.nextFloat();
                        System.out.println(" Enter value for b:");
                        b = scanner.nextFloat();
                        System.out.println(" Enter value for c:");
                        c = scanner.nextFloat();
                        gp2.Activate(a, b, c); // Call Activate function of GP_2 class with three float parameters
                        break;
                    }
                    case '1': {
                        System.out.println(" Start()");
                        gp2.Start(); // Call Start function of GP_2 class
                        break;
                    }
                    case '2': {
                        System.out.println(" PayCash(int c)");
                        System.out.println(" Enter value of the parameter c:");
                        ca = scanner.nextInt();
                        gp2.PayCash(ca); // Call PayCash function of GP_2 class with integer parameter
                        break;
                    }
                    case '3': {
                        System.out.println(" Cancel()");
                        gp2.Cancel(); // Call Cancel function of GP_2 class
                        break;
                    }
                    case 'd': {
                        System.out.println("  Diesel()");
                        gp2.Diesel(); // Call Diesel function of GP_2 class
                        break;
                    }
                    case 'p': {
                        System.out.println(" Premium()");
                        gp2.Premium(); // Call Premium function of GP_2 class
                        break;
                    }
                    case 'r': {
                        System.out.println(" Regular()");
                        gp2.Regular(); // Call Regular function of GP_2 class
                        break;
                    }
                    case '7': {
                        System.out.println(" StartPump()");
                        gp2.StartPump(); // Call StartPump function of GP_2 class
                        break;
                    }
                    case '8': {
                        System.out.println(" PumpGallon()");
                        gp2.PumpGallon(); // Call PumpLiter function of GP_2 class
                        break;
                    }
                    case '9': {
                        System.out.println(" Stop()");
                        gp2.Stop(); // Call Stop function of GP_2 class
                        break;
                    }
                    case 'R': {
                        System.out.println(" Receipt()");
                        gp2.Receipt(); // Call Receipt function of GP_2 class
                        break;
                    }
                    case 'N': {
                        System.out.println(" NoReceipt()");
                        gp2.NoReceipt(); // Call NoReceipt function of GP_2 class
                        break;
                    }
                    case 'q': {
                        System.exit(0); // Exit the program
                    }
                }
            }

    }

    // Main function to select the gas pump station
    public static void main(String[] args) {
        int choice; // Variable to store user selection

        Scanner scanner = new Scanner(System.in);
            System.out.println("\nSelect Gas Pump Station:\n");
            System.out.println("1. Gas Pump 1\n2. Gas Pump 2\n");
            System.out.println("Enter Your Selection: ");
            choice = scanner.nextInt();

        switch (choice) {
            case 1:
                GP_1_Menu(); // Show the menu for GasPump-1
                break;
            case 2:
                GP_2_Menu(); // Show the menu for GasPump-2
                break;
            default:
                break;
        }
    }
}