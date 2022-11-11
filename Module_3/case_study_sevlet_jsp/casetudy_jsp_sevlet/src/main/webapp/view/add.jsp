
<%@include file="../header.jsp" %>
<body>
<%@include file="../navbar.jsp"%>
<form method="post" action="/CustomerServlet?action=saveCustomer">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td> ID :</td>
                <td><input type="number" name="idCustomer"></td>
            </tr>
            <tr>Type Customer: <select name="typeCustomer">
                <option> select</option>
                <c:forEach var="customer" items="${typeCustomerList}">
                    <option value="${customer.getCustomerTypeId()}"> ${customer.getName()} </option>
                </c:forEach>
            </select>
            </tr>
            <tr>
                <td>Name Customer:</td>
                <td><input type="text" name="nameCustomer"></td>
            </tr>
            <tr>
                <td>Birthday Customer:</td>
                <td><input type="date" name="birthdayCustomer"></td>
            </tr>
            <tr>
                <td>Gender Customer:</td>
                <td>
                    <select name="Gender">
                        <option value="0"> Nam </option>
                        <option value="1"> Nu </option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Card Customer:</td>
                <td><input type="number" name="cardCustomer"></td>
            </tr>
            <tr>
                <td>Phone Customer:</td>
                <td><input type="number" name="phoneCustomer"></td>
            </tr>
            <tr>
                <td>Email Customer:</td>
                <td><input type="text" name="emailCustomer"></td>
            </tr>
            <tr>
                <td>Address Customer :</td>
                <td><input type="text" name="addressCustomer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Add User"></td>
                <td><p>
                    <a href="/CustomerServlet"> Back List User</a>
                </p></td>
            </tr>
        </table>
    </fieldset>
</form>
<%@include file="../footer.jsp" %>
</body>
</html>
