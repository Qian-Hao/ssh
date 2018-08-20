<%--
  Created by IntelliJ IDEA.
  User: orbit
  Date: 2018/8/16
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellspacing="0" border="1" class="table1">
    <thead>
    <tr>
        <th width="450">姓名</th>
        <th width="450">id</th>
        </th>
        <th width="450">密码</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="list" var="u">
        <tr>
            <td align="center"><s:property value="#u.username"/></td>
            <td align="center"><s:property value="#u.id"/></td>
            <td align="center"><s:property value="#u.password"/></td>
            <td><a href="user_update.action?id=${u.id}">修改</a></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
</body>
</html>
