package etc;

import java.util.Arrays;
import java.util.Stack;

/*Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

*/
public class RotateArrayByOrder{

    static int[] reverse(int[] arr, int startIdx, int endIdx){
        System.out.println("arr:"+ Arrays.toString(arr)+":Start Index:"+ startIdx + ":endIdx:"+endIdx);

        while(startIdx < endIdx){
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
        return arr;
    }

    static int[] rotate(int[] arr, int order){
        if(arr == null || arr.length == 0 || order == 0){
            throw new IllegalArgumentException("Illegal Argument.");
        }

        if(order > arr.length){
            System.out.println("Order before:"+order);
            order = order%arr.length;
            System.out.println("Order later:"+order);
        }
        int firstArrLength = arr.length - order;
        reverse(arr, 0, firstArrLength - 1);
        reverse(arr, firstArrLength, arr.length -1);
        reverse(arr, 0, arr.length -1);
        return arr;

    }

    public static String reverseWords(String s) {
        Stack stck = new Stack();
		if (s == null || s.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			//if (!arr[i].equals("") ) {
                if( i != 0)
                    sb.append(arr[i]).append(" "); 
                else
                    sb.append(arr[i]);
			//}
		}
        //return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
        return sb.toString();
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int order = 8;
        System.out.println(".....:"+Arrays.toString(rotate(arr, order)));

        String s = "the sky is  blue";
        System.out.println("Reverse sentence:"+reverseWords(s)+":");
    }
}