import java.util.HashMap;
import java.util.Map.Entry;
public class Hash {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> ds = new HashMap<String, HashMap<String, Integer>>();
        int temp =0;
        while(temp!=-1){
            System.out.print("Enter Rollno: ");
            String roll = System.console().readLine();
            int t = 0;
            while(t==0){
                System.out.print("Enter Subject name: ");
                String name = System.console().readLine();
                System.out.print("Enter marks: ");
                Integer marks = Integer.parseInt(System.console().readLine());
                if(ds.containsKey(roll)){
                    HashMap<String, Integer> ns = ds.get(roll);
                    ns.put(name, marks);
                    ds.put(roll,ns);
                }
                else{
                    HashMap<String, Integer> nss =new HashMap<String,Integer>();
                    nss.put(name,marks);
                ds.put(roll, nss);
                }
                System.out.print("press -1 to exit or press 0 to add more Subject: ");
                t = Integer.parseInt(System.console().readLine());
            }
            System.out.print("press -1 to exit or press any key to add another record: ");
            temp = Integer.parseInt(System.console().readLine());
        }
        System.out.println("------------------------RESULT IS--------------------------- ");

        for(Entry<String, HashMap<String, Integer>> s :ds.entrySet()){
            System.out.println(s.getKey() +":" +s.getValue());
        }
    }
}
