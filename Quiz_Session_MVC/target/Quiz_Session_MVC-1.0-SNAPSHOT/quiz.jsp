<%--
  Created by IntelliJ IDEA.
  User: Aumxx
  Date: 10/28/2023
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body  style="background-color: ${cookie.bg_color_cookie.value}">
 <h1>Quiz</h1><hr>
<h2>${requestScope.currentQuestion.title}</h2>
 <form action="QuizController" method="post">
<c:forEach items="${requestScope.currentQuestion.options}" var="option" varStatus="vs">
    <label>
        <input type="radio" name="option" value="${vs.index}">${option}
    </label><br>
</c:forEach><br>
<input type="submit" value="submit">
 </form>

</body>
</html>
