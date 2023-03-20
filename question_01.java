import java.util.Scanner;

public class question_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your first name : ");
        String first_name = scn.next();
        System.out.println("enter your last name : ");
        String last_name = scn.next();
        System.out.println("enter your roll no : ");
        int roll_number = scn.nextInt();
        System.out.println("enter your field of intrest : ");
        String field_of_intrest = scn.next();
        System.out.println("name : " + first_name + " " + last_name);
        System.out.println("Roll number : " + roll_number);
        System.out.println("Field of intrest : " + field_of_intrest);
    }

}
