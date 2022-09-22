public class functions {
    public static void main(String args[]) {
        String s1 = "we are in cyber world";
        String s2 = "";
        // change first letter of every word to capital or uppercase
        for (int i = 0; i < s1.length(); i++) {
            if ((int) s1.charAt(i) == 32) {
                char letter = (char) (((int) s1.charAt(i + 1)) - 32);
                s2 += " " + letter;
                i += 1;
            } else {
                s2 += s1.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
