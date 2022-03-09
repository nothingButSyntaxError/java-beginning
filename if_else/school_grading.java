// the objective is to use if else and do the following
// a school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

class school_grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int a = sc.nextInt();
        String grade = "";
        if (a < 25) {
            grade = "F";
        } else if (a < 45) {
            grade = "E";
        } else if (a < 50) {
            grade = "D";
        } else if (a < 60) {
            grade = "C";
        } else if (a < 80) {
            grade = "B";
        } else if (a > 80) {
            grade = "A";
        }
        System.out.println("The grade is " + grade);
    }
}