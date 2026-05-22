import java.util.*;

public class insertion_sort {
    static void insertionSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {5,2,1,8,9};
        int n = arr.length;
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println(" ");
        insertionSort(arr, n);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
