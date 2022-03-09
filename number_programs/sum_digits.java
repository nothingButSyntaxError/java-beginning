import java.util.*;

class sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int n = sc.nextInt();
        while (n > 0) {
            int remainder = n % 10;
            s += remainder;
            n = n/10;
        }
        System.out.println(s);
    }
}