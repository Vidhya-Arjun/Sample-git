interface Calculator
{ 
    public int add(int x, int y);
    public int subtract(int x, int y);
    public int multiply(int x, int y);
    public float divide(int x, int y);
    public int modulus(int x, int y);
}
public class Calc implements Calculator
{
    public int add(int r, int q)
    {
        return (r+q);
    }
    public int subtract(int r, int q)
    {
        return (r-q);
    }
    public int multiply(int r, int q)
    {
        return (r*q);
    }
    public float divide(int r, int q)
    {
        return (r/q);
    }

    public int modulus(int r, int q)
    {
        return (r%q);
    }
public static void main(String arg[])
{
   int w= 8;
   int z = 5 ;
    Calculator ob = new Calc();
    System.out.println ("The Sum is " +ob.add(w, z)) ;  
    System.out.println ("The Differece is " +ob.subtract(w,z)) ;  
    System.out.println ("The product is " +ob.multiply(w,z)) ;  
    System.out.println ("The division is " +ob.divide(w,z)) ;  
    System.out.println ("The modulus is " +ob.modulus(w,z)) ;
}
}
