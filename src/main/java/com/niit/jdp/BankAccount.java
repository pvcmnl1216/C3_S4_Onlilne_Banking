/*
 * Author Name: Philip Meshach
 * Date: 29-08-2022
 * Praise The Lord
 */
package com.niit.jdp;

public abstract class BankAccount {

    String accontHolderName;
    long accountNumber;
    String ifscCode;
    String branchName;
    double accountBalance;

    double widthDrawAmount;
    double depositeAmount;
    double transferFunds;
    String modeOfOperation;
    boolean internetBanking;
    double interestRate;

    double toGetBalance() {

        return accountBalance;
    }

    double debitCash() {
        double interest = accountBalance * (interestRate / 100);
        double cash = accountBalance - interest;
        return cash;
    }

    double creditCash() {
        double credit = accountBalance + 100;
        return credit;
    }

}





