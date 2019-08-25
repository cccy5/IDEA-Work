<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/9
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/test">test</a>

<form action="user/upload1" enctype="multipart/form-data" method="post">
    上传文件：<input type="file" name="upload"><br>
            <input type="submit" value="提交">
</form>

<a href="upload.jsp">springMVC上传</a>
</body>
</html>
