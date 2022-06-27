package com.java.dsp;

public class ConnectionString {

	private static ConnectionString cs;
	private ConnectionString() {}
	
	public static ConnectionString getInstance() {
		if (cs==null) {
			cs = new ConnectionString();
		}
		return cs;
	}
	
	public String getConnection(String db) {
		String result="";
		switch(db) {
			case "Oracle" :
				result = "Scott/Tiger";
				break;
			case "MySql" : 
				result = "root/Password123";
				break;
			case "SqlServer" : 
				result = "sa/Password123";
				break;
		}
		return result;
	}
}
