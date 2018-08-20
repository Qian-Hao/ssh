<%--
  Created by IntelliJ IDEA.
  User: kinthon
  Date: 17-6-23
  Time: 下午8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="user_getUserById.action" method="post">
    <input type="text" name="user.id" placeholder="输入用户id" />
    <br/>
    <input type="submit" value="查询">
    <br/>
</s:form>
</body>
</html>
