package com.driver;

public class Main {
    public static void main(String[] args) {

//        BankAccount b1=new BankAccount();
//        try{
//            System.out.println(b1.generateAccountNumber(4,28));
//        }catch (Exception e){
//            System.out.println("Error");
//        }

        SavingsAccount s1=new SavingsAccount("Parteke",1000,400,5);
        System.out.println(s1.getCompoundInterest(3,4));

    }
}