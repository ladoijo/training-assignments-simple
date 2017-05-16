package eu.sig.training.ch04;

public abstract class Account {

	private float interestPercentage;
    private Money balance = new Money();
    
	public Account(float interestPercentage) {
		this.interestPercentage = interestPercentage;
	}

	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException{
		if (Accounts.isValid(counterAccount)) {
        	CheckingAccount acct = (CheckingAccount) Accounts.findAcctByNumber(counterAccount);
            return new Transfer(this, acct, amount);
        } else{
        	throw new BusinessException("Invalid account number!");
        }
	}

	public void addInterest() {
	    Money interest = balance.multiply(interestPercentage);
	    if (interest.greaterThan(0)) {
	        balance.add(interest);
	    } else {
	        balance.substract(interest);
	    }
	}
}