 class BankAccount{
    private String accountNumber;
    private double balance;

public void setAccountNumber(String accNo){
    accountNumber=accNo;
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

public class Encapsulation {
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        account.setAccountNumber("Ac123456");
        account.setBalance(5000.75);
        System.out.println("accountnumber:"+account.getAccountNumber());
        System.out.println("balance:"+account.getBalance());


    }
    
}
}