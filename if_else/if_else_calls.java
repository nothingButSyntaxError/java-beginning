// the objective here is to get input about the number of calls a user did
// all users to be charged 100 for a month
// if the user has less than 50 calls then per call charge is 0.50
// if the user has less than 100 calls then per call charge is 0.75
// if the user has more than 100 calls then per call charge is 1.25

import java.util.*;

class if_else_calls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of calls");
        int a = sc.nextInt();
        double charge = 0.0;
        if (a < 50) {
            charge = a * 0.50;
        } else if (a < 100 && a > 50) {
            charge = a * 0.75;
        } else if (a > 100) {
            charge = a * 1.25;
        }
        // add 100 as basic charge per user
        charge = charge + 100;
        System.out.println("The charge is " + charge);
    }
}