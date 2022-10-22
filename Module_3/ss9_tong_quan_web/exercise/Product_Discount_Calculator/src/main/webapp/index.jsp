<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/21/2022
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/ServletDiscount">
    <h1>Product Description: </h1>
    <input type="text" name="productDecription">
    <h1>List Price : </h1>
    <input name="listPrice">
    <h1>Discount Percent : </h1>
    <input name="discountPercent">
    <button type="submit"> Send</button>
  </form>
  </body>
</html>
