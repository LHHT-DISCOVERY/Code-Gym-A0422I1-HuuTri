
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <style>
        .valid{
            color: red;
            display: none;
        }
    </style>
</head>
<body class="bg-danger">
<form method="post" action="/CustomerServlet?action=updateCustomer" class="needs-validation">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <input name="idCustomer"  value="${customer.getCustomerId()}" hidden>
            </tr>
            <tr>Type Customer: <select name="typeCustomer">
                <option> select</option>
                <c:forEach var="customerType" items="${typeCustomerList}">
                    <c:if test="${customerType.getCustomerTypeId() == customer.getCustomerType()}">
                        <option selected value="${customerType.getCustomerTypeId()}"> ${customerType.getName()} </option>
                    </c:if>
                    <c:if test="${customerType.getCustomerTypeId() != customer.getCustomerType()}">
                        <option  value="${customerType.getCustomerTypeId()}"> ${customerType.getName()} </option>
                    </c:if>
                </c:forEach>
            </select>
            </tr>
            <tr>
                <td>Name Customer:</td>
                <td>
                    <input id="name" type="text" name="nameCustomer" value="${customer.getCustomerName()}">
                    <div class="valid" id="validName">Name cannot empty</div>


                </td>
            </tr>
            <tr>
                <td>Birthday Customer:</td>
                <td><input type="date" name="birthdayCustomer" value="${customer.getCustomerBirthday()}"></td>
            </tr>
            <tr>
                <td>Gender Customer:</td>
                <td>
                    <select name="Gender">
                        <option value="0"> Nam</option>
                        <option value="1"> Nu</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Card Customer:</td>
                <td><input type="number" name="cardCustomer" value="${customer.getCustomerIdCard()}"></td>
            </tr>
            <tr>
                <td>Phone Customer:</td>
                <td><input type="number" name="phoneCustomer" value="${customer.getCustomerPhone()}"></td>
            </tr>
            <tr>
                <td>Email Customer:</td>
                <td><input type="text" name="emailCustomer" value="${customer.getCustomerEmail()}"></td>
            </tr>
            <tr>
                <td>Address Customer :</td>
                <td><input type="text" name="addressCustomer" value="${customer.getCustomerAddress()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update User"></td>
                <td><p>
                    <a href="/CustomerServlet"> Back List User</a>
                </p></td>
            </tr>
        </table>
    </fieldset>
</form>

<%--<script>--%>
<%--    function validate(){--%>
<%--        let check = false;--%>
<%--        --%>

<%--       if(document.getElementById("name").value == ""){--%>
<%--           document.getElementById("validName").style.display = 'block';--%>
<%--           check= true;--%>
<%--       }--%>

<%--       if(check == true){--%>
<%--           return false;--%>
<%--       }--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>
