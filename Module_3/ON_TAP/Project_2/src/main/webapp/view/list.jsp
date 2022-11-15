<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/12/2022
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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
    <link href="webjars/bootstrap/5.2.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/5.2.2/js/bootstrap.bundle.js"></script>
</head>
<body>
<h2 style="text-align: center">Danh sách các phòng</h2>
<a class="add" href="/room?action=create">+ Add New Product</a>

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
        <th>Mã Hộ Khẩu</th>
        <th>Tên Chủ Hộ </th>
        <th>SL</th>
        <th>Ngày Lập Hộ Khẩu</th>
        <th>Địa Chỉ</th>
        <th>Action</th>
    </tr>
    <c:forEach var="hk" items="${hoKhauList}" varStatus="status">
        <tr>
            <td>${status.count }</td>
            <td>MHK-00${hk.getMaHoKhau()}</td>
            <td>${hk.getTenChuHo()}</td>
            <td>0${hk.getSl()}</td>
            <td>${hk.getNgayLap()}</td>
            <td>${hk.getDiaChi()}</td>
            <td>
                <button type="button" class="btn btn-outline-primary btn-update">
                    <a href="/room?action=edit&id=${hk.getMaHoKhau()}">Eidt</a>
                </button>
                <!-- Button trigger modal update-->
                <button type="button" onclick="infoDelete('${hk.getMaHoKhau()}','${hk.getTenChuHo() }')"
                        class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>

<%-- Phaan Trang --%>
<%--<c:forEach var="p" items="${range}">--%>
<%--    <a href="?pageNum=${p}">${p}</a>--%>
<%--</c:forEach>--%>




<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        sửa ở đây--%>
        <form action="/room?action=delete" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="delete" hidden>
                    <input name="deleteId" id="deleteId" hidden>
                    <span class="text-danger">Bạn có muốn xoá khách hàng </span><span id="deleteName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
<script>
    <%--                    sửa ở đây--%>

    function infoDelete(id, name) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").innerText = name;
    }
</script>
</body>
</html>
