<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/23/2022
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<table border="1px">
    <tr>
        <th> STT</th>
        <th> ID</th>
        <th> Họ Và tên</th>
        <th> Giới Tính</th>
        <th> Ngày Sinh</th>
        <th> Điểm Số</th>
        <th> Tài Khoản</th>
        <th> Mã Lớp</th>
        <th> Email</th>
    </tr>
    <c:forEach var="student" items="${studentList}" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${student.getId()}</td>
        <td>${student.getName()}</td>
<%--        <td>${student.isGender()}</td>--%>
                        <c:if test="${student.isGender()}">
                            <td>Nam</td>
                        </c:if>
                        <c:if test="${!student.isGender()}">
                            <td>Nữ</td>
                        </c:if>
        <td>${student.getBirthday()}</td>
        <td>${student.getPoint()}</td>
        <td>${student.getAccount()}</td>
        <td>${student.getClassID()}</td>
        <td>${student.getEmail()}</td>

    </tr>
        </c:forEach>
</table>

</body>
</html>
