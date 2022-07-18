import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class hashamapyutb {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> ds = new HashMap<String, HashMap<String, Integer>>();
        int temp = 0;
        while (temp != -1) {
            System.out.println("Enter Rollno: ");
            String rollno = System.console().readLine();
            int t = 0;
            while (t == 0) {
                System.out.println("Enter Subject name: ");
                String name = System.console().readLine();
                System.out.println("Enter marks: ");
                Integer marks = Integer.parseInt(System.console().readLine());
                if (ds.containsKey(rollno)) {
                    HashMap<String, Integer> ns = ds.get(rollno);
                    ns.put(name, marks);
                    ds.put(rollno, ns);
                } else {
                    HashMap<String, Integer> ns = new HashMap<String, Integer>();
                    ns.put(name, marks);
                    ds.put(rollno, ns);
                }
                System.out.println("press 0, to add marks of another subject: ");
                t = Integer.parseInt(System.console().readLine());

            }
            System.out.println("press -1, to Exit or Press Any Key to continue: ");
            temp = Integer.parseInt(System.console().readLine());
        }
        // for (String i : ds.keySet()) {
        //     System.out.println(i);
        // }
        // for (HashMap<String, Integer> i : ds.values()) {
        //     System.out.println(i);
        // }

        for (Entry<String, HashMap<String, Integer>> employeeEntrySet :ds.entrySet()) {
        Map<String, Integer> valueMap = employeeEntrySet.getValue();
        System.out.println(valueMap.entrySet());
        }

    }

}
