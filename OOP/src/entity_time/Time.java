package entity_time;

public class Time {
	private int hr;
	private int min;

	public Time(int h,int m)
	{
		this.hr=h;
		this.min=m;
	}
	
	public int getMin()
	{
		return this.min;
	}
	
	public int getHr()
	{
		return this.hr;
	}
	
	public static Time addtime(Time tt1,Time tt2)
	{
		int nh,nm;
		nm=tt1.getMin()+tt2.getMin();
		if(nm>=60)
		{
			nm=nm-60;
			nh=tt1.getHr()+tt2.getHr()+1;
		}
		else
			nh=tt1.getHr()+tt2.getHr();
		Time tt3 = new Time(nh,nm);
		return tt3;
	}
	public Time addTime(Time tt)
	{
		int nh,nm;
		nm=this.getMin()+tt.getMin();
		if(nm==60)
		{
			nm=0;
			nh=this.getHr()+tt.getHr()+1;
		}
		if(nm>60)
		{
			nm=nm-60;
			nh=this.getHr()+tt.getHr()+1;
		}
		else
			nh=this.getHr()+tt.getHr();
		Time tt3 = new Time(nh,nm);
		return tt3;
	}
}
