package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ���Ľ���ʹ��struts��ģ��xml
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
	 * ���Ľ���ʹ��ͨ���*��{x}
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
