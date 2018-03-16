package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;

import cn.tan.model.User;
import cn.tan.service.LoginService;
/**
 * 使用javaBean类型属性传递
 * @author tan
 *
 */
public class StrutsForJavaBean extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("username:"+user.getUsername());
		if(LoginService.doLogin(user.getUsername(), user.getPassword())) {
			return SUCCESS;
		}else {
			return ERROR;
		}
		
	}

}
