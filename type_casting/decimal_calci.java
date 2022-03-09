// the objective here is to take decimal input and do basic addition, multiplication, 
// division and subtraction by converting them to int and rounding them off properly.
import java.util.*;

class decimal_calci {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        double num = ob.nextDouble();
        int num1 = (int) num;
        System.out.println("Enter the decimal number");
        double num_1 = ob.nextDouble();
        int num2 = (int) num_1;
        System.out.println("Enter the operation to be performed, + for add, - for subtract, * for multiply and / for division");
        String op = ob.next();
        if (op.equals("+")) {
            int sum = num1 + num2;
            System.out.println("The sum is " + sum);
        } else if (op.equals("-")) {
            int sub = num1 - num2;
            System.out.println("The subtraction is " + sub);
        } else if (op.equals("*")) {
            int mul = num1 * num2;
            System.out.println("The multiplication is " + mul);
        } else if (op.equals("/")) {
            int div = num1 / num2;
            System.out.println("The division is " + div);
        } else {
            System.out.println("Invalid operation");
        }
    }
}