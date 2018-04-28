
public class BankAccount {
	static int balance = 13548;
	String accountType = "Savings";

	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		System.out.println(b.balance);
		System.out.println(b.accountType);
	}
}
