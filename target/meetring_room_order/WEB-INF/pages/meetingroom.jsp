<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String url = request.getRequestURL().toString();
    url = url.substring(0, url.indexOf('/', url.indexOf("//") + 2));
    String context = request.getContextPath();
    url += context;
    application.setAttribute("ctx", url);
%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<html>
<body>
<h2>Meeting room order system</h2>
<form action="${ctx}/searchFreeMeetingRoom">
    start time: <input type="text" name="starttime"><br>
    end time: <input type="test" name="endtime"><br>
    <input type="submit" value="submit">
</form>
<br>
<form action="${ctx}/userMeeting">
    userName: <input type="test" name="username"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>