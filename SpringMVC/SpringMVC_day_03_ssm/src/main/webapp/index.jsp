<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/14
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/list1">list1</a>
<a href="account/list2">list2</a>
<form action="account/save" method="post">
    姓名：<input type="text" name="name"> <br>
    金额：<input type="text" name="money"> <br>
    <input type="submit" value="保存"> <br>
</form>
</body>
</html>
