import java.util.Scanner;
class Ebill
{
   public static void main(String args[])
  {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter unit price");
          Object up=sc.nextInt();
          System.out.println("enter total consumption"); 
          float con = sc.nextFloat();
          float total = (int)up*con;
           System.out.println("total bill is "+total); 
         


  }


}