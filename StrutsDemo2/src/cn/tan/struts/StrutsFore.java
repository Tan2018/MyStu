package cn.tan.struts;

import com.opensymphony.xwork2.ActionSupport;
/**
 * Ç°Ì¨´úÂë
 * @author tan
 *
 */
public class StrutsFore extends ActionSupport{
	
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("StrutsFore!");
		return SUCCESS;
		
	}

}
