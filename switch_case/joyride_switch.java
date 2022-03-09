// We need to get the amount of cash required as per the user
// for below 10 years, boys pay 50 and girls 40
// for 10-17, boys pay 70 and girls 60
// for above 17, boys pay 90 and girls 80
// take input from user and check all these details and finally print
// the amount needed
import java.util.*;

class joyride_switch {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter 1 for male and 2 for female");
        int mf = ob.nextInt();
        System.out.println("Enter the age of the person");
        int age = ob.nextInt();
        switch(mf) {
            case 1:
                if (age < 10) {
                    System.out.println("50");
                } else if (age < 17) {
                    System.out.println("70");
                } else {
                    System.out.println("90");
                }
                break;
            case 2:
                if (age < 10) {
                    System.out.println("40");
                } else if (age < 17) {
                    System.out.println("60");
                } else {
                    System.out.println("80");
                }
                break;
        }
    }
}