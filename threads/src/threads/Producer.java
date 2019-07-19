package threads;

public class Producer {
	
	Thread producer = Thread.currentThread();
	Resource r= new Resource(0); 
	
	r.setCount();

}
