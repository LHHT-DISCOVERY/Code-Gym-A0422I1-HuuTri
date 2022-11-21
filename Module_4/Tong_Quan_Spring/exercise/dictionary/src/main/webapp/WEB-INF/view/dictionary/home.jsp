<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th><input type="text" name="english"></th>
        <form action="/dictionary/home" method="get">

            <th>
                <button type="submit"></button>
            </th>
        </form>
    </tr>
    <tr>
        <th> ${english} = ${rs}</th>
    </tr>
</table>
</body>
</html>
