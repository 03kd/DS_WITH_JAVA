class Array{
    public static void main(String[] args){
        
        String[] cars ={"volvo", "BMW", "ford", "audi"};
        
        //Accessing the elements of an array
        System.out.println(cars[0]);

        //change an array element
        cars[1] ="Jaguar";
        System.out.println(cars[1]);

        //array length
        System.out.println(cars.length);

        //loop through an array
        /*
        for (int i = 0; i<cars.length;i++){
            System.out.println("Name: "+cars[i]);
        }*/

        //Loop through an array with for-each
        for (String i: cars){
            System.out.println(i);
        }
        /* NOte:
        In case of primitives data types, the actual values are stored in contiguous memory locations.
        In case of object of a class, the actual objects are stored in heap segment.
        */
        
    }
}