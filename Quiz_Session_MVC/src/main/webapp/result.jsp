<%--
  Created by IntelliJ IDEA.
  User: Aumxx
  Date: 10/28/2023
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Score</title>
</head>
<body  style="background-color: ${cookie.bg_color_cookie.value}">
    <h1>Your Score is ${requestScope.score}</h1>
    <a href="ResetQuizServlet">reset</a>

</body>
</html>
