import java.util.Scanner;

public class Prime_Number
{
    
    public static void main(String args[])
    {
        String primeNumbers = "";
        
        for (int i = 1; i <= 100; i++)
        {
            int count = 0;
            for (int j = i; j>=1; j-- )
            {
                if(i%j==0)
                {
                    count = count + 1;
                }
                
            }        
            if (count==2)    
            {
            
              primeNumbers = primeNumbers + i + " ";

            }
          }
        
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);           
    }
}
