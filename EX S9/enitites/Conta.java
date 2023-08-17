package enitites;

public class Conta {

private int accountNumber;
private String accountHolder;
private double initialBalance;

public Conta(int accountNumber, String accountHolder, double initialBalance){
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.initialBalance = initialBalance;
}

public Conta(int accountNumber, String accountHolder){
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
}

public int getAccountNumber(){
    return accountNumber;
}

public String getAccountHolder (){
    return accountHolder;
}

public void setAccountHolder(String accountHolder){
    this.accountHolder = accountHolder;

public void withdraw(double cash){
    this.initialBalance + cash;
}






}
}