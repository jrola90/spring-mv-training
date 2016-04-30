<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-04-28
  Time: 00:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add project</title>
  <link rel="stylesheet" href="<spring:url value="/resources/styles/styles.css" />" type="text/css"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="fragments/header.jsp"/>

<div class="container">

  <spring:url value="/servlet01/project/add2/" var="formUrl"/>

  <form:form method="post" action="${formUrl}" modelAttribute="project">

    <form:input path="name" cssClass="form-control" />
    <form:input path="desc" cssClass="form-control" />
    <button type="submit" class="btn btn-default btn-lg" >Add</button>
  </form:form>

  <c:if test="${result != null}">
    <span><b>Status: </b> ${result}</span>
  </c:if>

</div>
<a href="<spring:url value="/servlet01/project/list/"/>">Back to projects</a>

</body>
</html>