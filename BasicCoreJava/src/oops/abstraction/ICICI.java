package oops.abstraction;

public class ICICI implements RBI{
	@Override
	public void SavingAccount() {
		System.out.println("ICICI saving account");
		
	}

	@Override
	public void CurrentAccount() {
		System.out.println("ICICI current account");
		
	}

	@Override
	public void CreditCard() {
		System.out.println("ICICI creditcard");
		
	}

	@Override
	public void DebitCard() {
		System.out.println("ICICI debitcard");
		
	}

}
