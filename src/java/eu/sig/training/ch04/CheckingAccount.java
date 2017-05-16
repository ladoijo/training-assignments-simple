package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {
	private static final float INTEREST_PERCENTAGE = 0.01f;
	private int transferLimit = 100;
	
	public CheckingAccount() {
		super(INTEREST_PERCENTAGE);
		// TODO Auto-generated constructor stub
	}

	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
		if (amount.greaterThan(this.transferLimit)) {
			throw new BusinessException("Limit exceeded!");
		}
		return super.makeTransfer(counterAccount, amount);
	}
}
// end::CheckingAccount[]
