public class ClassWork {
    public static void main(String[] args) {
        // String[] names = {"ali","ahmed"};
        // Integer[][] marks = {
        // /0 1 2 3/
        // /0/ {10,20,30,30},
        // /1/ {10,30,50,30},
        // /2/ {10,30,10,40},
        // /3/ {10,30,20,10}
        // };

        String students = System.console().readLine(); // input
        String Subjects = System.console().readLine();

        // Write code to initialize marks array of students x subjects;
        // write the conditions by yourself
        // for(int i=0;/**/; i++){
        // for(int j=0;/**/; j++){
        // marks[i][j] = Integer.parseInt(System.console().readLine());
        // }
        // }

        // Write code to display all entered marks

        // Marks of students of 0 are : 10, 20
        // Marks of students of 1 are : 10, 20
        // Marks of students of 2 are : 10, 20

        // System.out.print(marks[2][3]); // 40
        ArrayList<String> namesList = new ArrayList<String>();

        namesList.add("123");
        // namesList.size() 1
        // namesList[0] // 123
        String in = System.console().readLine();
        integer input = Integer.parseInt(in)
       do {
           
            if (input == "2") {
                // write you code to display data in array list using foreach loop
                // Total Students Are = 2;
                // Names are
                // Ali , Ahmed
            }
            // write your to code to save input data to arraylist
            // exit if user press -1
        }while(input!=-1)

    }
}
