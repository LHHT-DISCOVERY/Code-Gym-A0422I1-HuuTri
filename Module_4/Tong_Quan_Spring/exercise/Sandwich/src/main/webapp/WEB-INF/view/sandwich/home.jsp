<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/23/2022
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Show Type</h1>

<form action="/result" method="post">
    <input type="checkbox"  name="condiment" value="Lettuce">Lettuce
    <input type="checkbox"  name="condiment" value="Tomato">Tomato
    <input type="checkbox" name="condiment" value="Mustard">Mustard
    <input type="checkbox"  name="condiment" value="Sprouts">Sprouts
    <input type="submit" value="Submit">
</form>

<h1> RESULT IS : ${result}</h1>
</body>
</html>
