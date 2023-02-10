package etc;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OneMoreQuickSortPractice{

    // partition
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        System.out.println("array is:"+Arrays.toString(arr));
        return i+1;

    }

    // swap
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //quicksort
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partitionIdx = partition(arr, low, high);
            quickSort(arr, low, partitionIdx -1);
            quickSort(arr, partitionIdx+1, high);
        }
    }

    // main
    public static void main(String[] args) {
        int[] arr = {13, 19, 9, 5, 12, 8, 7, 4, 21 , 2, 6, 11};
        System.out.println(" inputArray:"+Arrays.toString(arr));
        // call quicksort
        quickSort(arr, 0, (arr.length-1));
        System.out.println(".....final sorted array:"+Arrays.toString(arr));
        int[] x = {13, 19, 9, 5, 12, 8, 7, 4, 21 , 2, 6, 11};
  
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        String s = "Ramesh";
        char[] chrArray = s.toCharArray();
        List<Character> chrList = new ArrayList<Character>(chrArray.length);

        for (char c: chrArray){
            chrList.add(c);
        }  
        

    }
}