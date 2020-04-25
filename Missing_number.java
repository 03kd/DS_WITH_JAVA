import java.util.*;

class MainDriver{
    public static void main(String[] args){
        int arr[] = {1,2,3,5,6};
        System.out.println("List ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing number ");
        int n = arr.length+1;
        int sum = Arrays.stream(arr).sum();
        //System.out.println(sum);
        int mis = n * (n+1)/2 - sum;

        System.out.println(mis);
    }
}