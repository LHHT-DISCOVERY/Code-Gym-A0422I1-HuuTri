<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/13/2022
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/5.2.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/5.2.2/js/bootstrap.bundle.js"></script>
    <style>
        .add {
            color: blue;
            text-decoration: none;
            padding: 20px;
            border: 1px solid cornflowerblue;
            border-radius: 10px;
            margin-left: 5px;
        }

        .add:hover {
            color: white;
            background-color: cornflowerblue;
        }

        table {
            margin-top: 40px;
        }

        td {
            text-align: center;

        }

        th {
            text-align: center;
        }

        .btn-update > a {
            text-decoration: none;
            color: blue;
        }

        .btn-update > a:hover {
            color: white;
        }

        .search {
            margin-left: 700px;
        }

        .search > input {
            border-radius: 5px;
            border: 1px solid blue;
            outline: none;
        }

        .search > select {
            border-radius: 5px;
            border: 1px solid blue;
            outline: none;
        }

        .search > button {
            border-radius: 5px;
            border: 1px solid blue;
            outline: none;
        }

        body {
            background-color: #f9f9fa
        }

        .flex {
            -webkit-box-flex: 1;
            -ms-flex: 1 1 auto;
            flex: 1 1 auto
        }

        @media (max-width: 991.98px) {
            .padding {
                padding: 1.5rem
            }
        }

        @media (max-width: 767.98px) {
            .padding {
                padding: 1rem
            }
        }

        .padding {
            padding: 5rem
        }

        .container {
            margin-top: 100px
        }

        .pagination,
        .jsgrid .jsgrid-pager {
            display: flex;
            padding-left: 0;
            list-style: none;
            border-radius: 0.25rem
        }

        .page-link {
            color: black
        }

        .pagination.pagination-rounded-flat .page-item {
            margin: 0 .25rem
        }

        .pagination-rounded-flat {

        }

        .pagination-success .page-item.active .page-link,
            /*a {*/
            /*    background: #00c689;*/
            /*    border-color: #00c689*/
            /*}*/

        .pagination.pagination-rounded-flat .page-item .page-link, a {
            border: none;
            border-radius: 50px;
        }


    </style>
</head>
<body>
<h2 style="text-align: center">Danh sách thống kê </h2>
<%--Sửa ở đây href--%>
<a class="add" href="/SachServlet">BACK</a>
<%--Sửa ở đây action , sửa name , sửa bên sevlet search name phải giống để get --%>
<form class="search" action="/room?action=search" method="get">
    <input hidden type="text" name="action" value="search">
    <input type="text" name="searchName" placeholder="nhập tên">
    <input type="text" name="searchNumberPhone" placeholder="nhập số điện thoại">
    <select name="idPayment_rom">
        <option value="">--Chọn hình thức--</option>
        <c:forEach var="pl" items="${paymentList}">
            <option value="${pl.getIdPayment()}">${pl.getNamePayment()}</option>
        </c:forEach>
    </select>
    <button type="submit">Search</button>
</form>

<table class="table table-striped">
    <tr>
        <th>STT</th>
        <th>Mã Mượn Sách </th>
        <th>Tên Sách </th>
        <th>Tác Giả</th>
        <th>Tên Học Sinh</th>
        <th>Lớp</th>
        <th>Ngày Mượn</th>
        <th>Ngày Ngày Trả</th>
        <th>Action </th>
    </tr>
    <%--    Sửa var items --%>
    <c:forEach var="sach" items="${sachList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>S-000${sach.getMaSach()}</td>
            <td>${sach.getTenSach()}</td>
            <td>${sach.getTacGia()}</td>
            <c:forEach items="hocSinhList" var="hs">
                <td>${hs.getHoTen()}</td>
                <td>${hs.getLop()}</td>
            </c:forEach>
            <c:forEach var="the" items="theMuonSachList" >
                <td>${the.getNgayMuon()}</td>
                <td>${the.getNgayTra()}</td>
            </c:forEach>
            <td>
                <button type="button" class="btn btn-outline-primary btn-update">
                        <%--                    Sửa href--%>
                    <a href="/SachServlet?action=muon&id=${sach.getMaSach()}">Trả Sách</a>
                </button>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
