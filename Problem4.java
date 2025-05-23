package UDEMY1;

public class Problem4 {
    public static void main(String[] args) {
        char grade;
        int gradeTest = 65;

        if (gradeTest >= 90) {
            grade = 'A';
        } else if (gradeTest >= 80) {
            grade = 'B';
        } else if (gradeTest >= 70) {
            grade = 'C';
        } else if (gradeTest >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // System.out.println(gradeTest + " is " + grade);

        switch (grade) {
            case 'A':
                System.out.println("You got an A!");
                break;
            case 'B':
                System.out.println("You got a B :)");
                break;
            case 'C':
                System.out.println("You got a C -_-");
                break;
            case 'D':
                System.out.println("You got a D >-<");
                break;
            default:
                System.out.println("You got an F x-x");
                break;
        }
    }
}
