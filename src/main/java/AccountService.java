package edu.se; 

import java.util.HashMap; 

import java.util.Map; 

import java.util.Random; 

public class AccountService { 

    private Map<String, Account> accounts = new HashMap<>(); 

    public Account createAccount(String type, 

                                 String holderName, 

                                 double balance) { 

        Random random = new Random(); 

        StringBuilder accountNumber = new StringBuilder(); 

        for (int i = 0; i < 16; i++) { 

            accountNumber.append(random.nextInt(10)); 

        } 

        Account account = new Account( 

                accountNumber.toString(), 

                type, 

                holderName, 

                balance 

        ); 

        accounts.put(accountNumber.toString(), account); 

        return account; 

    } 

    public void updateAccount(String accountNumber, 

                              String holderName, 

                              double balance) { 

        Account account = accounts.get(accountNumber); 

        if (account != null) { 

            account.setHolderName(holderName); 

            account.setBalance(balance); 

        } 

    } 

    public void deleteAccount(String accountNumber) { 

        accounts.remove(accountNumber); 

    } 

} 