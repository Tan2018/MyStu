package cn.tan.service;

public class LoginService {
	
	public static Boolean doLogin(String username ,String password) {
		if("tan".equals(username)&&"123456".equals(password)) {
			return true;
		}else {
			return false;
		}
		
	}

}
