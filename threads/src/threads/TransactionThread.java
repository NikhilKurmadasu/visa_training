package threads;

public class TransactionThread extends Thread {

	private NAccount account;
	private TransactionType type;
	private String name;
	private double amt;
	
	public TransactionThread(NAccount account, TransactionType type,String name,double amt) {
		this.account=account;
		this.amt=amt;
		this.name=name;
		this.type=type;
	}
	
	@Override
	public void run() {
		if(type==TransactionType.CREDIT) {
			account.deposit(name, amt);
		}
		else {
			account.withdraw(name, amt);
		}
	}
}
