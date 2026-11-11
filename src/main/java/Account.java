package edu.se; 

public class Account { 

    private String accountNumber; 

    private String type; 

    private String holderName; 

    private double balance; 

    public Account(String accountNumber, String type, 

                   String holderName, double balance) { 

        this.accountNumber = accountNumber; 

        this.type = type; 

        this.holderName = holderName; 

        this.balance = balance; 

    } 

    public String getAccountNumber() { 

        return accountNumber; 

    } 

    public String getType() { 

        return type; 

    } 

    public String getHolderName() { 

        return holderName; 

    } 

    public double getBalance() { 

        return balance; 

    } 

    public void setType(String type) { 

        this.type = type; 

    } 

    public void setHolderName(String holderName) { 

        this.holderName = holderName; 

    } 

    public void setBalance(double balance) { 

        this.balance = balance; 

    } 

}