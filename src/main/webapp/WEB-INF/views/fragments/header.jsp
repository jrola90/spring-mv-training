<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">

        <div class="navbar-header">
            <a class="navbar-brand" href="<spring:url value="/servlet01/home/"/>">Project Management</a>
        </div>

        <ul class="nav navbar-nav">

            <li><a href=<spring:url value="/servlet01/home/"/>>Home</a></li>

            <li class="dropdown">

                <a href="#" class="dropdown-toggle"
                   data-toggle="dropdown" role="button"
                   aria-expanded="false">Projects <span class="caret"></span></a>

                <ul class="dropdown-menu" role="menu">
                    <li><a href="<spring:url value="/servlet01/project/add/"/>" style="display: none;">Add Project (Data
                        Binding)</a></li>
                    <li><a href="<spring:url value="/servlet01/project/add2/"/>">Add Project</a></li>
                    <li><a href="<spring:url value="/servlet01/project/list/"/>">Projects</a></li>
                </ul>
            </li>

            <li>
                <a href="#" class="dropdown-toggle"
                   data-toggle="dropdown" role="button"
                   aria-expanded="false">Tests <span class="caret"></span></a>

                <ul class="dropdown-menu" role="menu">
                    <li><a href="<spring:url value="/servlet01/test/methods"/>">Test HTTP Methods</a></li>
                    <li><a href="<spring:url value="/servlet01/test/exception"/>">Test Exception Handling</a></li>
                    <li><a href="<spring:url value="/servlet01/test/xmlViewResolver"/>">Test XML Resolver</a></li>
                    <li><a href="<spring:url value="/servlet01/test/redirect"/>">Test Redirect</a></li>
                    <li><a href="<spring:url value="/servlet01/test/redirectWithFlashAttribute"/>">Test Redirect With FlashAttribute</a></li>
                    <li><a href="<spring:url value="/servlet01/test/scope"/>">Test Scopes</a></li>
                    <li><a href="<spring:url value="/servlet01/test/json"/>">Test JSON</a></li>
                    <li><a href="<spring:url value="/servlet01/ctrlAdvice01/test"/>">Test Controller Advice 1</a></li>
                    <li><a href="<spring:url value="/servlet01/ctrlAdvice02/test"/>">Test Controller Advice 2</a></li>
                    <li><a href="<spring:url value="/servlet01/test/converter"/>">Test Converter</a></li>
                    <li><a href="<spring:url value="/servlet01/test/fileUpload"/>">Test File Upload</a></li>
                </ul>
            </li>

        </ul>

    </div>
</nav>