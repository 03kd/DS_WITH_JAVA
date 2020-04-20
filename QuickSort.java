class QuickSort {

    private int input[];
    private int length;

    public void sort(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    /*
     * This method implements in-place quicksort algorithm recursively.
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivot is middle index
        int pivot = input[low];

        // Divide into two arrays
        while (i <= j) {
            /**
             * As shown in above image, In each iteration, we will identify a
             * number from left side which is greater then the pivot value, and
             * a number from right side which is less then the pivot value. Once
             * search is complete, we can swap both numbers.
             */
            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }

        // calls quickSort() method recursively
        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public void display(){
        for(int i=0;i< input.length;i++){
            System.out.print(input[i]+" ");
        }
    }
}


class QuickSortDriver{
    public static void main(String []args){
        int arr[] = {9,5,7,3,16,5};
        QuickSort obj = new QuickSort();
        obj.sort(arr);
        obj.display();
    }
}
