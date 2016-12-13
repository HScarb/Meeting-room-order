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
<h2>Meeting room order system API guide</h2>
<a href="${ctx}/user">user API</a>
<br>
<a href="${ctx}/meeting">meeting API</a>
<br>
<a href="${ctx}/meetingroom">meetingroom API</a>
</form>
</body>
</html>