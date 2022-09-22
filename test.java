public class test {
    public static void main(String args[]) {
        // check if a number is pronic or not
        int num = 12;
        boolean flag = false;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                if (num / i - i == 1 || num / i - i == -1) {
                    System.out.println("Pronic");
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("Not Pronic");
        }
    }
}
