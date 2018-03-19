<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.tan.entity.Student" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	List<Student> studentList1=new ArrayList<Student>();
	studentList1.add(new Student(1,"张三",20));
	studentList1.add(new Student(3,"李四",10));
	studentList1.add(new Student(5,"王五",40));
	studentList1.add(new Student(7,"赵六",30));
	request.setAttribute("studentList1",studentList1);
%>
</head>
<body>
<!-- 定义一个bean来作为比较器，比较排序 struts2.5取消用id，改用var-->
<s:bean var="myComparator" name="cn.tan.comparator.MyComparator"></s:bean>



<table>
	<tr>
		<th>序号</th>
		<th>编号</th>
		<th>姓名</th>
		<th>年龄</th>
	</tr>
	<s:sort   comparator="#myComparator" source="#request.studentList1" >
	
	</s:sort>
	
	<s:iterator value="#request.studentList1"  status="status">
	<tr>
		<td><s:property value="#status.index+1"/></td>
		<td><s:property value="id"/></td>
		<td><s:property value="name"/></td>
		<td><s:property value="age"/></td>
	</tr>
	</s:iterator>
	
</table>
</body>
</html>