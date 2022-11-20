<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/20/2022
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <div class="row">
        <div class="col-4">
        </div>
        <div class="col-4 main">
            <form action="/student/create" method="post">
                <h1>Thêm mới</h1>
                <pre>Mã Sinh Viên               : <input required  type="text" name="id"></pre>
                <pre>Tên Sinh Viên    : <input required type="text" name="name"></pre>
                <pre>Tuổi  : <input required type="number" name="age"></pre>
                <pre>Quê quán         : <input required type="text" name="address"></pre>
                <button type="submit" class="btn btn-primary btn-sm">Create</button>
            </form>
            <button type="button" class="btn btn-secondary  btn-sm"><a href="/student/list">Back</a></button>
        </div>
        <div class="col-4">
        </div>
    </div>
</table>
</body>
</html>
