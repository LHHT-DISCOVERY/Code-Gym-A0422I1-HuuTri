<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 11/7/2022
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
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
                    <a class="nav-link disabled" href="#">Service</a>
                </li>
                <li class="nav-item">
                    <form class="d-flex" role="search" method="post" action="/CustomerServlet?action=find_country">
                        <input class="form-control me-2" name="country" type="text" placeholder="Search Country"
                               aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </li>
            </ul>
        </nav>
    </div>