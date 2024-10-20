import java.util.Scanner;

public class SGPAcal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int[] credits = new int[numberOfSubjects];
        double[] gradePoints = new double[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter the grade points for subject " + (i + 1) + ": ");
            gradePoints[i] = scanner.nextDouble();
        }

        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            totalGradePoints += gradePoints[i] * credits[i];
            totalCredits += credits[i];
        }


        double sgpa = totalGradePoints / totalCredits;


        System.out.println("Your SGPA is: " + sgpa);


        scanner.close();
    }
}
