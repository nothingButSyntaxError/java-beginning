import java.util.*;

class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f*i;
        }
        System.out.println(f);
    }
}