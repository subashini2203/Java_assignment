 class BankAccount{
    private String accountNumber;
    private double balance;
    BankAccount(String accno){
        accountNumber=accno;;

    }
 

public String getAccountNumber(){
    return accountNumber;
}
public void setBalance(double bal){
    balance=bal;
}
public double getBalance(){
    return balance;
}
 }

public class Encapsulation {
    public static void main(String[] args){
        BankAccount account=new BankAccount("Ac12346");
       
        account.setBalance(5000.75);
        System.out.println("accountnumber:"+account.getAccountNumber());
        System.out.println("balance:"+account.getBalance());


    }
    
}
