package IfElse.ClassCode;

public class Pragram6 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 7;
        if(x>y && x>z){
            System.out.println("X is Greater");
        }else if(y>x && y>z){  // we can write it as (y>z) only 
            System.out.println("Y is Greater");
        }else{
            System.out.println("Z is greater");
        }
    }
}
