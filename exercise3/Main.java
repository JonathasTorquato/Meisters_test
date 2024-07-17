import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the two numbers separated with an enter");
        try {
            Integer number1 = Integer.valueOf(keyboard.nextLine());
            Integer number2 = Integer.valueOf(keyboard.nextLine());
            
            number1 = number1^number2;
            number2 = number2^number1;
            number1 = number1^number2;   
            System.out.println(number1 + " "  + number2);
            
        }
        catch(NumberFormatException n){
            System.out.println("please insert a number");
        }
        
    }

}