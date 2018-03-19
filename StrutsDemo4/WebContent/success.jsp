<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 引入s标签，用于OGNL表达式语言 -->
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%  
	request.setAttribute("name", "requestVal");
%>
<body>
<h3>值栈的值：<s:property value="name" /></h3>
<h3>request的值：<s:property value="#request.name" /></h3>
<h3>session的值：<s:property value="#session.name" /></h3>
<h3>application的值：<s:property value="#application.name" /></h3>
<h3>请求参数的值：<s:property value="#parameters.name" /></h3>
<h3>attr的值：<s:property value="#attr.name" /></h3>
<br>
OGNL 访问复杂对象
<br>
<h3>javabean的值：name:<s:property value="student.name" />;sex:<s:property value="student.sex" /> </h3>
<h3>list的值：list1:<s:property value="list[0].name" />;list2:<s:property value="list[1].name" /></h3>
<h3>map的值：map.name:<s:property value="map['name']" />;map.age:<s:property value="map['age']" /></h3>
<br>
静态属性和方法
<br>
<s:property value="@cn.tan.utils.Utils@sName"/><br>
<s:property value="@cn.tan.utils.Utils@doThing()"/>
<!-- 使用静态方法记得要在struts里面配置；<constant name="struts.ognl.allowStaticMethodAccess" value="true"></constant> -->





<!-- 访问路径：http://localhost:8080/StrutsDemo4/ognl?name=p -->

</body>
</html>