package threads;

public class AccountClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NAccount account=new NAccount(5000);
		
		TransactionThread t1=
				new TransactionThread(account, TransactionType.CREDIT, "Roger", 2000);
		TransactionThread t2=
				new TransactionThread(account, TransactionType.CREDIT, "\tAmy", 3500);
		TransactionThread t3=
				new TransactionThread(account, TransactionType.DEBIT, "\t\tCalvin", 10500);

		t3.start();
		try {
			Thread.sleep(10);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
//		try {
//			Thread.sleep(19000);
//			
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		System.out.println("Final Balance : "+account.getBalance());
	}

}
