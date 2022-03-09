// objective is simple
// check if the variable a is greater than 10 or not and store it in x
// print x
// the only thing here is to use ternary operator instead of if else

class ternary_basic {
    public static void main(String[] args) {
        int a = 12;
        String x;

        x = (a >= 10) ? "a is greater than or equal to 10" : "a is less than 10";
        System.out.println(x);
    }
}