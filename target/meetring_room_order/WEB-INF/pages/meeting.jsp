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
        <h3>addMeeting</h3>
        startTime: <input type="text" name="starttime"><br>
        endTime: <input type="text" name="endtime"><br>
        meeting room name: <input type="text" name="mtrnumber"><br>
        theme: <input type="text" name="theme"><br>
        type: <input type="text" name="type"><br>
        phone: <input type="text" name="contact"><br>
        member: <input type="text" name="remind"><br>
        remark: <input type="text" name="tip"><br>
        <input type="submit" value="submit">
    </form>
    <br>
    <form action="${ctx}/searchMeetingByMemberId" method="post">
        <h3>searchMeetingByMemberId</h3>
        memberid: <input type="text" name="memberid"><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
