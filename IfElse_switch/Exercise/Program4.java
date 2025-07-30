package IfElse_switch.Exercise;

public class Program4 {
    public static void main(String[] args) {
        //UPPERCASE OR LOWERCASE
        char ch = '9';
        if((int)ch>=65 && (int)ch<=90){
            System.out.println("UpperCase");
        }else if((int)ch>=97 && (int)ch<=122){
            System.out.println("LowerCase");
        }else{
            System.out.println("Invalid Input");
        }

    }
}
