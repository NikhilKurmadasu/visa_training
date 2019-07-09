package com.visa.prj.entity;

public class Tv extends Product {
	private String screentype;

	public Tv() {
	}

	public Tv(int id, String name, double price, String screentype) {
		super(id, name, price);
		this.screentype = screentype;
	}

	public String getScreentype() {
		return screentype;
	}

	public void setScreentype(String screentype) {
		this.screentype = screentype;
	}

	@Override
	public boolean isExpensive() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
