
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Integer array[]=new Integer[1000];
        Random rnd=new Random();
        HashSet<Integer>set= new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
            array[i]=rnd.nextInt(10001);
            set.add(array[i]);
        }
        System.out.println("Array Size::"+array.length);
        System.out.println("Set Size::"+set.size());
        System.out.print("Set={ ");
        
        Iterator<Integer> it = set.iterator();
         while(it.hasNext()){
                System.out.print(it.next()+",");
            }
        System.out.print(" }");
    }
}
