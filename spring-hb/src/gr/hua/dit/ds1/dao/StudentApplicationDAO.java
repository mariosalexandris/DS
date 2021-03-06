package gr.hua.dit.ds1.dao;

import java.util.List;

import gr.hua.dit.ds1.entity.StudentApplication;


public interface StudentApplicationDAO {
	public List<StudentApplication> getStudentApps();
	public StudentApplication addStudentApp(StudentApplication id);
	public String deleteStudentApp(int id);
}
