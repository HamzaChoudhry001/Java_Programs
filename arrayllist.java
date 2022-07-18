import java.util.ArrayList;
public class arrayllist {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        do {
            System.out.println(" 1: ADD record");
            System.out.println(" 2: Display");
            System.out.println("-1:  Exit");
            System.out.print("Enter Your Choice::");
            String ins = System.console().readLine();
            Integer choice = Integer.parseInt(ins);
            switch (choice) {
                
                case 1: {
                    System.out.println("--------------------------------Add Student---------------------------------");
                    System.out.println();
                    System.out.print("EnterName::");
                    namesList.add(System.console().readLine());
                    System.out.print("Enter marks::");
                    Integer mark = Integer.parseInt(System.console().readLine());                 
                    marks.add(mark);                  
                    System.out.println("-----------------------------Added Successfully-------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("---------------------RESULT----------------------");

                    // write you code to display data in array list using foreach loop
                    for (int i=0; i<namesList.size(); i++) {
                        System.out.print("Students are: "+namesList.get(i) +":: Marks:"+marks.get(i));
                        System.out.println();
                    }
                                   
                    // Total Students ;
                    System.out.println("Total Students are: " + namesList.size());
                    break;
                }
                // exit if user press -1
                case -1:
                    System.exit(0);
                    // return;
            }
        } while (true);
    }
}
