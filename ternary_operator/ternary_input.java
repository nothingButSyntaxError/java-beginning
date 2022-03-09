// the objective is simple again. We take input from the user using Scanner
// we use the ternary operator to check if odd or even number
// then we print of odd or even
import java.util.*;

class ternary_input {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = ob.nextInt();
        String x;
        x = (a % 2 == 0) ? "even" : "odd";
        System.out.println(x);
    }
}