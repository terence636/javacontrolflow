import java.util.*;

public class Ticket {

    public static void main(String[] args) {
        // int age = 19;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int age = sc.nextInt();

        if(age > 60) {
            System.out.format("Your ticket price is $%.2f%n", 0.45*7);
        } else if(age < 5) {
            System.out.format("Your ticket price is $%.2f%n", 0.4*7);
        } else {
            System.out.println("Number of ticket purchase ");
            int numOfTic = sc.nextInt();
            if(numOfTic >= 2) {
                System.out.format("Your 2nd and onward ticket price is $%.2f%n", 0.7*7);
                System.out.format("Your Avg ticket price is $%.2f%n", (7+(0.7*7)*(numOfTic-1))/numOfTic);
            }
            else
                System.out.println("Your ticket price is $7");
        }
        sc.close();
    }
}