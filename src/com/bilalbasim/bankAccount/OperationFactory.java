package com.bilalbasim.bankAccount;

public class OperationFactory {

    public AccountOperations getOperation(String operation) {

        if(operation.equals("1")) {
            return new AccountSummary();
        } else if(operation.equals("2")) {
            return new AccountDeposit();
        }

        return null;

    }

}