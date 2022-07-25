

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> lstStudent;
	
	static {
		lstStudent = new ArrayList<Student>();
	}
	
	public List<Student> showStudentDao() {
		return lstStudent;
	}
	
	public String updateStudentDao(Student studentNew) {
		Student studentOld = searchStudentDao(studentNew.getSno());
		if (studentOld != null) {
			studentOld.setName(studentNew.getName());
			studentOld.setCity(studentNew.getCity());
			studentOld.setCgp(studentNew.getCgp());
			return "Record Updated Successfully...";
		}
		return "Record Not Found...";
		
	}
	
	public String deleteStudentDao(int sno) {
		Student student = searchStudentDao(sno);
		if (student != null) {
			lstStudent.remove(student);
			return "Record Deleted Successfully...";
		} 
		return "Record Not Found...";
	}
	public Student searchStudentDao(int sno) {
		Student result = null;
		for (Student student : lstStudent) {
			if (student.getSno()==sno) {
				result=student;
				break;
			}
		}
		return result;
	}
	public String addStudentDao(Student student) {
		lstStudent.add(student);
		return "Student Record added Successfully...";
	}
	
	public String readStudentDao() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("c:/files/Student.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		lstStudent = (List<Student>)objin.readObject(); 
		objin.close();
		fin.close();
		return "File Read Successfully...";
	}
	
	public String writeStudentDao() throws IOException {
		FileOutputStream fout = new FileOutputStream("c:/files/Student.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(lstStudent);
		objout.close();
		fout.close();
		return "File Read Successfully...";
	}
}
