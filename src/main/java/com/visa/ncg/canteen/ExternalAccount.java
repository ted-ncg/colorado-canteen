package com.visa.ncg.canteen;

public class ExternalAccount {

  private int balance;

  public ExternalAccount() {
    balance = 0;
  }

  public ExternalAccount(int initialBalance) {
    balance = initialBalance;
  }

  public int getBalance() {
    return balance;
  }

  public void withdraw (int amount)throws Exception{

    balance -= amount;

      if (balance < 0)
       throw new InsufficientFundsExceptions();

  }
}