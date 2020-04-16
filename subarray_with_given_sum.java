import java.util.*;

class solution{
    
    public void sum_index(int a[], int sum){
        for(int i=0;i<a.length;i++){
            int curr_sum =a[i];

            for(int j=i+1;j<a.length;j++){

                
                if(sum == curr_sum){
                    System.out.print(i+" and "+(j));
                 
                }
                
                if(curr_sum >sum || j == a.length){
                    break;
                }
                curr_sum = curr_sum + a[j];
        
            }
        }
    }
    
}



class Mymain{
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the value");
        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum of array want ");
        int sum = sc.nextInt();
        
        solution obj =new solution();
        obj.sum_index(arr, sum);
    }
}