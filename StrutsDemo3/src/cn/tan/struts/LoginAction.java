package cn.tan.struts;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.tan.service.LoginService;
/**
 * 一个登陆的action
 * @author tan
 *
 */
public class LoginAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String error;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("执行登陆验证!");
		if(LoginService.doLogin(userName, password)) {
			System.out.println("登陆成功");
			//登陆之后把用户名放在session里面
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("userName", userName);
			return SUCCESS;
		}else {
			System.out.println("登陆失败");
			error = "登陆失败";
			return ERROR;
		}
	}

}
