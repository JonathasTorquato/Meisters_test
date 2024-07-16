import java.util.*;
import java.lang.*;
import java.io.*;
class Main {

    public static List<String> getAllWithAnA(List<String> list){
        List<String> newList = new ArrayList<String>();
        for (String string : list) {
            if(string.length() == 3 && string.charAt(0) == 'a'){
                
                newList.add(string);
            }
        }
        return newList;
    }
    
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the strings (0 to finish the reading)");
        while (true) {
            String string = keyboard.nextLine();
            
            try{
                if(Integer.valueOf(string) == 0){
                    break;
                }
            }catch (NumberFormatException n){
                strings.add(string);
            }
        }
        System.out.println( getAllWithAnA(strings));
        
        
        
    }
}