class square_sum {
    public static void main(String[] args) {
        int sum = 0;
        int sum_square = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            sum_square = sum_square + i * i;
        }
        sum = sum * sum;
        System.out.println(sum - sum_square); 
    }
}