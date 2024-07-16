import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static String removeSpaces(String string){
        String newString = "";
        for (int i = 0; i<string.length(); i++) {
            if(string.charAt(i) != ' '){
                newString = newString + string.charAt(i);
            }
        } 
        return newString;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the string");
        String string = keyboard.nextLine();
        System.out.println( removeSpaces(string));
    }
}