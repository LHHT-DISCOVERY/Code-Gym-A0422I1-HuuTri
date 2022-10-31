<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/29/2022
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> User  Country  IS : ${country}</h1>
<c:forEach items="${userList}" var="user">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>ID : ${user.getId()}</td>
            </tr>
            <tr>
                <td> User Name  : ${user.getName()}</td>
            </tr>
            <tr>
                <td>Email: ${user.getEmail()}</td>
            </tr>
            <tr>
                <td>Country: ${user.getCountry()}</td>
            </tr>

        </table>
    </fieldset>
</c:forEach>

<tr>
    <td><a href="/user">Back to user list</a></td>
</tr>
</body>
</html>
