class Mergesort {
    int arr_value[];
    int another_arr[];
    int size;

    public void sort(int arr[]){
        this.arr_value = arr;
        this.size = arr_value.length;
        this.another_arr =new int[size];
        mergesort(0,size-1);

    }
    public void mergesort(int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergesort(low, mid);
            mergesort(mid+1, high);
            merge(low, mid,high);
        }
    }
    public void merge(int low, int mid, int high){
        for(int i=low; i<=high;i++){
            another_arr[i] = arr_value[i];
        }
        int i= low;
        int j =mid+1;
        int k =low;

        while(i <= mid && j<= high){
            if(another_arr[i] <= another_arr[j]){
                arr_value[k] = another_arr[i];
                i++;
            }
            else{
                arr_value[k] = another_arr[j];
                j++;
            }

            k++;
        }

        while(i <=mid){
            arr_value[k] = another_arr[i];
            i++;
            k++;
        }
    }

    public void display(){
        for(int i=0; i<arr_value.length;i++){
            System.out.print(arr_value[i] +" ");
        }
    }
}


class MergeDriver{
    public static void main(String []args){
        int arr[] = {9,5,7,6,4,8,1,8,6,7,9};

        Mergesort ob = new Mergesort();
        ob.sort(arr);

        ob.display();
    }
}
