<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-04-26
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Projects</title>
    <link rel="stylesheet" href="<spring:url value="/resources/styles/styles.css" />" type="text/css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="fragments/header.jsp"/>

<div class="panel panel-default">
    <div class="panel-heading">Project Details</div>

    <div class="panel-body">
        <b>Project id: </b> ${project.id}<br/>
        <b>Project name: </b> ${project.name}<br/>
        <b>Description: </b> ${project.desc}
        <b>People Involved: </b> ${project.peopleInvolved}<br/>
        <b>Is Finished: </b>
        <c:choose>
            <c:when test="${project.finished}">
                Yes
            </c:when>
            <c:otherwise>
                No
            </c:otherwise>
        </c:choose>
        <br/>
        <b>Indicators: </b>${project.indicators}<br/>
        <b>Project manager: </b>${project.projectManager.name} ${project.projectManager.surname}
    </div>

</div>
<a href="<spring:url value="/servlet01/project/list/"/>">Back to projects</a>

</body>
</html>
