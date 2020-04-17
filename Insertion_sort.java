import java.util.*;


class Insertion{
    int arr[];
    int size;
    
    public void Insertion(int arr[], int size){
        this.arr = arr;
        this.size = size;
        for(int i =1; i<size;i++){
            //System.out.println(arr[i]);
            int value = arr[i];
            int pos = i;

            while(pos>0 && arr[pos-1] > value){
                arr[pos] = arr[pos-1];
                pos = pos-1;
            }
            arr[pos] = value;
        }
    }
        
    

    public void display(){
        for(int k =0;k<arr.length;k++){
             System.out.print(arr[k]+" ");
        }
    }
    
}
class InsertionDriver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        System.out.println("Enter the elements of array upto size"+ size);
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Insertion obj =new Insertion();
        obj.Insertion(arr, size);
        obj.display();
    }
}