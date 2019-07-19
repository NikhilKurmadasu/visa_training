package threads;

public class Resource extends Thread{

	static int count=0;
	ResourceType type;
	static boolean flag;
	
	public Resource(ResourceType t) {
		this.type=t;
		flag=false;
	}
	
	public Resource(int n,ResourceType t) {
		this.type=t;
		flag=true;
	}
	@Override
	public void run() {
		if(this.type==ResourceType.PRODUCER && !flag) {
			addProduct(count);
			flag=true;
		}
		else if(this.type==ResourceType.CONSUMER && flag) {
			System.out.println(this.count);
			flag=false;
		}
		else if(this.type==ResourceType.PRODUCER && !flag) {
			System.out.println("Consumer didn't read the value so wait");
		}
		else {
			System.out.println("Producer didn't produce any new resources");
		}
	}

	public synchronized int getCount() {
		return count;
	}

	public synchronized void setCount(int count) {
		this.count = count;
	}
	
	public void addProduct(int a) {
		this.count=this.count+a;
	}
}
