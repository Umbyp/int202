<%--
  Created by IntelliJ IDEA.
  User: Aumxx
  Date: 10/14/2023
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Title</title>
</head>
<body style="margin-left: 100px">
    <h3>Course Register History </h3>
    <c:set var="link" value="index.jsp"/>
    <c:if test="${message!=null}">
        <span style="color: red;font-size:large" >${message}</span><br>
        <c:set var="link" value="course-list"/>
    </c:if>
    <c:if test="${message==null}">
     <c:forEach items="${courseRegistered.history}" var="entry">
        <h3>${semesters[entry.key]}</h3>
         <hr>
         <c:forEach items="${entry.value}" var="subject">
             ${subject.subjectId}, ${subject.title},${subject.credit} <br>
         </c:forEach>
         ---------------------------------------<br><br>
     </c:forEach>
    </c:if>
<hr>
<a href="${link}"><button>OK</button></a>
</body>
</html>
