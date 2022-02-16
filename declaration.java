public class declaration {


 // comment: 3 no ans ;   My Name:Md. Mehedi Hasan  id :201400041  
 static boolean val1;
 static double val2;
 static float val3;
 static int val4;
 static long val5;
 static String val6;  





// Comment:  1. java program to display your name along with your ID. My Name:Md. Mehedi Hasan  id :201400041  
    public static void main(String []args){
       String name = "Md. Mehedi Hasan";
       int id = 201400041 ;
       System.out.println("Name="+name + " " + "Id="+id);
      
  // Comment: 2No solve : My Name:Md. Mehedi Hasan  id :201400041  
         // comment: first string uppercase to lowercase 
      String firstString = "I AM STUDENT OF CSE DEPARTMENT" ;
      System.out.println(firstString.toLowerCase());
       
      // comment: second string  lowercase to uppercase  
      String secondString = "one day we will die and it's an universal truth";
      System.out.println(secondString.toUpperCase());  


      



// comment: 3 no ans


    System.out.println("Default values.....");
    System.out.println("Val1 = " + val1);
    System.out.println("Val2 = " + val2);
    System.out.println("Val3 = " + val3);
    System.out.println("Val4 = " + val4);
    System.out.println("Val5 = " + val5);
    System.out.println("Val6 = " + val6);



     // Comment: find the length of primative data types :  My Name:Md. Mehedi Hasan  id :201400041 
     System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
      System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
      System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
      System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
      System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
      System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
      System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");

       
    }
}