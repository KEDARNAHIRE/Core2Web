package IfElse_switch.Exercise;

public class Program19 {
    public static void main(String[] args) {
        //Arithmetic 
        int x = 23;
        int y = 2;
        char ch = '*';
        switch (ch) {
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
