package threads;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		
		Resource t1=new Resource(1,ResourceType.PRODUCER);
		Resource t2=new Resource(ResourceType.CONSUMER);
		Resource t3=new Resource(ResourceType.CONSUMER);
		t1.start();
		t2.start();
		t3.start();
	}
}
