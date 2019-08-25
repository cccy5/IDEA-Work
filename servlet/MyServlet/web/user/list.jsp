<%@ page import="java.util.ArrayList" %>
<%@ page import="com.cy.myservlet.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/23
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
list页面<br>
<a href="<%= request.getContextPath()%>/aa?operate=create">添加</a><br>
    <%ArrayList<User> userList = (ArrayList<User>) request.getAttribute("userList");%>
    <table>
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>
            <td>年龄</td>
            <td>操作</td>
        </tr>
        <tr>
            <%
                for(int i = 0 ;i < userList.size() ; i++){
                User user =null ;
                        user = userList.get(i) ;
            %>
            <td><%=user.getId()%></td>
            <td><%=user.getUsername()%></td>
            <td><%=user.getUserpassword()%></td>
            <td><%=user.getAge()%></td>
            <td><a href="<%= request.getContextPath()%>/aa?id=<%=user.getId()%>&operate=delete">删除</a></td>
            <td><a href="<%= request.getContextPath()%>/aa?id=<%=user.getId()%>&operate=get">查看</a></td>
            <td><a href="<%=request.getContextPath()%>/aa?id=<%=user.getId()%>&operate=edit">修改</a></td>
        </tr>
            <%}%>


    </table>

</body>
</html>
