import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<Integer>();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.add(40);
        ds.add(50);
        //  ds.remove(0);
        // ds.set(0, 200);
     // System.out.println(ds.get(0));
        
           
            Iterator<Integer> it = ds.iterator();
            
            while(it.hasNext()){
                System.out.println(it.next());
            }

    }
}