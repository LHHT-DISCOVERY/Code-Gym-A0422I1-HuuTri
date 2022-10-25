<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/24/2022
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>

        .messageDelete {
            background-color: black;
            color: aqua;
        }

        body{
            background-color: antiquewhite;
        }

    </style>
</head>
<body>
<h1> DELETE PRODUCT</h1>
<p>
    <c:if test="${messageDelete != null}">
        <span class="messageDelete"> ${messageDelete}</span>
    </c:if>
</p>
<p>
    <a href="/Product"> Back List Product </a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>ID:</td>
                <td>${product.getId()}</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>price:</td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>${product.getDescription()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Procduct"></td>
                <td><a href="/Product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
