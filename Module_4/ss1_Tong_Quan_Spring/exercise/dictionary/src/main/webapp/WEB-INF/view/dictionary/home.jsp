<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>

        <form action="/dictionary/home2" method="get">
            <th><input type="text" name="english"></th>
            <th>x
                <button type="submit">OK</button>
            </th>
        </form>
    </tr>
    <tr>
        <th> ${english} = ${rs}</th>
    </tr>
</table>
</body>
</html>
