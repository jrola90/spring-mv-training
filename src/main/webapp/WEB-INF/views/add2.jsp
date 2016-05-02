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
  <script>var ctx = "${pageContext.request.contextPath}"</script>
  <script src="<spring:url value="/resources/js/sendRequest.js"/>"></script>
</head>
<body>

<jsp:include page="fragments/header.jsp"/>

<div class="container">


  <spring:url value="/servlet01/project/add2/" var="formUrl"/>

  <form:form method="post" action="${formUrl}" modelAttribute="project">

    <div class="form-group">
      <label for="project-name">Name</label>
      <form:input id="project-name" path="name" cssClass="form-control" />
    </div>

    <div class="form-group">
      <label for="project-desc">Description</label>
      <form:textarea id="project-desc" path="desc" cssClass="form-control" rows="10" />
    </div>

    <div class="form-group">
      <label for="project-people-involved">People Involved</label>
      <form:select id="project-people-involved" path="peopleInvolved" items="${peopleInvolvedOptions}" cssClass="form-control"/>
    </div>

    <div class="form-group">
      <label for="project-finished">Is project finished?</label>
      <form:checkbox id="project-finished" path="finished"/>
    </div>

    <div class="form-group">
      <label for="project-indicators">Indicators</label>
      <form:radiobuttons id="project-indicators" path="indicators" items="${indicatorsOptions}" /> |
      <a id="request-link" href="<spring:url value="/servlet01/permission/request/" />">Send Request</a>
    </div>

    <div class="form-group">
      <label for="project-manager-name">Project Manager Name</label>
      <form:input id="project-manager-name" path="projectManager.name" cssClass="form-control" />
    </div>

    <div class="form-group">
      <label for="project-manager-surname">Project Manager Surname</label>
      <form:input id="project-manager-surname" path="projectManager.surname" cssClass="form-control" />
    </div>

    <div class="form-group">
      <label for="project-manager-poc1">POC1</label>
      <form:input id="project-manager-poc1" path="pointsOfContact[0]" cssClass="form-control" />
    </div>

    <div class="form-group">
      <label for="project-manager-poc2">POC2</label>
      <form:input id="project-manager-poc2" path="pointsOfContact[1]" cssClass="form-control" />
    </div>

    <div class="form-group">
      <label for="project-manager-poc3">POC3</label>
      <form:input id="project-manager-poc3" path="pointsOfContact[2]" cssClass="form-control" />
    </div>

    <button type="submit" class="btn btn-default btn-lg">Add</button>
  </form:form>

  <c:if test="${result != null}">
    <span><b>Status: </b> ${result}</span>
  </c:if>

</div>
<a href="<spring:url value="/servlet01/project/list/"/>">Back to projects</a>

</body>
</html>