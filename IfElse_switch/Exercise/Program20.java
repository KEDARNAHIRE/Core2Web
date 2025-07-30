package IfElse_switch.Exercise;
import java.util.*;
public class Program20 {
    public static void main(String[] args) {
        //take 2 numbers, if boths are positive multiply them and pass to switch to verity for even or odd and if 
        //user type negative num then show sorry
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<0 || b<0){
            System.out.println("Sorry Negative Numbers are not Valid");
        }else {
            int mul = a*b;
            String ans;
            if(mul%2==0){
                ans = "Even";
            }else{
                ans = "Odd";
            }
            switch (ans) {
                case "Even":
                    System.out.println("Even");
                    break;
                default:
                    System.out.println("Odd");
            }
        }
    
    }
}
