// in this program we use switch case to find out what the user wants us to do
// we have 3 options:
// If the user says perimeter then we find perimeter of rectangle
// if area then area of rectangle
// the default case would mean nothing and the program will stop

import java.util.*;

class switch_area_peri {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number between; 1 for area; 2 for perimeter");
        int ans = ob.nextInt();
        switch(ans) {
            case 1:
                System.out.println("Enter the length and breadth");
                int len = ob.nextInt();
                int br = ob.nextInt();
                System.out.println("Area is " + len*br);
                break;
            case 2:
                System.out.println("Enter the length and breadth");
                int l = ob.nextInt();
                int b = ob.nextInt();
                System.out.println("Perimeter is " + 2 * (l+b));
                break;
            default:
                System.out.println("Invalid number. Exiting");
                break;
        }
    }
}