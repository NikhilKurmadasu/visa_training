package threads;

public class NAccountClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NAccount account=new NAccount(5000);
		
		NTransactionThread t1=
				new NTransactionThread(account, TransactionType.CREDIT, "Roger", 2000);
		NTransactionThread t2=
				new NTransactionThread(account, TransactionType.CREDIT, "\tAmy", 3500);
		NTransactionThread t3=
				new NTransactionThread(account, TransactionType.DEBIT, "\t\tCalvin", 5500);

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
