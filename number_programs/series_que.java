class series_que {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 13; i += 3) {
            j = i + 1;
            k = i + 2;
            System.out.println(i * j / k);
        }
    }
}