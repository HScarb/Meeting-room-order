<%--
  Created by IntelliJ IDEA.
  User: Scarb's Surface
  Date: 12/2/2016
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Meeting</title>
</head>
<body>
    <form action="${ctx}/addMeeting" method="post">
        <h2>addMeeting</h2>
        starttime: <input type="text" name="starttime"><br>
        endtime: <input type="text" name="endtime"><br>
        mtrnumber: <input type="text" name="mtrnumber"><br>
        theme: <input type="text" name="theme"><br>
        type: <input type="text" name="type"><br>
        contact: <input type="text" name="contact"><br>
        phone: <input type="text" name="phone"><br>
        remind: <input type="text" name="remind"><br>
        participate: <input type="text" name="participate"><br>
        remark: <input type="text" name="tip"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <form action="${ctx}/searchMeetingByMemberId" method="post">
        <h2>searchMeetingByMemberId</h2>
        memberid: <input type="text" name="memberid"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <br>
    <form action="${ctx}/userMeeting">
        <h2>userMeeting</h2>
        userName: <input type="test" name="username"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
