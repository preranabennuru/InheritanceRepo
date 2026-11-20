package section2.relationship.is.a.single_level;

public class SavingsAccount extends Account {
	String interestRate;

	public SavingsAccount(String accNo, String balance, String interestRate) {
		super(accNo, balance);
		this.interestRate = interestRate;
	}
	

}
