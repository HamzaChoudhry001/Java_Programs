public class classtask {

    public static void Grademarks(){
        System.out.print("Enter marks :"); 
        String marks = System.console().readLine();

        Integer a = Integer.parseInt(marks);

        if(a >= 80){
            System.out.println("A Grade"); 
        }
        else if(a >=70 && a < 80){
            System.out.println("B Grade"); 
        }
        else if(a >=60 && a < 70){
            System.out.println("C Grade"); 
        }
        else if(a >=50 && a < 60){
            System.out.println("D Grade"); 
        }
        else{
            System.out.println("F Grade"); 
        }
    }
      public static void main(String[] args){
        Grademarks();    
        Grademarks();  
        Grademarks();  
        Grademarks();   

      }
   
        
       
}
