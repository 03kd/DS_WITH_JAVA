import java.util.*;

class HeapDriver{

    public static void buildheap(int[] arr){
        int len = arr.length;
        for(int i=(arr.length-1)/2; i>=0; i--){
            heapify(arr,arr.length-1,i);
        }

    }

    public static void heapify(int[] arr, int len, int ind){
        int left = 2 * ind +1;
        int right =2 * ind +2;
        int max;

        if(left <= len && arr[left] > arr[ind]){
            max = left;
        }
        else{
            max = ind;
        }

        if(right <= len && arr[right] >arr[max]){
            max = right;
        }

        if(max != ind){
            exchange(arr,ind, max);
            heapify(arr, len, max);
        }
    }

    public static int[] operation(int[] arr){
        
        buildheap(arr);
        int sizeheap =arr.length-1;
        for(int i =sizeheap; i>0;i--){
            exchange(arr,i,0);
            sizeheap = sizeheap-1;
            heapify(arr,sizeheap,0);
        }
        return arr;
    }

    public static void exchange(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args){
        int[] a = {10,5,9,7,3,4,6};
    
        
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(a));

        System.out.println("=====================");
        a = operation(a);
        System.out.println("After Heap Sort");
        System.out.println(Arrays.toString(a));
    }
}