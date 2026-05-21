import java.util.*;

public class bubble_sort{
    static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {5,2,1,8,9};
        int n = arr.length;
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println(" ");
        bubbleSort(arr,n);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}