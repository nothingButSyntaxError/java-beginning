// objective - print each digit of a number on a line

class third {
    public static void main(String[] args) {
        int i = 1035;
        while (i > 0) {
            int dig = i % 10;
            System.out.println(dig);
            i = i/10;
        }
    }
}