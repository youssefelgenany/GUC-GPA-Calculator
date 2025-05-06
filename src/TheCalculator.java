import java.util.HashMap;
import java.util.Map;

public class TheCalculator {

    public static void main(String[] args) {
        Map<String, Double> gradePoints = new HashMap<>();
        gradePoints.put("A+", 0.7);
        gradePoints.put("A", 1.0);
        gradePoints.put("A-", 1.3);
        gradePoints.put("B+", 1.7);
        gradePoints.put("B", 2.0);
        gradePoints.put("B-", 2.3);
        gradePoints.put("C+", 2.7);
        gradePoints.put("C", 3.0);
        gradePoints.put("C-", 3.3);
        gradePoints.put("D+", 3.7);
        gradePoints.put("D", 4.0);
        gradePoints.put("F", 5.0);
        
        double[] creditHours = {};  //Write The credit hours here
        String[] grades = {}; //Write their corresponding Grade here


        double gpa = calculateGPA(creditHours, grades, gradePoints);
        System.out.println("Your GPA is: " + gpa);

        String letterGrade = getLetterGrade(gpa);
        System.out.println("Your letter grade is: " + letterGrade);
        System.out.println(creditHours.length);
        System.out.println(grades.length);
    }

    public static double calculateGPA(double[] creditHours, String[] grades, Map<String, Double> gradePoints) {
        double totalPoints = 0;
        double totalHours = 0;

        for (int i = 0; i < creditHours.length; i++) {
            totalPoints += gradePoints.get(grades[i]) * creditHours[i];
            totalHours += creditHours[i];
        }

        return totalPoints / totalHours;
    }
    public static String getLetterGrade(double gpa) {
        if (gpa >= 4 && gpa<5) {
            return "D";
        } else if (gpa >= 3.7 && gpa<4) {
            return "D+";
        } else if (gpa >= 3.3 && gpa<3.7) {
            return "C-";
        } else if (gpa >= 3.0 && gpa<3.3) {
            return "C";
        } else if (gpa >= 2.7 && gpa<3.0) {
            return "C+";
        } else if (gpa >= 2.3 && gpa<2.7) {
            return "B-";
        } else if (gpa >= 2.0 && gpa < 2.3) {
            return "B";
        } else if (gpa >= 1.7 && gpa < 2.0) {
            return "B+";
        } else if (gpa >= 1.3 && gpa < 1.7) {
            return "A-";
        } else if (gpa >= 1.0 && gpa < 1.3) {
            return "A";
        } else if (gpa >= 0.7 && gpa < 1.0){
            return "A+";
        } else {
            return "F";
        }
    }

}