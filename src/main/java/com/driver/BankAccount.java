package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public String getName() {
        return name;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public BankAccount(){

    }

    public BankAccount(String name, double balance, double minBalance) {

        this.name=name;
        this.balance=balance;

        this.minBalance=minBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNum(int digits, int sum, String res){

        if(digits<0 || sum<0){
            return "";
        }

        if(digits==0 && sum==0){
            return res;
        }
        String temp="";
        for(int i=0;i<=9;i++){
            res+="" + ((char)('0'+i));
            temp=getAccountNum(digits-1,sum-i,res);
            if(temp.length()!=0){
                return temp;
            }
        }
        return temp;

    }
    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        String res=getAccountNum(digits,sum,new String(""));
        if(res.length()!=0){
            return res;
        }else{
            throw new Exception("Account Number can not be generated");
        }

    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance+=amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance

        if(amount>balance){
            throw new Exception("Insufficient Balance");
        }else{
            this.balance=this.balance-amount;
        }
    }

}