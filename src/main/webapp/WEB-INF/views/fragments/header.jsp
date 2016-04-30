<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">

        <div class="navbar-header">
            <a class="navbar-brand" href="#">Project Management</a>
        </div>

        <ul class="nav navbar-nav">

            <li><a href=<spring:url value="/servlet01/home/"/>>Home</a></li>

            <li class="dropdown">

                <a href="#" class="dropdown-toggle"
                   data-toggle="dropdown" role="button"
                   aria-expanded="false">Projects <span class="caret"></span></a>

                <ul class="dropdown-menu" role="menu">
                    <li><a href="<spring:url value="/servlet01/project/add/"/>">Add Project (Data Binding)</a></li>
                    <li><a href="<spring:url value="/servlet01/project/add2/"/>">Add Project (Spring Tag Library)</a></li>
                    <li><a href="<spring:url value="/servlet01/project/list/"/>">Projects</a></li>
                    <li><a href="<spring:url value="/servlet01/test/"/>">Test</a></li>
                </ul>

            </li>
        </ul>

    </div>
</nav>