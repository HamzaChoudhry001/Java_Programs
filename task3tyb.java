import java.util.Map.Entry;
import java.util.HashMap;
public class task3tyb {
    static HashMap<String,HashMap<String,Float>> db=new HashMap<String,HashMap<String,Float>>();

    public static void main(String[] args) {
        String roll_no="",subject="";
        Float marks;
        
    while(true){
        HashMap<String,Float> result=new  HashMap<String,Float>();
      System.out.println("---------------------------------------------------------");
      System.out.println("If student ROll# value -1 then program will be stopped\n -1 value of subject will save a student record");
      System.out.println("---------------------------------------------------------");
      System.out.print("\nEnter Student Roll#");
      roll_no=System.console().readLine();
      if(roll_no.equals("-1")){break;}
      else if(!db.containsKey(roll_no)){
        while(true){
            System.out.print("\nEnter Subject Name::");
            subject=System.console().readLine();
            if(subject.equals("-1")){break;}
            else{
                System.out.print("\nEnter Marks::");
                marks=Float.parseFloat(System.console().readLine());
                result.put(subject, marks);
            }
        }
        db.put(roll_no, result);

      }
      else{
       HashMap<String,Float> res =db.get(roll_no);
       for(Entry<String,Float> entry:res.entrySet()) {
        System.out.println("Marks Of Subject "+entry.getKey()+ " = "+entry.getValue());
      }
      }
      System.out.println("---------------------------------------------------------"+db);

      }
        }
}
