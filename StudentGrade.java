import java.util.*;
public class StudentGrade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalMarks=0;
        
        System.out.println("Enter number of subjects: ");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println("Enter marks obtained in the subject "+ i +"(out of 100):");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        double percentage=(double)totalMarks/number;
        String grade=calculateGrade(percentage);


        System.out.println("----------------------");
        System.out.println("Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("----------------------");
   }
    public static String calculateGrade(double percentage){
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}