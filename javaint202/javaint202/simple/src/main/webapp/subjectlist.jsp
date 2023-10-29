<%--
  Created by IntelliJ IDEA.
  User: Aumxx
  Date: 10/13/2023
  Time: 1:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>subject List</title>
</head>
<body>
<table>
    <tr style="background-color: antiquewhite">
        <td>Subject Code</td>
        <td>Title</td>
        <td>Credit</td>
    </tr>
        <c:forEach items="${subjects}" var="subject">
    <tr>
        <td>${subject.id}</td>
        <td>${subject.title}</td>
        <td>${subject.credit}</td>
    </tr>

    </c:forEach>
</table>

</body>
</html>