import java.util.Scanner;
import java.util.Scanner;
class SI
{
   public static void main(String args[])
   {
       float p,r,t,si;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter amount");
       p=sc.nextFloat();
       System.out.println("enter rate");
       r=sc.nextFloat();
       System.out.println("enter time");
       t=sc.nextFloat(); 
       si=(p*r*t)/100;
       System.out.println(si); 
   }

}