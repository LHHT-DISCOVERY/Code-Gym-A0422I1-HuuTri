<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/29/2022
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> DELETE PRODUCT</h1>
<p>
    <c:if test="${messageDelete != null}">
        <span class="messageDelete"> ${messageDelete}</span>
    </c:if>
</p>
<p>
    <a href="/user"> Back List User  </a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>ID:</td>
                <td>${user.getId()}</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${user.getName()}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${user.getEmail()}</td>
            </tr>
            <tr>
                <td>Country:</td>
                <td>${user.getCountry()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete User "></td>
                <td><a href="/user">Back to user list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
