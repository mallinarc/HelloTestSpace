package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagram{

    static boolean isAnagram(String s1, String s2){

        String s1Copy = s1.replaceAll("\\s", "");
        String s2Copy = s2.replaceAll("\\s", "");
        if(s1Copy.length() != s2Copy.length())
        {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
 
            return false;
        }
        else
        {
        

        System.out.println(s1Copy +";;;;;"+s2Copy);

       
        char[] s1Array = s1Copy.toLowerCase().toCharArray();
        char[] s2Array = s2Copy.toLowerCase().toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        System.out.println("sorted s1Copy:"+Arrays.toString(s1Array)+":.....s2Array sorted:"+Arrays.toString(s2Array));
        return Arrays.equals(s1Array, s2Array);
        }

    }

    public static void main(String[] args) {

        String[] names = {"Mallina", "Zhao", "Konde", "Mallina", "Baker", "baker"};
        Set<String> namesSet = new HashSet<String>();
        for(String s: names){
            String ignoreCaseName = s.toLowerCase();
            if(namesSet.add(ignoreCaseName)== false){
                System.out.println("Duplicate name found:"+s);

            }else{
                namesSet.add(ignoreCaseName);
            }
        }
       
        //System.out.println(isAnagram("Mother In Law", "Hitler Woman"));
        String input = "GeeksForGeeks";
        char[] chrArr = input.toCharArray();
        char[] rvrsArry = new char[chrArr.length];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = chrArr.length -1; i >=0; i--){
            rvrsArry[idx] = chrArr[i];
            sb.append(chrArr[i]);
            idx++;
        }
        System.out.println(".....rverse array:"+Arrays.toString(rvrsArry));
        System.out.println("...... reverse String:"+new String(rvrsArry));
        System.out.println("...... String builder to string :"+sb.toString());
        
        int[] ints = {1,2,3};
        List<Object> instList = Arrays.stream(ints).boxed().collect(Collectors.toList());
    }


    
   
}