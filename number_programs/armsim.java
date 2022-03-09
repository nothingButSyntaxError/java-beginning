import java.util.*;

class armsim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cube_sum = 0;
        int n1 = n;
        while (n > 0) {
            int rem = n % 10;
            cube_sum = cube_sum + (int) Math.pow(rem, 3);
            n = n/10;
        }
        if (n1 == cube_sum) {
            System.out.println("armism");
        } else {
            System.out.println("not armism");
        }
    }
}