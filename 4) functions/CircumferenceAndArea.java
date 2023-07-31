//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.*;
public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(circum(r));
        System.out.println(area(r));
    }
    public static float circum(int r){
        float pie = 3.14f;
        float c = 2*(pie*r);
        return c;
    }
    public static float area(int r){
        float pie = 3.14f;
        float a = pie*(r*r);
        return a;
    }
}
