
package encapsulation;

public class EncapsulationPratice
{
   private String accountNumber;
   private String accountHolderName;
   private String bvn;
   private double balance;
   private String accountType;
   

   
   
    EncapsulationPratice()
    {
       accountNumber="0000000000";
       accountHolderName="Unknown";
       bvn="00000000000";
       balance=1200304.00;
       accountType="Savings";
    }
    
    public EncapsulationPratice(String accountNumber,String accountHolderName,String bvn,double balance,String accountType)
    {
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.bvn=bvn;
        this.accountType=accountType;
    }
    public EncapsulationPratice(String accountNumber,String accountHolderName)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }
    
    
   
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBvn() {
        return bvn;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    
    
    
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void display()
    {
       System.out.printf("Account Number: %s%n",accountNumber);
       System.out.printf("Account HolderName: %s%n",accountHolderName);
       System.out.printf("Accout Balance: %f%n",balance);
       System.out.printf("BvN :%s%n",bvn);
       System.out.printf("Account Type: %s%n",accountType);
    
    } 
    
}   
    

    
