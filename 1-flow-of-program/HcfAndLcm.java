//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.*;
public class HcfAndLcm {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int temp1 = a;
      int temp2 = b;
      int temp = 0;
      while(temp2 != 0){
          temp = temp2;
          temp2 = temp1%temp2;
          temp1 = temp;
      }

      int hcf = temp1;
      int lcm = (a*b)/hcf;
      System.out.print("HCF is: "+hcf+ "and LCM is:" + lcm);
    }
}
