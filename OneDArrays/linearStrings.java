// objective -> store 5 strings in array and then take one string as input
// from user and find it in the array and print its index

import java.util.Scanner;

public class linearStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        System.out.println("Enter 5 strings");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("Enter element to search for");
        String str = sc.nextLine();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(str)) {
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