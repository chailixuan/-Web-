<%--
  Created by IntelliJ IDEA.
  User: xpl
  Date: 2019/1/8
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="Generator" content="EditPlus®">
    <meta name="Author" content="">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <title>登陆</title>
    <%@page import="com.salary.Login" %>
    <script type="text/javascript" src="javascript/Functions.js">
    </script>
</head>
<body>

<table border="1" cellspacing="0" cellpadding="10" align="center">
    <tr>
        <td>
            <form action="servlet/LoginServlet" method="post" onsubmit="return LoginCheck(this);">
                用户名<input type="text" name="name"/></br></br>
                密  码  <input type="password" name="password"/></br></br>
                登陆选择
                <input type="radio" name="type" name="custom" checked="checked"/>用户
                <input type="radio" name="type" name="host" />管理员</br></br>
                <input type="submit" value="登录" name="submit"/>
            </form>
        </td>
    </tr>
</table>
</body>
</html>
<script>
    var f='<%=application.getAttribute("flag")%>'
    if(f==0)
        alert("用户不存在！");
    else if(f==2)
        alert("密码错误，请重新输入！");
</script>