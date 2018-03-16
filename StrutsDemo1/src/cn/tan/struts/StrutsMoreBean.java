package cn.tan.struts;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import cn.tan.model.Student;

/**
 * 第三讲支持多个值
 * @author tan
 *
 */
public class StrutsMoreBean extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Student> students;
	



	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


	@Override
	public String execute() throws Exception {
		if(students!=null) {
			for(Student student :students) {
				System.out.println("--student:"+student.toString());
			}
		}
		
		return SUCCESS;
	}

}
