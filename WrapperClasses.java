
public class WrapperClasses {
    public static void main(String[] args) {
        String s1 = System.console().readLine();//value in string 
        String s2 = System.console().readLine();

        Integer sum = Integer.parseInt(s1) + Integer.parseInt(s2); //convert into integer
        System.out.println(sum.toString());
        
    }
    
}
