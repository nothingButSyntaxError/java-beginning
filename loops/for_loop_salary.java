// objective - we have a huge structure of salary data
// 10000 =< BASIC SALARY <= 20000 then da = 19%; hra = 10%; ta = 9%; pf= 0
// 20000 < BASIC SALARY <= 40000 then da = 29%; hra = 20%; ta = 8%; pf= 8%
// BASIC SALARY > 40000 then da = 39%; hra = 40%; ta = 16%; pf= 12%
import java.util.*;

class for_loop_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your name");
            String name = sc.next();
            int basic = sc.nextInt();
            int ts;
            if (basic >= 10000 && basic <= 20000) {
                int da = 19/100 * basic;
                int hra = 10/100 * basic;
                int ta = 9/100 * basic; 
                ts = da + hra + ta;
            } 
            System.out.println(name + " " + ts);
        }
    }
}