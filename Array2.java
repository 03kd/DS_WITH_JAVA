class Array2{
    // var-name = new type [size];
    // when an array is declared, only a reference of array is created.To actually
    // create or give memory to array, you create an array like this.

    // ex; int[] intarray = new int[20];

}
// Array of objects
class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
//Elements of array are objects of a class student.

class Ele_Student{
    public static void main(String[] args){
        // declares an array of integers.
        Student[] arr;
        
        //allocating memory for 5 objects
        arr = new Student[5];

        //initalize the second elements of the array.
        arr[0] = new Student(1,"kd");
        arr[1] = new Student(2, "pk");
        arr[2] = new Student(3, "ab");
        arr[3] = new Student(4, "vc");
        arr[4] = new Student(5, "abs");

        //acessing the elements of array
        for (int i=0; i<arr.length;i++){
            System.out.println("Elements at "+i + ":"+ arr[i].roll_no +" "+ arr[i].name);

        }
    }
}