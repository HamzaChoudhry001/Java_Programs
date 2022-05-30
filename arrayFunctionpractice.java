

public class arrayFunctionpractice {

    //1st Method
    // public void inputMarks(){
    //     int[] marks = new int[5];
    //     int total = 0;
    //     for(int i=0;i<5;i++){
    //         System.out.println("Enter marks of Sub" + (i+1));
    //         marks[i] = Integer.parseInt(System.console().readLine());
    //         total = total + marks[i];
    //     }
    //     System.out.println(total);
    
    // }
    //2nd Method
    // public static void inputMarks(){
    //     int[] marks = new int[5];
    //     int total = 0;
    //     for(int i=0;i<5;i++){
    //         System.out.println("Enter marks of Sub" + (i+1));
    //         marks[i] = Integer.parseInt(System.console().readLine());
    //         total = total + marks[i];
    //     }
    //     System.out.println(total);
    
    // }
    public static void main(String[] args) {
        //1st Method
        //arraypractice p = new arraypractice();
        //p.inputMarks();

        //2nd method
        //inputMarks();
        
        //
        int[] marks = new int[2];
        System.out.println("Sub1");
        marks[0] = Integer.parseInt(System.console().readLine());
        System.out.println("Sub2");
        marks[1] = Integer.parseInt(System.console().readLine());  
        System.out.println("Total " + (marks[0] + marks[1]));


    }
    
}
