package entity_time;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testAddTime() {
		Time t1=new Time(2,35);
		Time t2=new Time(3,35);
		Time exp=new Time(6,10);
		Time ans=Time.addtime(t1,t2);
		assertEquals(exp.getHr(),ans.getHr());
		assertEquals(exp.getMin(),ans.getMin());
	}

}
