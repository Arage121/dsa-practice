// Input a year and find whether it is a leap year or not
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      if(x <= 0) System.out.println("It's not a leap year.");
          if((x%400 == 0) || (x%4 == 0 && x%100 != 0)) System.out.println(x+ " is a leap y90000000000903ear.");
          else System.out.println("It's not a leap year.");
    }
}
