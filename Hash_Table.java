import java.util.Hashtable;
import java.util.Enumeration;

class HashMain{
    public static void main(String[] args){
        Enumeration names;
        String key;

        // Creating a hashtable

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        hashtable.put("A", "Apple");
        hashtable.put("B", "Berry Berry");
        hashtable.put("C", "Carrot");
        hashtable.put("M", "Mango");

        names = hashtable.keys();

        while(names.hasMoreElements()){
            key =(String)names.nextElement();

            System.out.println("Keys :"+ key+ " Value: "+ hashtable.get(key));
        }

        System.out.println("Size of hashtable " + hashtable.size());
    }
}

