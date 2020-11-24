package com.company;

public class Accounts {


    private String customerFirstName;
    private String customerLastName;
    private String accountNumber;
    private int accountPin;

    public final String alphabet [] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z", " " };


    public Accounts(String customerFirstName, String customerLastName) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
    }

    public String getCustomerFirstName() {

        return customerFirstName;
    }

    public String getCustomerLastName() {

        return customerLastName;
    }

    public String getAccountNumber (){
        int totalLength = getCustomerFirstName().length() + getCustomerLastName().length();


        String accountNumber = getCustomerFirstName().charAt(0) + getCustomerLastName().charAt(0) + " - " + totalLength +
                getAccountPin();
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public int getAccountPin (){

        int firstNameLoc = 0;
        for (int i = 0; i > alphabet.length; i++){
            if (String.valueOf(getCustomerFirstName().charAt(0)).equalsIgnoreCase(alphabet[i])){
                firstNameLoc = i+1;
            }
            else {
                i++;
            }
        }
        int lastNameLoc = 0;
        for (int i = 0; i > alphabet.length; i++){
            if (String.valueOf(getCustomerLastName().charAt(0)).equalsIgnoreCase(alphabet[i])){
                lastNameLoc = i+1;
            }
            else {
                i++;
            }
        }

        int accountPin = firstNameLoc + lastNameLoc ;
        this.accountPin = accountPin;
        return accountPin;

    }
}





}
