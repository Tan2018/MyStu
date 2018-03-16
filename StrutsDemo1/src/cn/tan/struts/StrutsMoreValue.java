package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 第三讲支持多个值
 * @author tan
 *
 */
public class StrutsMoreValue extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private String[] hobby;
	


	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String execute() throws Exception {
		if(hobby!=null) {
			for(String h :hobby) {
				System.out.println("--hobby:"+h);
			}
		}
		
		return SUCCESS;
	}

}
