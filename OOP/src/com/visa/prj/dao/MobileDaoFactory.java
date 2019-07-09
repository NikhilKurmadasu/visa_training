package com.visa.prj.dao;

import java.util.ResourceBundle;

public class MobileDaoFactory {

	private static String NAME = "";
	static {
		ResourceBundle res=ResourceBundle.getBundle("config");
		NAME = res.getString("MOBILE_DAO").trim();
	}
	
	public static MobileDao getMobileDao() {
		// TODO Auto-generated method stub
		//return new MobileDaoMongoImpl();
		try {
		return (MobileDao) Class.forName(NAME).newInstance();
		} catch(Exception exception) {
		exception.printStackTrace();
	}
		return null;
		}

}
