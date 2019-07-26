import java.util.Scanner;
class Complex
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int r1,i1,r2,i2,r,i;
      System.out.println("enter real number and imaginary number for first complex number");
      r1=sc.nextInt();
      i1=sc.nextInt();
 System.out.println("enter real number and imaginary number for second complex number");
      r2=sc.nextInt();
      i2=sc.nextInt();
      r=r1+r2;
      i=i1+i2;
      System.out.println(r1 + "+" + i1 + "i");  
      System.out.println(r2+"+"+i2+"i");  
      System.out.println("Addition");
      System.out.println(r+"+"+i+"i");  
      r= r1*r2-i1*i2;
      i=r1*i2+r2*i1;  
      System.out.println("Multiplication");
      System.out.println(r+"+"+i+"i");  
 


   }



}