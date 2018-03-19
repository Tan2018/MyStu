package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 第四讲，使用struts子模块xml
 * @author tan
 *
 */
public class StrutsGrade extends ActionSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("StrutsGrade!!");
		return SUCCESS;
	}
	
	
	/*
	 * 第四讲，使用通配符*和{x}
	 */
	public String insert() throws Exception {
		System.out.println("Insert-Grade!");
		return SUCCESS;
	}
	public String update() throws Exception {
		System.out.println("update-Grade!");
		return SUCCESS;
	}
	
	
	
}
