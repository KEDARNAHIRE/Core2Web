package IfElse_switch.Exercise;

public class Program6 {
    public static void main(String[] args) {
        //Divisible 3 or 7
        int x = 20;
        if(x%3==0){
            System.out.println(x+" Divisible by 3");
        }else if(x%7==0){
            System.out.println(x+" Divisible by 7");
        }else{
            System.out.println(x+" is Neither diisible by 3 or 7");
        }
    }
}
