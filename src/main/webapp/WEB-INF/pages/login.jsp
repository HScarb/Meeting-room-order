<%--
  Created by IntelliJ IDEA.
  User: Scarb's Surface
  Date: 11/25/2016
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String url = request.getRequestURL().toString();
    url = url.substring(0, url.indexOf('/', url.indexOf("//") + 2));
    String context = request.getContextPath();
    url += context;
    application.setAttribute("ctx", url);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
    <form action="${ctx}/checkLogin" method="post">
        username: <input type="text" name="username"><br>
        password: <input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
    <br>
    <form action="${ctx}/searchByUnit" method="post">
        unit: <input type="text" name="unit"><br>
        <input type="submit" value="search">
    </form>
</body>
</html>