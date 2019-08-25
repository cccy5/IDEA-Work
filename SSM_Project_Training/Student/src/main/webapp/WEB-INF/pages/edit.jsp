<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/19
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="edit" method="post">
    账号： <input type="text" name="account" value="${student.account}"> <br>
    密码：<input type="password" name="password" value="${student.password}"> <br>
    姓名：<input type="text" name="name" value="${student.name}" > <br>
    年龄：<input type="text" name="age" value="${student.age}" > <br>
    地址：<input type="text" name="address" value="${student.address}"> <br>

    <input type="submit" value="修改">
</form>
</body>
</html>
