

import java.io.IOException;
import java.util.List;

public class StudentBAL {

	static StringBuilder sb = new StringBuilder();
	
	public String writeStudentBal() throws IOException {
		return new StudentDAO().writeStudentDao();
	}
	public String readStudentBal() throws ClassNotFoundException, IOException {
		return new StudentDAO().readStudentDao();
	}
	public boolean validateStudent(Student student) {
		boolean isAdded=true;
		if (student.getSno() <= 0) {
			isAdded=false;
			sb.append("Student No Cannot be Negative\r\n");
		}
		if (student.getName().length() <= 5) {
			isAdded=false;
			sb.append("Student Name Contains min. 5 characters\r\n");
		}
		if (student.getCity().length() <= 5) {
			isAdded=false;
			sb.append("Student City Contains min. 5 characters\r\n");
		}
		if (student.getCgp() <= 0) {
			isAdded=false;
			sb.append("CGP Cannot Be Negative...");
		}
		return isAdded;
	}
	
	public Student searchStudentBal(int sno) {
		return new StudentDAO().searchStudentDao(sno);
	}
	
	public String updateStudentBal(Student student) throws StudentException {
		if (validateStudent(student) == true) {
			return new StudentDAO().updateStudentDao(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
	public String deleteStudentBal(int sno) {
		return new StudentDAO().deleteStudentDao(sno);
	}
	public List<Student> showStudentBal() {
		return new StudentDAO().showStudentDao();
	}
	public String addStudentBal(Student student) throws StudentException {
		if (validateStudent(student) == true) {
			return new StudentDAO().addStudentDao(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
}
