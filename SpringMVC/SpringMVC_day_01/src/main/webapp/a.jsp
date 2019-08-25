<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/4
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
aaaa
<a href="pages/param?username=heheheh&password=123 ">aaa</a>

<form action="pages/us" method="post">
  账户：  <input type="text" name="username"><br>
  密码：  <input type="text" name="userpassword"><br>
  年龄：  <input type="text" name="userage"><br>
  money账户：  <input type="text" name="money.monetname"><br>
 money年龄：  <input type="text" name="money.monetage"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
