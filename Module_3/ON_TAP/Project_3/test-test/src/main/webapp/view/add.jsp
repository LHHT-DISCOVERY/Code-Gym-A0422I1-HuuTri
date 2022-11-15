<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/13/2022
  Time: 11:43 AM
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
<%--        Sửa ở đây  name giống với get bên sevlet --%>
        <form action="/ProductServlet?action=create" method="post">
            <h1>Thêm mới</h1>
<%--            <pre>Ma SP    : <input required type="text" name="id"></pre>--%>
            <pre>Ten SP               : <input required  type="text" name="name"></pre>
            <pre>GIA : <input required type="number" name="price"></pre>
            <pre>LOAI SP         : <select required class="select-css" style="font-size: 20px; width: 100px"
                                             name="typeProduct">
                <option>loai sp </option>
                    <option value="Downny">Downny</option>
                    <option value="OMO">OMO</option>
                    <option value="BOT GIAT">BOT GIAT</option>
            </select></pre>
            <pre>MO TA : <input required type="text" name="description"></pre>
            <button type="submit" class="btn btn-primary btn-sm">Create</button>
        </form>
<%--        Sửa ở đây --%>
        <button type="button" class="btn btn-secondary  btn-sm"><a href="/ProductServlet">Back</a></button>
        <c:if test="${mess!=null}">
            <p style="color: red">${mess}</p>
        </c:if>
    </div>
    <div class="col-4">

    </div>
</div>
</body>
</html>
