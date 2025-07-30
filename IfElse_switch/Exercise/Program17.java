package IfElse_switch.Exercise;

public class Program17 {
    public static void main(String[] args) {
        //Grade System
        char Grade = 'F';
        switch(Grade){
            case 'O':
                System.out.println("Excellent");
                break;
            case 'A':
                System.out.println("Very Good");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Work Hard");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
