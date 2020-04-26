import java.util.Scanner;
class Node{
    int data;
    Node next;

    public Node(int x){
        this.data =x;
        next =null;
    }
}
class Hashtable_Chaining{
    private Node[] table;
    private int size;

    Hashtable_Chaining(int tablesize){
        table = new Node[tablesize];
        size =0;
    }
    // Function to check if hash table is empty
    public boolean isEmpty(){
        return size == 0;
    }
    // function to clear hash table
    public void makeEmpty(){
        int l = table.length;
        table = new Node[l];
        size = 0;
    }

    //function to get size
    public int getSize(){
        return size;
    }

    // function to insert an element 
    public void insert(int value){
        size++;
        int pos = myhash(value);
        Node node = new Node(value);
        if(table[pos]== null){
            table[pos] = node;
        }
        else{
            node.next = table[pos];
            table[pos] = node;
        }
    }

    // function to remove an element
    public void remove(int value){
        int pos = myhash(value);
        Node start = table[pos];
        Node end = start;
        if(start.data == value){
            size--;
            table[pos] = start.next;
            return;
        }
        while(end.next != null && end.next.data != value){
            end = end.next;
        }
        if(end.next == null){
            System.out.println("Element not foudn \n");
        }
        size--;
        if(end.next.next == null){
            end.next = null;
            return;
        }
        end.next = end.next.next;
        table[pos] = start;
    }
    private int myhash(Integer x){
        int hashval = x % table.length;

        //if(hashval < 0){
        //    hashval += table.length;
        //}
        return hashval;
    }

    // Print the hashtable
    public void display(){
        System.out.println();

        for(int i=0; i< table.length;i++){
            System.out.print("Bucket "+i + ": ");
             
             Node start = table[i];
             while(start != null){
                 System.out.print(start.data+" ");
                 start = start.next;
             }
             System.out.println();
        }
    }
}

class HashTableMain

{ 

    public static void main(String[] args) 

    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hash Table Test\n\n");

        System.out.println("Enter size"); 

        /* Make object of HashTableChainingSinglyLinkedList */

        Hashtable_Chaining htc = new Hashtable_Chaining(scan.nextInt() );

 

        char ch;

        /*  Perform HashTableChainingSinglyLinkedList operations  */

        do    

        {

            System.out.println("\nHash Table Operations\n");

            System.out.println("1. insert ");

            System.out.println("2. remove");

            System.out.println("3. clear");

            System.out.println("4. size"); 

            System.out.println("5. check empty");

 

            int choice = scan.nextInt();            

            switch (choice)

            {

            case 1 : 

                System.out.println("Enter integer element to insert");

                htc.insert( scan.nextInt() ); 

                break;                          

            case 2 :                 

                System.out.println("Enter integer element to delete");

                htc.remove( scan.nextInt() ); 

                break;                        

            case 3 : 

                htc.makeEmpty();

                System.out.println("Hash Table Cleared\n");

                break;

            case 4 : 

                System.out.println("Size = "+ htc.getSize() );

                break; 

            case 5 : 

                System.out.println("Empty status = "+ htc.isEmpty() );

                break;        

            default : 

                System.out.println("Wrong Entry \n ");

                break;   

            }

            /* Display hash table */ 

            htc.display();  

 

            System.out.println("\nDo you want to continue (Type y or n) \n");

            ch = scan.next().charAt(0);                        

        } while (ch == 'Y'|| ch == 'y');  

    }

}