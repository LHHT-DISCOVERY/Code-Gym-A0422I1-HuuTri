<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/21/2022
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/ServletCalculator" method="post">
    <h4>First Operand: </h4>
    <input type="text" name="FirstOperand">
    <h4></h4>
    <select name="operator">
      <option name="cong">Cong</option>
      <option name="tru">Tru</option>
      <option name="nhan">Nhan</option>
      <option name="chia">Chia</option>
    </select>
    <h4> Operand : </h4>
    <input type="text" name="Operand">
    <h4> Result ; </h4>
    <button type="submit"> Send</button>
  </form>

  </body>
</html>
