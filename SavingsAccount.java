package oop;

public class SavingsAccount {
	  public String name;
	  public double balance;
	  public double interestRate = 0.1;

	  public void deposit(double sum) {
	    balance += sum;
	    System.out.println("Successful deposit" + sum + "new balance " + balance);
	  }

	  public void withdraw(double sum) {
	    if (sum > balance || sum < 0) {
	      System.out.println("Error");
	      return;
	    }
	    balance -= sum;
	    System.out.println("Successful withdraw" + sum + "new balance " + balance);
	  }
	}

