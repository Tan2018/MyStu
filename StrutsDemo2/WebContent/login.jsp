<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>通配符grade_*</h1>
<a href="grade_insert" target="_blank">班级信息添加</a>&nbsp;
<a href="grade_update" target="_blank">班级信息修改</a>&nbsp;

<h1>通配符2 *__*</h1>
<a href="Student__insert" target="_blank">学生信息添加</a>&nbsp;
<a href="Student__update" target="_blank">学生信息修改</a>&nbsp;
<br/><br/>
<a href="Grade__insert" target="_blank">班级信息添加</a>&nbsp;
<a href="Grade__update" target="_blank">班级信息修改</a>&nbsp;

<h1>动态方法调用</h1>
<a href="grade!insert" target="_blank">班级信息添加</a>&nbsp;
<a href="grade!update" target="_blank">班级信息修改</a>&nbsp;

</body>
</html>