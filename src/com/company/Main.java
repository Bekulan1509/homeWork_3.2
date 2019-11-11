package com.company;

public class Main {

    public static void main(String[] args) {
BankAccount bankAccount = new BankAccount(10000);
        bankAccount.lastMoney();
while (true){
    try {
        bankAccount.withDraw(6000);
        System.out.println(bankAccount.getAmount());

    }catch (Exception ex){
        System.out.println(ex.getMessage());

    }

   break;

}






}


    }
