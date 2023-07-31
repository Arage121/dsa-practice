//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class SmallCalculatore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operator: ");
        int ans = 0;
        while(true){

        char op = sc.next().trim().charAt(0);
        System.out.print("Enter two values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
         if(op == '-') ans = a-b;
         if(op == '*') ans = a*b;
         if(op == '+') ans = a+b;
         if(op == '/'){
             if(b!=0){ans = a/b;}}
         if(op == '%') ans = a%b;
        }
        else if(op == 'x' || op == 'X'){
            break;
        }else{
            System.out.println("Invalid input");
        }
            System.out.println(ans);
        }
    }
}
