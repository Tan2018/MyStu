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
 * Object-Graph Navigation Language使用测试
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
		valueStack.set("name", "valueStack");//设置值栈的值
		
		Map<String, Object> session = actionContext.getSession();
		session.put("name", "sessionVal");
		
		Map<String, Object> application = actionContext.getApplication();
		application.put("name", "applVal");
		
		//访问javaBean 对象，要在action中定义Student对象及get、set方法
		student = new Student("tan", "男", "18");
		
		//访问集合对象，要在action中定义List对象及get、set方法
		Student s2 = new Student("s2", "男", "19");
		list = new ArrayList<>();
		list.add(student);
		list.add(s2);
		//访问map，要在action中定义Map对象及get、set方法
		map = new HashMap<>();
		map.put("name", "tan");
		map.put("age", "25");
		
		return SUCCESS;
	}

}
