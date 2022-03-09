import java.util.*;

class prod_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            prod = prod * rem;
            n = n /10;
        }
        System.out.println(prod);
    }
}