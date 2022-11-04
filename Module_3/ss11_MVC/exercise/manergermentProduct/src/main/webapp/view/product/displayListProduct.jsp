<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/24/2022
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        .productsNull{
            background-color: white;
            color: red;
        }
        body{
            background-color: aquamarine;
            text-align: center;
        }
        table{
            margin-left: 35%;
        }
    </style>
</head>
<body>
<h1>LIST PRODUCT</h1>
<p>
    <a href="/Product?action=create"> ADD Product</a>
</p>
<form method="post" action="/Product?action=find">
    <input type="text" name="name" placeholder="Enter Name Product">
    <button type="submit"> Search Product</button>
</form>

<p>
    <span class="productsNull">${productsNull} </span>
</p>
<table border="1px">
    <tr>
        <th>ID</th>
        <th>Name Product</th>
        <th>Price</th>
        <th>Description</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>

    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/Product?action=view&id=${product.getId()}">${product.getName()} </a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td><a href="/Product?action=update&id=${product.getId()}">edit</a></td>
            <td><a href="/Product?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>