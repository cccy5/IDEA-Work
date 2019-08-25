<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页</title>
</head>
<body>
<a class = "homePage" href="<%= request.getContextPath()%>/aa?operate=loginout">后台首页</a>
<a class = "schoolManage" href="<%= request.getContextPath()%>/aa?operate=list">学籍管理</a>
<a class = "adminManage" href="<%= request.getContextPath()%>/aa?operate=create">管理员添加</a>

<a class = "adminManage" href="<%=request.getContextPath()%>/aa?operate=list">列表</a>
<a class = "adminManage" href="<%=request.getContextPath()%>/aa?operate=list">退出</a>
</body>
</html>
