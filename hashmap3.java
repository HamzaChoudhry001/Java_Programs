import java.util.ArrayList;
import java.util.HashMap;
public class hashmap3 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> ds = new HashMap<String, ArrayList<String>>();

        //ArrayList<String> hm = new ArrayList<String>();
        HashMap<String,ArrayList<String>> ls = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String> ls1 = new ArrayList<String>();
        boolean check = true;
        while(check!=false){
            System.out.println("press 1 to enter record: ");
            System.out.println("press 2 to search record: ");
            System.out.println("press 3 to Show all record: ");
            System.out.println("press -1 to exit::");
            Integer press1 = Integer.parseInt(System.console().readLine());
            if(press1==-1)   {
                check = false;
                break;
            } 
            else if(press1==1){
                System.out.println("Enter Rollno: ");
                String rollno = System.console().readLine();
                System.out.println("Enter name: ");
                String name = System.console().readLine();
                System.out.println("Enter Subject: ");
                String Subject = System.console().readLine();
                //ls.add(name);
                
                ls1.add(Subject);
                ls.put(name, ls1);
               // ds.put(rollno,ls);
                ds.put(rollno, ls1);
                



            }
            else if(press1==2){
                System.out.print("Enter serch roll no: ");
                String rollno1 = System.console().readLine();
                
                    System.out.println("Marks of rollno "+rollno1 + " is " +ds.get(rollno1));
                
                
            }
            else if(press1==3){
               
                    System.out.println("Result: "+ds);
                
                
            }
        }


        // HashMap<String,ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        // //list1
        // ArrayList<String> list1 = new ArrayList<String>();
        // list1.add("Urdu");
        // list1.add("English");
        // list1.add("AI");
        // //list2
        // ArrayList<String> list2 = new ArrayList<String>();
        // list2.add("MAD");
        // list2.add("Sci");
        // list2.add("C++");
        // hm.put("1", list1);
        // hm.put("2", list2);
        // System.out.println("REsult: "+list1);

       
    }
    
}
