/*** Created by abin on 8/7/16.*/
/**Grade Ranks**/
public class saub {
    public static void main(String[] args) {
        int grade = 6;
        if (grade > 9 && grade == 10) {
            System.out.println("Excellent");
        } else if (grade > 8 && grade <= 9) {
            System.out.println("Very Good");
        } else if (grade > 7 && grade <= 8) {
            System.out.println("Good");
        } else if (grade > 6 && grade <= 7) {
            System.out.println("Satisfacory Work");
        } else if (grade > 4 && grade <= 6) {
            System.out.println("Sufficient");
        } else if (grade > 3 && grade <= 4) {
            System.out.println("Not Sufficient");
        } else if (grade < 3) {
            System.out.println("Unfair Behavior");
        }
    }
}
