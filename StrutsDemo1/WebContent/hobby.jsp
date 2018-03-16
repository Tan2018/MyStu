<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 第三讲：支持多个值 -->
<form action="hobby" method="post">
	爱好：
	<input type="checkbox" name="hobby" value="唱歌"/>唱歌
	<input type="checkbox" name="hobby" value="跳舞"/>跳舞
	<input type="checkbox" name="hobby" value="睡觉"/>睡觉
	<input type="checkbox" name="hobby" value="玩CF"/>玩CF
	<input type="submit" value="提交"/>
</form>
</body>
</html>