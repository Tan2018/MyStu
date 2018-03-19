package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;
/**
 * base Interceptor Demo
 * @author tan
 *
 */
public class StrutsInterceptor extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String userName;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("StrutsInterceptor!");
		return SUCCESS;
		
	}

}
