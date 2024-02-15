import java.util.Scanner;

public class stringOperations 
{
   public static void main(String args[])
   {
      String str;
      Scanner scan = new Scanner(System.in);
          
      System.out.println("Enter Your  Name : ");
      str = scan.nextLine();
          
      System.out.println("Hello, " + str);

      int len = str.length();
      System.out.println("Length of Entered String "+ str+" is " +len);
   }
}
    
