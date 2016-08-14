<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-05-09
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope</title>
    <link rel="stylesheet" href="<spring:url value="/resources/styles/styles.css" />" type="text/css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script>var ctx = "${pageContext.request.contextPath}"</script>
    <script src="<spring:url value="/resources/js/sendRequest.js"/>"></script>
</head>
<body>

<jsp:include page="fragments/header.jsp"/>

<div class="container" style="text-align: center;">

    Request Scope Bean Counter: ${requestScopeBeanCounter}</br>
    Session Scope Bean Counter ${sessionScopeBeanCounter}

</div>

</body>
</html>