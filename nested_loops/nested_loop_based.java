// objective is simple we run a nested loop where j runs while its less than i
// it will be like a pyramid

class nested_loop_based {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
        }
    }
}