// this is pretty much additional and involves all fundamentals of switch case
// NOT GIVEN IN SCHOOL BUT I AM DOING FOR PRACTICE AND RECOMMEND YOU ALL TO DO THIS
// TOO  
// the objective here is to create a simple calculator that does:
// addition, subtraction, multiplication, division
// instead of using if else we will use switch case
import java.util.*;

class simple_calculator {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = ob.nextInt();
        System.out.println("Enter the second number");
        int b = ob.nextInt();
        System.out.println("Enter the operator, + for add, - for subtract, * for multiply, / for divide");
        String op = ob.next();
        switch(op) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}