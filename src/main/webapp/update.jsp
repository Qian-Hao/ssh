<%--
  Created by IntelliJ IDEA.
  User: orbit
  Date: 2018/8/18
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user_update.action" method="post">
    id：<input type="text" value="${user.id}" name="user.username" />
    用户名：<input type="text" value="${user.username}" name="user.username" />
    密码：<input type="password" value="${user.password}" name="user.password" />
    <input type="submit" />
</form>
</body>
</html>
