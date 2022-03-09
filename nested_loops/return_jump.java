// the continue statement transfers control to the next iteration in a loop
// a basic example

class return_jump {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}