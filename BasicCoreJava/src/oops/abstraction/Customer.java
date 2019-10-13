package oops.abstraction;

public class Customer {

	public static void main(String[] args) {
		/*RBI acc;
		acc=new VIJAYA();
		acc.SavingAccount();
		acc.CurrentAccount();
		acc.DebitCard();
		acc.CreditCard();
		
		acc=new HDFC();
		acc.SavingAccount();
		acc.CurrentAccount();
		acc.DebitCard();
		acc.CreditCard();
		
		acc=new ICICI();
		acc.SavingAccount();
		acc.CurrentAccount();
		acc.DebitCard();
		acc.CreditCard();*/
		
		
		Customer obj=new Customer();
		obj.CreateAccount("HDFC");
		obj.CreateAccount("VIJAYA");
        obj.CreateAccount("ICICI");
        



	}
      public void CreateAccount(String bankname)
      {
    	  RBI acc=null;
    	  if(bankname.equals("VIJAYA"))
    	  {
  		acc=new VIJAYA();
      }else if(bankname.equals("ICICI"))
      {  acc=new ICICI();
      }
      else if(bankname.equals("HDFC"))
      { acc= new HDFC();
      }
    	  
  		acc.SavingAccount();
  		acc.CurrentAccount();
  		acc.DebitCard();
  		acc.CreditCard();
      }
}
