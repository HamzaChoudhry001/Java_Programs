public class valueinput{
    public static void main(String[] args){

        System.out.print("Enter value 1:"); 
        String val1 = System.console().readLine();

        System.out.print("Enter value 2:"); 
        String val2 = System.console().readLine();

        Integer num1 = Integer.parseInt(val1);
        Integer num2 = Integer.parseInt(val2);
        Integer num3 = num1 + num2;
        System.out.print(num3);
    }
}