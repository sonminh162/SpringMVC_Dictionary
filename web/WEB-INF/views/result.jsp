<%--
  Created by IntelliJ IDEA.
  User: son nguyen
  Date: 3/11/2019
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>basic dictionary</title>
</head>
<body>
    <h1>Your result is:</h1>
    <h3>${word} -> ${result}</h3>
    <form method="get" action="/translator">
        <input type="submit" value="Back">
    </form>
</body>
</html>
