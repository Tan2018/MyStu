package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;

import cn.tan.service.LoginService;

public class StrutsStudent extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	

	//�����ص��ɹ�ҳ��ʱ����ô˷���
	public String getUsername() {
		return username;
	}

	//����ҳ���ȡusername����ʱ������ⷽ��
	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("helloworld!");
		if(LoginService.doLogin(username, password)) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	
	/*
	 * ���Ľ���ʹ��ͨ���*��{x}
	 */
	public String insert()  {
		System.out.println("Insert-Student!");
		return SUCCESS;
	}
	public String update()  {
		System.out.println("update-Student!");
		return SUCCESS;
	}
	

}
