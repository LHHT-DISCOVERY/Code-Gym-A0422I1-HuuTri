<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/21/2022
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head >
<body >
<h1>Danh Sách Khách Hàng </h1>
<table border="1" style="width: 100% ; text-align: center">
    <tr>
        <th>STT</th>
        <th> Họ Tên Khách Hàng </th>
        <th> Ngày Sinh </th>
        <th>Địa Chỉ</th>
        <th>Ảnh </th>
    </tr>

    <c:forEach var="customer" items="${ListCustomer}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${customer.getNameCustomer()}</td>
            <td>${customer.getBirthday()}</td>
            <td>${customer.getAddress()}</td>
            <td><img src="${customer.getImage()}" alt="" style="width: 20vh ;height: 20vh  "></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
