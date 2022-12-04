<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/30/2022
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <table>
        <tr>
            <td>Language : ${configEmail.language}</td>
        </tr>
        <tr>
            <td>Page Size : ${configEmail.pageSize}</td>
        </tr>
        <tr>
            <td> Spams filter :
                <c:if test="${configEmail.spamFiler}">
                    <p> active </p>
                </c:if>
                <c:if test="${!configEmail.spamFiler}">
                    <p> Not active </p>
                </c:if>
            </td>
        </tr>
        <tr>
            <td> Signature : ${configEmail.signature}</td>
        </tr>
        <tr>
            <td>

                <a href="showUpdate">
                    <button type="submit">Update</button>
                </a>

            </td>
        </tr>
    </table>
</table>
</body>
</html>
