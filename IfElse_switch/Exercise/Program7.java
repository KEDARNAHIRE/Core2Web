package IfElse_switch.Exercise;

public class Program7 {
    public static void main(String[] args) {
        //Divisivleby 2 5 & 10 or not
        int x = 77;
        if(x%2==0){
            if(x%5==0){
                if(x%10==0){
                    System.out.println("Divisible 2,5 & 10");
                }
            }
        }else{
            System.out.println("Not Divisible by 2,5, & 10");
        }
    }
}
