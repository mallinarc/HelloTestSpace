package etc;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompareWIthComparator{


    public static void sortStringArray(String[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) { //Apply the bubble Sort
                if (CompareString(array[j - 1], array[j]) == 1) { //Pass the two adjacent string for comparing
                    String temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
    
    private static int CompareString(String first, String second) {
        int len;
    
        if (first.length() >= second.length()) //we need to take the smallest string length
            len = second.length();
        else
            len = first.length();
    
        for (int i = 0; i <= len; i++) {
            if (first.charAt(i) > second.charAt(i))  //Suppose the first string letters is greater then return 1; 
                return 1;
            else if (first.charAt(i) < second.charAt(i)) //if second string letter is greater then return -1;
                return -1;
        }
        return 0;  //if both the equal then return 0
    }

    public static class StringComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			return o1.compareTo(o2);
		}
        
    }
    public static void main(String[] args) {
        String[] strArr = {"bgh", "asd", "new"};
        Arrays.sort(strArr, new StringComparator());
       System.out.println("Sorted by comparaytor:"+Arrays.toString(strArr));
        String[] newStrArr = new String[]{"Henry Bernard",
        "Cherish Davidson",
        "Joshua Norris",
        "Eleanor Kelley",
        "Jaslyn Schneider",
        "Holly Herman",
        "Willie Strong",
        "Eliana Villa",
        "Lennon Odom",
        "Monica Velasquez",
        "Salvatore Levy",
        "Taliyah Bruce"};

       sortStringArray(newStrArr);
       Arrays.sort(newStrArr);
       System.out.println(" Arrays.sort newStrArr:"+Arrays.toString(newStrArr));




    }
}