<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<%= request.getAttribute("msg") == null?"": request.getAttribute("msg").toString()%>
<form action="<%=request.getContextPath() %>/aa" method="post" name="aa">
    <input type="hidden" name="operate" value="login">
   账号： <input type="text" name="username" class="username">
    密码：<input type="text" name="userpassword" class="userpassword">
    <input type="submit" value="登录" >
</form>


</body>
</html>
