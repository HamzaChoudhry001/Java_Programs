public class fivedimenstion {
    public static void main(String[] args) {
        System.out.println("Plz, Enter Semester: ");
        String semester = System.console().readLine();
        System.out.println("Plz, Enter Section: ");
        String section = System.console().readLine();
        System.out.println("Plz, Enter no. of Students: ");
        String student = System.console().readLine();
        System.out.println("Plz, Enter no. of subjects: ");
        String subject = System.console().readLine();

        Integer sm = Integer.parseInt(semester);
        Integer sec = Integer.parseInt(section);
        Integer stu = Integer.parseInt(student);
        Integer sbj = Integer.parseInt(subject);

        int[][][][] marks= new int[sm][sec][stu][sbj];

        for(int a=0; a<sm; a++){
            for(int b=0; b<sec; b++){
                for(int c=0; c<stu; c++){
                    for(int d=0; d<sbj; d++){
                        System.out.println("Plx, Enetr Marks of subjec: "+d);
                        marks[a][b][c][d] = Integer.parseInt(System.console().readLine());

                    }
                }
            }
        }
        System.out.println("Array is : ");
        for(int a=0; a<sm; a++){
            for(int b=0; b<sec; b++){
                for(int c=0; c<stu; c++){
                    for(int d=0; d<sbj; d++){
                        // System.out.println("Marks of semster: "+a+" and section of "+b+" Student "+c+" of subjec "+d+ " is "  +marks[a][b][c][d] );
                        System.out.println("Semester is: "+a);
                        System.out.println("Section is: "+b);
                        System.out.println("Students is: "+c);
                        System.out.println("Subject is: "+d);
                        System.out.println("Marks is: "+marks[a][b][c][d]);
                        System.out.println("-----------------------------------------");

                    }
                }
            }
        }


    }
    
}
