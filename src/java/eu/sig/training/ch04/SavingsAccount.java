package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
	
	private Account registeredCounterAccount;
	private static final float INTEREST_PERCENTAGE = 0.04f;
	
	public SavingsAccount() {
		super(INTEREST_PERCENTAGE);
		// TODO Auto-generated constructor stub
	}
	
	public Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
		Transfer result = super.makeTransfer(counterAccount, amount);
		if (result.getCounterAccount().equals(this.registeredCounterAccount)) {
			return result;
		} else {
			throw new BusinessException("Counter-account not registered!");
		}
	}
}
// end::SavingsAccount[]
