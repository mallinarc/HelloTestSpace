package etc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * implementation of quick sort using end element as the pivot.
 */
public class QuickSortEndElementPIvot{


    // quick sort\
    static int[] quickSort(int[] arr, int low, int high){
        if(low < high){
            int partition = partition(arr, low, high);
            System.out.println(".....partition index:"+partition);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition+1, high);
        }

        return arr;
    }
    // find partition
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        System.out.println("pivot:"+pivot);
        int i = low -1;
       
        for(int j = low; j < high; j++){
            if(arr[j]< pivot){ 
                i++;             
                swap(arr, i, j);
               
            }
        }
        swap(arr, i+1, high);
        System.out.println("partinioned aarray:"+Arrays.toString(arr));
        return i+1;
    }

    private static void swap(int[] arr, int first, int second) {
        System.out.println("first:"+arr[first]+"second:"+arr[second]);
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        System.out.println("Array after swap:"+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        //int[] x = { 9, 2, 4, 7, 3, 7, 10, 6};4
        int[] x = {13, 19, 9, 5, 12, 8, 7, 4, 21 , 2, 6, 11};
		System.out.println(Arrays.toString(x));
 
		int low = 0;
        int high = x.length - 1;
        System.out.println("low:"+low+":High:"+high);
 
		quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
        
        /* Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 }; 
  
        // Set demonstration using HashSet Constructor 
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr)); 
  
        // Duplicate elements are not printed in a set. 
        System.out.println(set);  */
    }

}