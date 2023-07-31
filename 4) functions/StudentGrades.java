//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks entered by you should be less than 100!");
        int marks = sc.nextInt();
        System.out.println(grades(marks));
    }
    public static String grades(int m){
        int base = m/10;
        switch (base){
            case 9:
                return "AA";
            case 8:
                return "AB";
            case 7:
                return "BB";
            case 6:
                return "BC";
            case 5:
                return "CD";
            case 4:
                return "DD";
            default:
                return "fail";
        }
    }
}
