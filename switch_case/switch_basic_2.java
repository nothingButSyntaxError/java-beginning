// this time we take input from the user and then run switch case
// the number should be between 1-5 so 5 cases are enough and 1 is the default case
import java.util.*;

class switch_basic_2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number between 1-5");
        int ans = ob.nextInt();
        switch(ans) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}