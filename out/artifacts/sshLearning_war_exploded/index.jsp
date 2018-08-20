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
<s:form action="user_login.action" method="post">
    <h3><s:actionerror/></h3>
    <input type="text" name="user.username" placeholder="输入用户名" />
    <br/>
    <input type="password" name="user.password" placeholder="输入密码" />
    <br />
    <input type="submit" value="登录">
    <input type="reset" value="重置">
    <a href="add.jsp">注册</a>
    <br/>
    <a href="query.jsp">查询</a>
    <br/>
    <a href="user_getAll.action">查询所有</a>
</s:form>
</body>
</html>
