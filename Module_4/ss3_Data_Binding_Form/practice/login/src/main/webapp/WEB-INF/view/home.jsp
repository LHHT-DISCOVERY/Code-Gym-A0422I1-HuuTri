<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/28/2022
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Login </h1>
<fieldset>
    <form:form action="login" method="post" modelAttribute="login">
    <table>
        <tr>
            <td> <form:label path="account" >Account : </form:label></td>
            <td> <form:input path="account" /></td>
        </tr>
        <tr>
            <td> <form:label path="password"/>Password : </td>
            <td> <form:input path="password" /></td>
        </tr>
        <tr>
            <td></td>
            <td> <form:button> Login </form:button></td>
        </tr>
    </table>
    </form:form>
</fieldset>
</body>
</html>
