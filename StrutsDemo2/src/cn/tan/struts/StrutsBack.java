package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;
/**
 * КѓЬЈДњТы
 * @author tan
 *
 */
public class StrutsBack extends ActionSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("StrutsBack!");
		return SUCCESS;
		
	}
	
	public String show() {
		System.out.println("show StrutsBack!");
		return SUCCESS;
		
	}
}
