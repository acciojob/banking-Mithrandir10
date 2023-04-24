package com.driver;



public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(){

    }
    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception

            super(name,balance,5000);
            this.tradeLicenseId=tradeLicenseId;
            if(balance<5000){
                throw new Exception("Insufficient Balance");

            }



    }

    public boolean isValid(String tradeLicenseId){

        for(int i=1;i<tradeLicenseId.length();i++){
            if(tradeLicenseId.charAt(i-1)==tradeLicenseId.charAt(i)){
                return false;
            }
        }
        return true;

    }

    public boolean makeValid(String tradeLicenseId){
        return true;

    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
       int[] freqarr=new int[123];
       boolean checkValid=isValid(this.tradeLicenseId);

       for(int i=0;i<tradeLicenseId.length();i++){
           freqarr[tradeLicenseId.charAt(i)]++;
       }


    }

}
