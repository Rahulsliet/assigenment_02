import java.util.Scanner;

public class question_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks os 1st subject : ");
        int mark1 = scn.nextInt();
        System.out.println("Enter marks os 2nd subject : ");
        int mark2 = scn.nextInt();
        System.out.println("Enter marks os 3rd subject : ");
        int mark3 = scn.nextInt();
        int total_marks = mark1 + mark2 + mark3;
        int percentage = (total_marks / 3);
        System.out.println("total_marks " + total_marks);
        System.out.println("percentage " + percentage + "%");
    }
}