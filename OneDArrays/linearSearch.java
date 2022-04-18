
// objective -> take 5 elements as input from user and store in array
// take one element as input to search in the array and then print its position 
// in the array.
import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 integers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search for");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Found at " + i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("No such element in array");
        }
    }
}
