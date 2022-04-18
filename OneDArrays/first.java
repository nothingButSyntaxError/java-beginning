
// objective -> take input of integers and store in an array and print all elements
import java.util.Scanner;

class first {
    public static void main(String args[]) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}