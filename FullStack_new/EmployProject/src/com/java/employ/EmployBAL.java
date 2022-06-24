package com.java.employ;

import java.util.List;

public class EmployBAL {

	static StringBuilder sb = new StringBuilder();
	static EmployDAO dao = new EmployDAO();
	
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
	public String addEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==true) {
			return dao.addEmployDao(employ);
		}
		return "";
	}
	public boolean isValid(Employ employ) throws EmployException {
		boolean flag=true;
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No Cannot be Zero or Negative...\r\n");
			flag = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Name Contains min. 5 characters...\r\n");
			flag = false;
		}
		if (employ.getDept().length() < 3) {
			sb.append("Department Contains min. 3 characters...\r\n");
			flag = false;
		}
		if (employ.getDesig().length() < 4) {
			sb.append("Designation Contains min. 4 characters...\r\n");
			flag = false;
		}
		if (employ.getBasic() < 20000 || employ.getBasic() > 90000) {
			sb.append("Basic Must be Between 20000 and 90000...\r\n");
			flag=false;
		}
		if (flag==false) {
			throw new EmployException(sb.toString());
		}
		return flag;
	}
}
