<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/30/2022
  Time: 7:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <form:form method="POST" action="update" modelAttribute="emailConfig">
        <table>
            <tr>
                <td>Language :</td>
                <td>
                    <form:select path="language">
                        <form:options items="${lg}"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Page Size :</td>
                <td>
                    <form:select path="pageSize">
                        <form:options items="${pg}"></form:options> emails per page.
                    </form:select>
                </td>
            </tr>
            <tr>
                <td> Spams filter :</td>
                <form:checkbox path="spamFiler" value="true"/>Enable Spam filter.
                </td>
            </tr>
            <tr>
                <td> Signature :</td>
                <td>
                    <form:textarea path="signature"/>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"/></td>
            </tr>
            <tr>
                <td><a href="/">
                    <button type="submit">Cancel</button>
                </a></td>
            </tr>
        </table>
    </form:form>
</table>
</body>
</html>
