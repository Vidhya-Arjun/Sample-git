class EncapsEx
{
    private long Account_ID;
    private String Account_HolderName;
    private long Balance;
    private String IFSC_code;
    private String Account_type;
    private String Bank_Name;
    private String Branch_Name;

    public String getbankname()
    {
        return Bank_Name;
    }
    public String getbranchname()
    {
        return Branch_Name;
    }    
    public String getIfsccode()
    {
        return IFSC_code;
    }

    public long getbalance()
    {
        return Balance;
    }

    public String getname()
    {
        return Account_HolderName;
    }

    public long getAccountID()
    {
        return Account_ID;
    }

    public String getAccounttype()
    {
        return Account_type  ;
    
    }
    public void getbankname(String Value_Bank_name)
    {
         Bank_Name = Value_Bank_name;
    }
    public void getbranchname(String Value_Branch_name)
    {
         Branch_Name = Value_Branch_name;
    }    
    public void getIfsccode(String Value_IFSC_code)
    {
         IFSC_code = Value_IFSC_code;
    }

    public void getbalance(long Value_Balance)
    {
         Balance = Value_Balance;
    }

    public void getname(String Value_Account_HolderName)
    {
         Account_HolderName = Value_Account_HolderName;
    }

    public void getAccountID(long Value_Account_ID)
    {
         Account_ID = Value_Account_ID;
    }

    public void getAccounttype(String Value_Account_type)
    {
       Account_type = Value_Account_type  ;
    }

public static void main(String ar[])
{
    EncapsEx encap = new EncapsEx();
    encap.getbankname("KMBL");
    encap.getbranchname("CIT nagar");
    encap.getIfsccode("KKBK00010");
    encap.getbalance(100000);
    encap.getname("AJAY ARJUN");
    encap.getAccountID(9801019);
    encap.getAccounttype("Saving");
    
    System.out.println("ACCOUNT CREATION DETAILS");
    System.out.println("Bank Name : " +encap.getbankname());
    System.out.println("Branch Name: " +encap.getbranchname());
    System.out.println("IFSC CODE:" +encap.getIfsccode());
    System.out.println("Account Balance: " +encap.getbalance());
    System.out.println("Account Holder Name: " +encap.getname());
    System.out.println("Account Number: " +encap.getAccountID());
    System.out.println("Account Type: " +encap.getAccounttype());


}

}