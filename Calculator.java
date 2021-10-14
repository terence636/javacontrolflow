import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        // int age = 19;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your total sales ");
        int sales = sc.nextInt();

        if(sales >= 10000) {
            System.out.println("Comms is " + 0.3*sales);
        } else if(sales > 5000) {
            System.out.println("Comms is " + 0.2*sales);
        } else if(sales > 1000) {
            System.out.println("Comms is " + 0.1*sales);
        } else {
            System.out.println("No Comms");
        }
    }
}

                                                
