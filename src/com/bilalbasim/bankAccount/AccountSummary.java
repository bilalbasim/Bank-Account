package com.bilalbasim.bankAccount;
public class AccountSummary extends AccountOperations {

    @Override
    public void performOperation(Account account) {
        System.out.println("Account current balance: " + account.getBalance());
    }

}