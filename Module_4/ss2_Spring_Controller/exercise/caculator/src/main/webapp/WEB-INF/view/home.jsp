<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/23/2022
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/result" method="post">
    <input type="text" name="number1">
    <input type="text" name="number2">
    <button type="submit" value="cong" name="pt"> Addition (+)</button>
    <button type="submit" value="tru" name="pt"> Subtraction (-)</button>
    <button type="submit" value="nhan" name="pt"> Multiplication (x)</button>
    <button type="submit" value="chia" name="pt"> Division (/)</button>
</form>
<h1> Result is : ${result} </h1>
</body>
</html>
