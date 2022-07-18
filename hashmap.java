import java.util.HashMap;

public class hashmap {
    
        public static void main(String[] args) {
            
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
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
                System.out.println("Enter Marks: ");
                Integer marks = Integer.parseInt(System.console().readLine());
                if(hm.containsKey(rollno)){
                    System.out.println("already exist ");
                }
                else{
                    hm.put(rollno, marks);
                }
                

            } 
            else if(press1==2){
                System.out.print("Enter serch roll no: ");
                String rollno1 = System.console().readLine();
                    System.out.println("Marks is "+hm.get(rollno1));
                   
                
            }
            else if(press1==3){
                System.out.println("all records is: ");
                System.out.println(hm);
            }  
            else{

            }   
        }
         
        }
    
    
}
