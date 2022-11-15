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
<h2 style="text-align: center">Danh sách </h2>
<%--Sửa ở đây href--%>
<a class="add" href="/ProductServlet?action=create">+ Add New Product</a>
<%--Sửa ở đây action , sửa name , sửa bên sevlet search name phải giống để get --%>
<form class="search" action="/ProductServlet?action=search" method="get">
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
        <th>Mã SP </th>
        <th>Tên SP</th>
        <th>GIÁ</th>
        <th>LOẠI SP</th>
        <th>MÔ TẢ SP</th>
    </tr>
<%--    Sửa var items --%>
    <c:forEach var="product" items="${productList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>MSX-00${product.getId()}</td>
            <td>${product.getName()}</td>
            <td>0${product.getPrice()}</td>
            <td>${product.getProductType()}</td>
            <td>${product.getProductDescription()}</td>
<%--            <c:forEach var="payment" items="${objecttList}">--%>
<%--                <c:if test="${payment.getIdPayment() == product.getIdPayment_room()}">--%>
<%--                    <td>${payment.getNamePayment()}</td>--%>
<%--                </c:if>--%>
<%--            </c:forEach>--%>
            <td>
                <button type="button" class="btn btn-outline-primary btn-update">
<%--                    Sửa href--%>
                    <a href="/ProductServlet?action=edit&id=${product.getId()}">Edit</a>
                </button>
                <!-- Button trigger modal update-->
                <button type="button" onclick="infoDelete('${product.getId()}','${product.getName() }')"
                        class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>

<!-- Modal delete -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        sửa ở đây--%>
        <form action="/ProductServlet?action=delete" method="get">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input name="action" value="delete" hidden>
                    <input name="deleteId" id="deleteId" hidden>
                    <span class="text-danger">Bạn có muốn xoá  </span><span id="deleteName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    <%--sửa ở đây--%>
    function infoDelete(id, name) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").innerText = name;
    }
</script>
</body>
</html>
