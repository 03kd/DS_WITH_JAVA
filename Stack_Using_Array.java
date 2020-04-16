class Stack{
    int MAXSIZE=7;
    int Top;
    int[] arr =new int[MAXSIZE];

    public boolean isEmpty(){
        return(Top <0);
    }
    Stack(){
        Top  = -1;
    }

    public boolean peek(){
        return (Top >= MAXSIZE-1);
    }

    public void push(int value){
        if(!peek()){
           // Top = Top+1;
            arr[++Top] =value;
            System.out.println("Item is pushed "+value);
            
        }
        else{
            System.out.println("Stack is overflow.");
        
        }
    }

    public void pop(){
        if(!isEmpty()){
            
            System.out.println("An item is pop out from stack "+arr[Top]);
            Top =Top-1;
        
        }
        else{
            System.out.println("Stack is underflow.");
            
        }
    }

    public void display(){
        for(int i=Top;i>0;i--){
            System.out.println(arr[i]);
        }
    }
}



class Mymain{
    public static void main(String []args){
        Stack obj = new Stack();
        
        
        obj.push(6);
        obj.push(5);
        //obj.display();
        obj.push(4);
        obj.pop();
        obj.push(3);
        

    }
}