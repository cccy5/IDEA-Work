<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/4
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpingMVC</title>
    <script src="js/jquery.min.js"></script>
    <script>
       $(function() {
           $("#btn").click(function(){
           //     alert("hello");
           //  ;
        //编写json格式，设置属性和值
           $.ajax({
               url:"user/testAjax",
               contentType:"application/json;charset=utf-8",
               data:'{"uname":"hehe","upassword":"re","uage":45}',
               dataType:"json",
               type:"post",
               success:function (data) {
                   //date服务器端响应的json数据，进行解析

                  }
              });
           });
       });


    </script>
</head>

<body>
    <a href="user/testString">testString</a>    <br>
    <a href="user/testModelAndView">testModelAndView</a> <br>
    <button id="btn">发送ajax的请求</button>



</body>
</html>
