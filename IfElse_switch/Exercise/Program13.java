package IfElse_switch.Exercise;

public class Program13 {
    public static void main(String[] args) {
        //Student Career Advice
        float marks = 55f;
        if(marks>85){
            System.out.println("Medical");
        }else if(marks>75 && marks<85){
            System.out.println("Engineering");
        }else if(marks >60 && marks<75){
            System.out.println("BSC");
        }else{
            System.out.println("BA");
        }

    }
}
