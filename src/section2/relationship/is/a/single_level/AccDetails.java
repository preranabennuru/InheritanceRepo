package section2.relationship.is.a.single_level;

public class AccDetails {
	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount("123443565","50000","7%");
		System.out.println("account number is "+sa.accNo);
		System.out.println("balance is "+sa.balance);
		System.out.println("interest rate is "+sa.interestRate);
	}

}
