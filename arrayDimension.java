
public class arrayDimension {
    static String total;
    public static void main(String[] args) {
        

        System.out.print("Enter size student :");
        String Student = System.console().readLine();
        System.out.print("Enter no. subject :");
        String Subjects = System.console().readLine();

        Integer sb = Integer.parseInt(Subjects);
        Integer st = Integer.parseInt(Student);
        int[][] marks = new int[st][sb];

        for (int i = 0; i < st; i++) {
            for (int j = 0; j < sb; j++) {
                System.out.print("For Student "+(i+1)+" Enter Marks of subject"+ (j+1)+":");
                marks[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        // System.out.println("Array is : ");
        // for (int i = 0; i < st; i++) {
        //     for (int j = 0; j < sb; j++) {
        //         System.out.println("Marks of student " + (i+1) + " are: " + marks[i][j]);
        //         // total = total + marks[i][j];
        //         // System.out.println("Total: "+total);
        //     }
        // }
        System.out.println("---------Results--------");
        for (int i=0;i<marks.length;i++) {
            System.out.print("\nMarks of student #"+(i+1)+" are : ");
            for (Integer j : marks[i]) {
                System.out.print(j+" , ");
             }
        }



    }
}
