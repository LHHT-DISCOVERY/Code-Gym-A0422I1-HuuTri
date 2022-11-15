<%@ page import="service.IPaymentService" %>

<%@ page import="java.util.List" %>
<%@ page import="model.Payment" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/11/2022
  Time: 6:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Title</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: linear-gradient(45deg, wheat, mediumslateblue);
            height: 200vh;
        }

        /*back ve list*/
        .btn-sm > a {
            text-decoration: none;
            color: white;
        }

        /*css thẻ a để quay về*/
        .btn-secondary {
            margin-top: 10px;
        }

        /*css button*/
        .btn {
            margin-left: 70px;
            padding: 10px 20px;
        }

        input {
            border-radius: 5px;
            border: none;
            outline: none;

        }

        /*css  input type number*/
        input[type=number]::-webkit-inner-spin-button {
            -webkit-appearance: none;
        }

        /*sửa boder css*/
        .select-css {
            border-radius: 5px;
            border: none;
            outline: none;

        }

        .main {
            margin-top: 100px;
            background: lightgray;
            border-radius: 10px;
        }

        h1 {
            padding-left: 100px;
            color: red;
        }
    </style>
</head>
<body>
<div class="row">
    <div class="col-4">
    </div>
    <div class="col-4 main">
        <form action="/room?action=create" method="post">
            <h1>Thêm mới</h1>
            <pre>Tên Người Thuê    : <input required type="text" name="nameCustomer"></pre>
            <pre>SĐT               : <input required  type="number" name="numberPhone"></pre>
            <pre>Ngày Bắt Đầu Thuê : <input required type="date" name="ngayBatDau"></pre>
            <pre>Hình Thức         : <select required class="select-css" style="font-size: 20px; width: 100px"
                                             name="idPayment_room">
                <option>Chọn hình thức</option>
                <c:forEach var="cls" items="${paymentList}">
                    <option value="${cls.getIdPayment()}">${cls.getNamePayment()}</option>
                </c:forEach>
            </select></pre>
            <button type="submit" class="btn btn-primary btn-sm">Create</button>
        </form>
        <button type="button" class="btn btn-secondary  btn-sm"><a href="/room">Back</a></button>
        <c:if test="${mess!=null}">
            <p style="color: red">${mess}</p>
        </c:if>
    </div>
    <div class="col-4">

    </div>
</div>

</body>
</html>
