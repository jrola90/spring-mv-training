<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-05-02
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

        <spring:hasBindErrors name="project">
            <div class="alert alert-danger" role="alert">
                <c:forEach var="error" items="${errors.allErrors}">
                    <spring:message message="${error}"/>
                    <br/>
                </c:forEach>
            </div>
        </spring:hasBindErrors>

        <b>Project id: </b> ${project.id}<br/>
        <b>Project name: </b> ${project.name}<br/>
        <b>Description: </b> ${project.desc}<br/>
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
        <b>Project manager: </b>${project.projectManager.name} ${project.projectManager.surname}<br/>
        <b>Points of Contact: </b>${project.pointsOfContact}</br></br>

        <div class="alert alert-info" role="alert">

            <a href="<spring:url value="/servlet01/project/list/"/>" class="btn btn-default btn-sm"
               role="button">Cancel</a>

            <spring:url value="/servlet01/project/add2/" var="backUrl"/>
            <form:form method="get" action="${backUrl}" style="display: inline;">
                <button type="submit" class="btn btn-default btn-sm">Back</button>
            </form:form>

            <spring:url value="/servlet01/project/confirm/" var="confirmUrl"/>
            <form:form method="post" action="${confirmUrl}" style="display: inline;">

                <c:choose>
                    <c:when test="${errors != null}">
                        <button type="submit" class="btn btn-default btn-sm" disabled>Confirm</button>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" class="btn btn-default btn-sm">Confirm</button>
                    </c:otherwise>
                </c:choose>

            </form:form>

        </div>


    </div>

</div>

</body>
</html>
