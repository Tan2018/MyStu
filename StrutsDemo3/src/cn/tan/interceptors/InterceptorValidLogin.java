package cn.tan.interceptors;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * 验证是否登陆的拦截器
 * @author tan
 *
 */
public class InterceptorValidLogin implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("InterceptorValidLogin摧毁");
	}

	@Override
	public void init() {
		System.out.println("InterceptorValidLogin初始化");
	}
	

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//从上下文中获取session来比较是否存在已经登陆的人员名名称。
		Object userName = ActionContext.getContext().getSession().get("userName");
		//Object userName2 =invocation.getInvocationContext().getSession().get("userName");
		//System.out.println(userName+"----"+userName2);
		if(userName!=null) {
			String result = invocation.invoke();//借助,调用action
			return result;
		}else {
			//这里不是action的返回只能获取request请求去返回数据
			HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			request.setAttribute("error", "未登录！");
			return "error";
		}
		
	}

}
