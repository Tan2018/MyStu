package cn.tan.struts;

import com.opensymphony.xwork2.Action;

public class StrutsAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("helloworld!");
		return "success";
	}

}
