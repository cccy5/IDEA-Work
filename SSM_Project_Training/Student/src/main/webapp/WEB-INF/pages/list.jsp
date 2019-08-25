<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/18
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>list</h3>
<table width="1000px" border="1px">
    <tr>
        <td>  <a href="add">增加</a></td>

    </tr>

        <tr>
            <td>账号</td>
            <td>密码</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>地址</td>

            <td>删除</td>
            <td>修改</td>
        </tr>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.account}</td>
            <td>${student.password}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td><a href="delete?id=${student.id}">删除</a></td>
            <td><a href="get?id=${student.id}">修改</a></td>
        </tr>


    </c:forEach>
</table>
</body>
</html>
