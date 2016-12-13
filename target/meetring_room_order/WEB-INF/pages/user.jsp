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
    <h2>checkLogin</h2>
    <form action="${ctx}/checkLogin" method="post">
        username: <input type="text" name="username"><br>
        password: <input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
    <br>
    <h2>checkUserName</h2>
    <form action="${ctx}/checkUserName" method="post">
        username: <input type="text" name="username"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>checkRegister</h2>
    <form action="${ctx}/checkRegister">
        username: <input type="text" name="username"><br>
        password: <input type="text" name="password"><br>
        name: <input type="text" name="name"><br>
        company: <input type="text" name="company"><br>
        email: <input type="text" name="email"><br>
        department: <input type="text" name="department"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>searchUserByUnit</h2>
    <form action="${ctx}/searchUserByUnit">
        unit: <input type="text" name="unit"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>changePassword</h2>
    <form action="${ctx}/changePassword">
        userid: <input type="text" name="userid"><br>
        oldpassword: <input type="text" name="oldpassword"><br>
        newpassword: <input type="text" name="newpassword"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>updateUser</h2>
    <form action="${ctx}/updateUser">
        username: <input type="text" name="username"><br>
        type: <input type="text" name="type"><br>
        value: <input type="text" name="value"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>updateUser</h2>
    <form action="${ctx}/updateUser">
        username: <input type="text" name="username"><br>
        type: <input type="text" name="type"><br>
        value: <input type="text" name="value"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>adminSearchUser</h2>
    <form action="${ctx}/adminSearchUser">
        name: <input type="text" name="name"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <h2>deleteUser</h2>
    <form action="${ctx}/deleteUser">
        username: <input type="text" name="username"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>