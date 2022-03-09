// this is a basic implementation of ascii conversion
// we take input of one character and print its ascii value
import java.util.*;

class type_cast_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        String a = sc.next();
        // the charat method we DONT HAVE AT SCHOOL
        // i had to use it in this case but otherwise it wont work 
        // because we CANT take char as input and we CANT convert string to char
        char ch = a.charAt(0);
        int ascii_value = (int) ch;
        System.out.println("The ascii value is " + ascii_value);
    }
}