class Node{
    int data;
    Node next;
}
class operations{
    Node top;
    public operations(){
        this.top = null;
    }

    public void push(int value){
        Node node = new Node();
        
        
        if(node == null){
            System.out.println("Stack is overflow");
        }
        
        //set the data
        node.data =value;
        node.next = top;
        top =node;
    }

    public void pop(){
        if(top== null){
            System.out.println("Stack is underflow");
        }
        System.out.println("Removing "+peek());
        // update the next
        top =top.next;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
   public void display() 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.printf("\nStack Underflow"); 
             
        } 
        else { 
            Node temp = top; 
            while (temp != null) { 
  
                // print node data 
                System.out.printf("%d->", temp.data); 
  
                // assign temp link to temp 
                temp = temp.next; 
            } 
        } 
    } 

}
class Mymain{
    public static void main(String []args){
        operations obj =new operations();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.push(4);
        obj.pop();
        obj.display();
        if(obj.isEmpty()){
            System.out.println("Stack is empty");

        }
        else{
            System.out.println("Stack is not empty");
        }
    }
}