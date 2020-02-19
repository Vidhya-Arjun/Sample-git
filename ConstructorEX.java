class ConstructorEx
{
     double principle_Amount;
     int Number_of_years;
     float rate_of_interest;
   
     ConstructorEx()
    {
         principle_Amount = 10000.00;
         Number_of_years = 2;
         rate_of_interest = 10;
    }
    void calculate()
    {
        double Simple_Interest = (principle_Amount * Number_of_years * rate_of_interest)/100 ;
        System.out.println("The Simpile Interest Amount is: " +Simple_Interest );
    }
   public static void main(String[] args)
    {
        ConstructorEx ob = new ConstructorEx();
        ob.calculate(); 
    }
}
