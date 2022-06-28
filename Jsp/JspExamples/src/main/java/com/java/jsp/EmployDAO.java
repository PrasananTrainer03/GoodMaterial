package com.java.jsp;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	static List<Employ> employList = new ArrayList<Employ>();
	
	static {
		employList.add(new Employ(1,"Girsih","Java","Programmer",88423));
		employList.add(new Employ(2,"Shubham","Dotnet","Developer",88234));
		employList.add(new Employ(3,"Aakash","Angular","Developer",98234));
		employList.add(new Employ(4,"Maheshwari","React","Designer",78234));
		employList.add(new Employ(5,"Deepika","UI","Manager",90234));
		employList.add(new Employ(6,"Akylaveni","SAP","ABAP",97234));
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
}
