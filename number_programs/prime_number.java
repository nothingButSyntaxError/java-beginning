import java.util.*;

class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        int flag = 0;

        for (int i = 2; i <= a / 2; ++i) {
            if (a % i == 0) {
                flag = 1;
            } 
            if (flag == 1) {
                System.out.println("Not Prime");
                break;
            }
        }
         
        if (flag == 0) {
            System.out.println("Prime");
        }
    }
}