public class ifelse {
    public static void main(String[] args){
        System.out.print("Enter 1st value:"); 
        String a1 = System.console().readLine();

        System.out.print("Enter 2nd value :"); 
        String b1 = System.console().readLine();

        System.out.print("Enter 3rd value :"); 
        String c1 = System.console().readLine();

                                  Integer  a = Integer.parseInt(a1);
        Integer b = Integer.parseInt(b1);
        Integer c = Integer.parseInt(c1);

        if(a > b && a > c){
            System.out.print("a is greater"); 
        }
        else if(b > a && b > c){
            System.out.print("b is greater"); 
        }
        else{
            System.out.print("c is greater"); 
        }
    }
}
