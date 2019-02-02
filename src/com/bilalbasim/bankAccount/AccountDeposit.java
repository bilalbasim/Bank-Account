package com.bilalbasim.bankAccount;

public class AccountDeposit extends AccountOperations {

    @Override
    public void performOperation(Account account) {
        double balance = account.getBalance();

        System.out.println("Current balance: " + balance);
        System.out.println("Please insert the money you wish to deposit: ");

        balance = balance + Double.parseDouble(InputScanner.getInstance().readInput());

        account.setBalance(balance);

        System.out.println("New account balance: " + account.getBalance());
    }

}