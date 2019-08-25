<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/24
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>svae</title>
</head>
<body>
save
<form action="<%=request.getContextPath()%>/aa" method="post" name="save">
    <input type="hidden" name="operate" value="save">
    id: <input type="text" name="id" class="id">
    账号： <input type="text" name="username" class="username">
    密码：<input type="password" name="userpassword" class="userpassword">
    年龄：<input type="text" name="age" class="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
