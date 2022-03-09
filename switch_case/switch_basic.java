// basic switch case program. No default case provided either since there is
// no input validation needed and the integer is declared by us

class switch_basic {
    public static void main(String[] args) {
        int a = 10;
        switch(a) {
            case 1:
                System.out.println("1");
                break;
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
        }
    }
}