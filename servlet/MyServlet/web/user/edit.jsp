<%@ page import="com.cy.myservlet.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/24
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%User user = (User) request.getAttribute("user") ;%>
<form action="<%=request.getContextPath()%>/aa?id=<%=user.getId()%>&operate=update" method="post" >


        id:<inpute type = "text" name="id" value ="${user.id}" readonly="readonly">

        用户名：<input type = "text" name = "username" value="${user.username}"><br>

        密码：<input type = "userpassword" name = "userpassword" value="${user.userpassword}"><br>
        年龄：<input type = "text" name = "age" value="${user.age}"><br>
        <input type = "submit" value = "修改">


    </inpute>
</form>
</body>
</html>
