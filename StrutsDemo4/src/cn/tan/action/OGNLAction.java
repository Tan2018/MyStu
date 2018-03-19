package cn.tan.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import cn.tan.entity.Student;
/**
 * Object-Graph Navigation Languageʹ�ò���
 * @author tan
 *
 */
public class OGNLAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private Student student;
	private List<Student> list;
	private Map<String ,String> map;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		ActionContext actionContext  = ActionContext.getContext();
		ValueStack valueStack = actionContext.getValueStack();
		valueStack.set("name", "valueStack");//����ֵջ��ֵ
		
		Map<String, Object> session = actionContext.getSession();
		session.put("name", "sessionVal");
		
		Map<String, Object> application = actionContext.getApplication();
		application.put("name", "applVal");
		
		//����javaBean ����Ҫ��action�ж���Student����get��set����
		student = new Student("tan", "��", "18");
		
		//���ʼ��϶���Ҫ��action�ж���List����get��set����
		Student s2 = new Student("s2", "��", "19");
		list = new ArrayList<>();
		list.add(student);
		list.add(s2);
		//����map��Ҫ��action�ж���Map����get��set����
		map = new HashMap<>();
		map.put("name", "tan");
		map.put("age", "25");
		
		return SUCCESS;
	}

}
