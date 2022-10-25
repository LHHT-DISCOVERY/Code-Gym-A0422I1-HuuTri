<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/23/2022
  Time: 10:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <span>
         <c:if test="${message != null}">
             <span class="message">${message}</span>
         </c:if>
    </span>
</p>
<p>
    <a href="/CustomerServlet">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${customer.getName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${customer.getEmail()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${customer.getAddress()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete customer"></td>
                <td><a href="/CustomerServlet">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
