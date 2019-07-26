class Reverse
{
    public static void main(String args[])
    {
          int num = 45237;
          int a,b,c,d,e;
          a=num%10;  //7
          num=num/10;  //4523
          b=num%10;  //3
          num=num/10;  //452
          c=num%10;   //2
          num=num/10; //45
          d=num%10 ; //5
          e=num/10;  //4 
          int rev =  a*10000+b*1000+c*100+d*10+e*1;
          System.out.println(rev);

    }



}
