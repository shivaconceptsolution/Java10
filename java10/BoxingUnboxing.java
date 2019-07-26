class BoxingUnboxing
{
    public static void main(String args[])
    {
           Object o;
           int a=100;
           o=a;   //int to Object
           System.out.println(o);  //boxing
           int b;
           b=(int)o;  //object to integer 
           System.out.println(b);
           int c=2000;
           Integer i = new Integer(c);  //autoboxing
           System.out.println(i); 
           

    }


}