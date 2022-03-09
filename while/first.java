// print all even numbers between 1-50

class first {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}