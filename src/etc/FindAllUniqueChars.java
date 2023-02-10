package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class FindAllUniqueChars{
    
    public static final Scanner scanner = new Scanner(System.in);

    public static boolean allUnique(String instr){
        

        List<Character> uniqueChars = new ArrayList();

        if(instr.trim().length() == 1){
            return true;
        }else{
            // process string to handle if it has unique characters.
            // using java collection to make it look clean
            for(char c: instr.toCharArray()){
                if(!uniqueChars.contains(c)){
                    uniqueChars.add(c);
                }
            }
            System.out.println(uniqueChars.size());
            System.out.println(instr.length());
            if(uniqueChars.size() != instr.length()){
                return false;
            }else{
                return true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Let us find out if a word has all unique chars.");
        String s = scanner.nextLine();
        //edge case test
        if(StringUtils.isBlank(s)){
            System.out.println("You have passed Empty word.");                
        }else{

            if(allUnique(s)){
                System.out.println("Yes All are unique characters.");
            }else{
                System.out.println("No, there are duplicate characters in the word.");
            }
        }
        scanner.close();
    }


}