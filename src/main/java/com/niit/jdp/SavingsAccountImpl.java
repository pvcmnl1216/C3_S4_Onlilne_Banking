/*
 * Author Name: Philip Meshach
 * Date: 30-08-2022
 * Praise The Lord
 */
package com.niit.jdp;

public class SavingsAccountImpl {
    public void main(String[] args){

        BankAccount bankAccount = new BankAccount() {
            @Override
            double toGetBalance() {
                return super.toGetBalance();
            }

            @Override
            double debitCash() {
                return super.debitCash();
            }

            @Override
            double creditCash() {
                return super.creditCash();
            }
        };
        double savingsAccountDebitCash = bankAccount.debitCash();
        double savingsAccountCreditCash = bankAccount.creditCash();
        double savingsAccountFundTransfer = bankAccount.toGetBalance();
        System.out.println("Debit Cash: " +savingsAccountDebitCash);
        System.out.println("savingsAccountCreditCash = " + savingsAccountCreditCash);
        System.out.println("savingsAccountDebitCash = " + savingsAccountDebitCash);
    }
}
