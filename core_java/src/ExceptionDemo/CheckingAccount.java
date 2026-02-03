package ExceptionDemo;

public class CheckingAccount {

	private int accno;
	private String cname;
	private double balance;
	public CheckingAccount(int accno, String cnmae, double balance) {
		this.accno = accno;
		this.cname = cnmae;
		this.balance = balance;
		System.out.println("hello "+cname+" Your account number "+accno+" is oppend with "+balance);
	}
	public void deposit(double ammount) {
		this.balance = this.balance+ammount;
	}
	public void widhraw(double ammount) throws Insufficient {
		if(ammount <= this.balance) {
			this.balance = this.balance-ammount;
		}
		else {
			throw new Insufficient(ammount-this.balance);
		}
	}
	public void checkbalance() {
		System.out.println("Current balance : "+this.balance);
	}
}
