<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/6/2022
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
</head>
<body>
<div>
    <!-- nav -->
    <div class="row">
        <nav class="nav justify-content-center navbar-expand-lg bg-light m-1">
            <ul class="nav justify-content-center">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/EmployeeServlet">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/CustomerServlet">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="/ServiceServlet">Service</a>
                </li>
                <li class="nav-item">

                </li>
            </ul>
        </nav>
    </div>

    <!-- Body -->
    <div class="row">
        <div class="col-md-1 col-lg-1 col-xl-1"></div>
        <div class="col-md-10 col-lg-10 col-xl-10">
            <div data-bs-spy="scroll" data-bs-target="#list-example" data-bs-smooth-scroll="true"
                 class="scrollspy-example" tabindex="0">
                <div class="d-flex ">
                    <form class="d-flex" role="search" method="post"
                          action="/CustomerServlet?action=find_country">
                        <input class=" border border-success rounded me-2 col-xs-4" name="country"
                               type="text"
                               placeholder="Search Country"
                               aria-label="Search">
                        <button class="btn btn-outline-success col-xs-4" type="submit">Search</button>
                    </form>
                    <img class="" src="https://img.icons8.com/ios-glyphs/30/null/add-user-group-man-man.png"/>
                    <a class="list-group-item list-group-item-action" href="/CustomerServlet?action=add">Thêm
                        Mới </a>
                </div>

                <%--Start  Body table --%>
                <table class="table table-striped">
                    <tr>
                        <th>STT</th>
                        <th>Ma khach Hang</th>
                        <th>Loai Khach Hang</th>
                        <th>Name</th>
                        <th>Birthday</th>
                        <th>Gioi Tinh</th>
                        <th>CCCD</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Country</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>

                    <c:forEach var="customer" items="${customerList}" varStatus="status">
                        <tr>
                            <td>${status.count}</td>
                            <td>${customer.getCustomerId()}</td>
                            <c:forEach var="customerType" items="${typeCustomerList}">
                                <c:if test="${customerType.getCustomerTypeId() == customer.getCustomerType()}">
                                    <td> ${customerType.getName()} </td>
                                </c:if>

                            </c:forEach>

                            <td>
                                <a href="/CustomerServlet?action=view&id=${customer.getCustomerId()}">${customer.getCustomerName()} </a>
                            </td>

                            <td>${customer.getCustomerBirthday()} </td>
                            <c:if test='${customer.getCustomerGender()== true}'>
                                <td>Nam</td>
                            </c:if>
                            <c:if test='${customer.getCustomerGender()== false}'>
                                <td>Nu</td>
                            </c:if>
                            <td>${customer.getCustomerIdCard()}</td>
                            <td>${customer.getCustomerPhone()}</td>
                            <td>${customer.getCustomerEmail()}</td>
                            <td>${customer.getCustomerAddress()}</td>
                            <td>
                                <button type="button" class="btn btn-primary bg-dark">
                                        <%--                                         customer giống với kiểu khi setAtribuite  bên , do get--%>
                                    <a href="/CustomerServlet?action=update&id=${customer.getCustomerId()}"
                                       style="text-decoration: none" class="text-light ">Edit</a>
                                </button>
                            </td>
                            <td>
                                <button type="button"
                                        onclick="infoDelete('${customer.getCustomerId()}','${customer.getCustomerName()}')"
                                        class="btn btn-primary bg-danger" data-bs-toggle="modal"
                                        data-bs-target="#exampleModal">
                                    Delete
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <%--End Table --%>
            </div>
        </div>
    </div>
    <div class="col-md-1 col-lg-1 col-xl-1"></div>
</div>

<!-- Footer -->
<div class="row ">
    <!-- Footer -->
    <footer class="text-center text-lg-start bg-danger text-light">
        <!-- Section: Social media -->
        <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
            <!-- Left -->
            <div class="me-5 d-none d-lg-block">
                <span>Get connected with us on social networks:</span>
            </div>
            <!-- Left -->

            <!-- Right -->
            <div>
                <a href="" class="me-4 text-reset">
                    <i class="fab fa-facebook-f"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="fab fa-twitter"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="fab fa-google"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="fab fa-instagram"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="fab fa-linkedin"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="fab fa-github"></i>
                </a>
            </div>
            <!-- Right -->
        </section>
        <!-- Section: Social media -->

        <!-- Section: Links  -->
        <section class="">
            <div class="container text-center text-md-start mt-5">
                <!-- Grid row -->
                <div class="row mt-3">
                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                        <!-- Content -->
                        <h6 class="text-uppercase fw-bold mb-4">
                            <i class="fas fa-gem me-3"></i>Company name
                        </h6>
                        <p>
                            Here you can use rows and columns to organize your footer content. Lorem ipsum
                            dolor sit amet, consectetur adipisicing elit.
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
                        <!-- Links -->
                        <h6 class="text-uppercase fw-bold mb-4">
                            Products
                        </h6>
                        <p>
                            <a href="#!" class="text-reset">Angular</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">React</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Vue</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Laravel</a>
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                        <!-- Links -->
                        <h6 class="text-uppercase fw-bold mb-4">
                            Useful links
                        </h6>
                        <p>
                            <a href="#!" class="text-reset">Pricing</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Settings</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Orders</a>
                        </p>
                        <p>
                            <a href="#!" class="text-reset">Help</a>
                        </p>
                    </div>
                    <!-- Grid column -->

                    <!-- Grid column -->
                    <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                        <!-- Links -->
                        <h6 class="text-uppercase fw-bold mb-4">Contact</h6>
                        <p><i class="fas fa-home me-3"></i> New York, NY 10012, US</p>
                        <p>
                            <i class="fas fa-envelope me-3"></i>
                            info@example.com
                        </p>
                        <p><i class="fas fa-phone me-3"></i> + 01 234 567 88</p>
                        <p><i class="fas fa-print me-3"></i> + 01 234 567 89</p>
                    </div>
                    <!-- Grid column -->
                </div>
                <!-- Grid row -->
            </div>
        </section>
        <!-- Section: Links  -->
    </footer>
    <!-- Footer -->
</div>
</div>

<%-- Start modal --%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        Sửa action  --%>
        <form action="/CustomerServlet?action=delete" method="post">
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
    function infoDelete(id, name) {
        document.getElementById("deleteName").innerText = name;
        document.getElementById("deleteId").value = id;
    }
</script>

<%--End Modal--%>

</body>
</html>
