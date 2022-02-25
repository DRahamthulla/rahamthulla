<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
Enter name:<input type="text" name="fname"/><br>
Enter Age:<input type="text" name="age"/><br>
Enter Email:<input type="text" name="email"/><br>
Enter Password:<input type="password" name="password"/><br>
Gender:<input type="radio" name="gender" value="female">female<br>
<input type="radio" name="gender" value="male">male<br/>
<input type="submit" name="register" value="Register Details">
</form>
<%
if(request.getParameter("register")!=null){%>
<jsp:useBean id="user" class="com.trf.User" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<jsp:forward page="RegisterServlet"></jsp:forward> <%}
%>

</body>
</html>