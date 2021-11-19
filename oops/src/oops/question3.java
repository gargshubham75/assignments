package oops;

import java.util.*;

public class question3 {
	public void amount()
	{ 
		System.out.println(" amount in bank");
	}
}
class SavingAccount extends question3
{int fixedDeposite=5000;
public void amount()
{ 
  
	System.out.println("total amount in Saving account " +fixedDeposite);
}
}
class CurrentAccount extends question3
{int cashCredit= 10000;
	public void amount()
	
{
	System.out.println("total amount in current account "+ cashCredit);
}
	
}
class bankdetail {
	  public static void main(String[] args) {
	    SavingAccount SA = new SavingAccount();  // Create a saving account object
	    CurrentAccount CA = new CurrentAccount();  // Create a current account object
	    SA.amount();
	    CA.amount();
	   System.out.println("total amount in bank " + (SA.fixedDeposite+ CA.cashCredit));
	  }

}
