<%--
  Created by IntelliJ IDEA.
  User: Aumxx
  Date: 10/14/2023
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Your Theme</title>
</head>
<body style="background-color: ${cookie.bg_color_cookie.value}">
<h2> Select Your Theme</h2>
<form action="set-theme" method="post">
  <p>
  <input type="radio" name="bgColor" value="lightpink">
  <button style="background-color: lightpink">lightpink</button>
  </p>
  <p>
  <input type="radio" name="bgColor" value="paleturquoise">
  <button style="background-color: paleturquoise">paleturquoise</button>
  </p>
  <p>
  <input type="radio" name="bgColor" value="peachpuff">
  <button style="background-color: peachpuff">peachpuff</button>
  </p>

  <input type="submit" value="OK">
</form>
</body>
</html>
