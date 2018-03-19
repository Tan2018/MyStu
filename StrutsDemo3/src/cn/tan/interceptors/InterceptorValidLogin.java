package cn.tan.interceptors;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * ��֤�Ƿ��½��������
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
		System.out.println("InterceptorValidLogin�ݻ�");
	}

	@Override
	public void init() {
		System.out.println("InterceptorValidLogin��ʼ��");
	}
	

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//���������л�ȡsession���Ƚ��Ƿ�����Ѿ���½����Ա�����ơ�
		Object userName = ActionContext.getContext().getSession().get("userName");
		//Object userName2 =invocation.getInvocationContext().getSession().get("userName");
		//System.out.println(userName+"----"+userName2);
		if(userName!=null) {
			String result = invocation.invoke();//����,����action
			return result;
		}else {
			//���ﲻ��action�ķ���ֻ�ܻ�ȡrequest����ȥ��������
			HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
			request.setAttribute("error", "δ��¼��");
			return "error";
		}
		
	}

}
