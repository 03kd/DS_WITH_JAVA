class Drive{
    public void Sort(int arr[]){
        int temp =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      //  print_array(arr);
    }

    void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       
        }
         System.out.println();
    }
}

class Bubble{
    public static void main(String []args){
        int arr[] = {5,2,6,13,7,2};
        Drive obj =new Drive();
        obj.Sort(arr);
        obj.print_array(arr);
    }
}