<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/19/2022
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="/ServletTuDien">
      <input type="text" name="txtSearch" placeholder="Enter your word: "/>
      <input type="submit" id="submit" value="Search"/>
  </form>
</body>
</html>
