<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/26/2022
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<h1>LIST USER</h1>
<p>
    <a href="/user?action=add"> ADD User </a>
</p>
<form method="post" action="/user?action=find_country">
    <input type="text" name="country" placeholder="Enter Country User">
    <button type="submit"> Search User</button>
</form>
<form method="post" action="/user?action=sort">
<%--    <input type="hidden" name="sort">--%>
    <button type="submit"> SORT NAME </button>
</form>

<p>
    <span class="message">${message} </span>
</p>
<table border="1px">
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name User</th>
        <th>Email</th>
        <th>Country</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

    <c:forEach var="user" items="${userList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${user.getId()}</td>
            <td><a href="/user?action=view&id=${user.getId()}">${user.getName()} </a></td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td><a href="/user?action=edit&id=${user.getId()}">edit</a></td>
            <td><a href="/user?action=delete&id=${user.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>