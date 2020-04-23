import java.util.*;
class Implementation{
    int root =0;
    String str[];
    Implementation(int size){
        this.str = new String[size];
    }

    //Create the root node-
    public void root(String s){
        str[0] = s;
    }

    //Create left child of node-
    public void set_LeftChild(String s,int root){
        //left child = (2*i)+1
        int temp = (2*root)+1;

        if(str[root] == null){
            System.out.println("Can't set child at no parent found\n");
        }
        else{
            str[temp] = s;
        }
    }

    public void set_RightChild(String s, int root){
        //right child =(2*i)+2;
        int temp = (2*root)+2;

        if(str[root] == null){
            System.out.println("Can't set child at no parent found\n");
        }
        else{
            str[temp] = s;
        } 
    }

    public void display(){
        for(int i=0; i<str.length;i++){
            if(str[i] != null){
                System.out.print(str[i] +"->");
            }
            else{
                System.out.println("~");
            }
        }
    }


    
}

class BTArray{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int size = sc.nextInt();
    

       Implementation obj = new Implementation(size);
       obj.root("A");
       obj.set_LeftChild("B",0);
       obj.set_RightChild("C",0);
       obj.set_LeftChild("D",1);
       obj.set_RightChild("E",1);
       obj.set_LeftChild("F",2);

       obj.display();
    }
}