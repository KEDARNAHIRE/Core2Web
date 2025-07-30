package IfElse_switch.Exercise;

public class Program18 {
    public static void main(String[] args) {
        //Clothing Sizes
        String size = "S";
        switch(size){
            case "S":
                System.out.println("Small");
                break;
            case "M":
                System.out.println("Medium");
                break;
            case "XL":
                System.out.println("Extra Large");
                break;
            case "XXL":
                System.out.println("Extra Extra Large");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
