public class charArrToString {
    public static void main(String args[]) {
        char arr[] = { 'a', 'e', 'r', 'o', 'p', 'l', 'a', 'n', 'e' };
        String finall = new String(arr); // converts character array to one string
        System.out.println(finall); // outputs aeroplane
        char arr2[] = { 'h', 'e', 'l', 'l', 'o' };
        String finall2 = new String(arr2, 0, 4); // start from 0th index and take 4 characters only
        System.out.println(finall2); // outputs hell not hello
    }
}