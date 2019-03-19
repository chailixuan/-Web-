<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: xpl
  Date: 2019/1/8
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工页面</title>
</head>
<body>
<h1>登录成功</h1>
<table border="1" rules="all">
    <tr align="center" style="font-weight: bold">
        <td>账号</td>
        <td>密码</td>
    </tr>
    <tr>
        <%
            ArrayList al=(ArrayList)application.getAttribute("al");
            for(int i=0;i<al.size();i++){
                %>
                   <td><%=al.get(i)%></td>
                <%
            }
        %>
    </tr>
</table>
</body>
</html>
