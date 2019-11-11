package com.company;
//Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() -
// возвращает текущий остаток на счете, deposit(double sum) - положить деньги на счет, withDraw(sum) - снимает указанную сумму со счета.


public class BankAccount {
    private float amount;

    public BankAccount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void deposit(float sum) {


        amount = +sum;

    }


    public void withDraw(float sum) throws Exception {
        amount -= sum;
        if (sum > amount) {

            throw new LimitException("Вы не можете снять больше денег чем у вас есть на банковском счете", amount);
        }


    }


}

