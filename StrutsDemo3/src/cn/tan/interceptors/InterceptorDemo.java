package cn.tan.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * ��������������Ҫ�̳�Interceptor�ӿ�
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
		System.out.println("InterceptorDemo�ݻ�");
	}

	@Override
	public void init() {
		System.out.println("InterceptorDemo��ʼ��");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("��actionִ��֮ǰ");
		String result = invocation.invoke();//����,����action
		System.out.println("��actionִ��֮��");
		return result;
	}

}
