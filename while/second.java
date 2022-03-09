// objective - print all odd numbers in reverse order between 50 to 1

class second {
    public static void main(String[] args) {
        int i = 50;
        while (i >= 1) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}