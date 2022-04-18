
// objective -> store 5 string elements in a one-d array and print array
import java.util.Scanner;

public class second {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
