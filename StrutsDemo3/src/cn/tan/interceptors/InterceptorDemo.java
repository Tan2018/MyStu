package cn.tan.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * 基本的拦截器，要继承Interceptor接口
 * @author tan
 *
 */
public class InterceptorDemo implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("InterceptorDemo摧毁");
	}

	@Override
	public void init() {
		System.out.println("InterceptorDemo初始化");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("在action执行之前");
		String result = invocation.invoke();//借助,调用action
		System.out.println("在action执行之后");
		return result;
	}

}
