<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/23/2022
  Time: 10:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/CustomerServlet?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${customerList}" var="customerList">
        <tr>
            <td>${customerList.getId()}</td>
            <td><a href="/CustomerServlet?action=view&id=${customerList.getId()}">${customerList.getName()}</a></td>
            <td>${customerList.getEmail()}</td>
            <td>${customerList.getAddress()}</td>
            <td><a href="/CustomerServlet?action=edit&id=${customerList.getId()}">edit</a></td>
            <td><a href="/CustomerServlet?action=delete&id=${customerList.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
