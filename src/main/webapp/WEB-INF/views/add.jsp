<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-04-11
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<head>
    <title>Add Project</title>
    <link rel="stylesheet" href="<spring:url value="/resources/styles/styles.css" />" type="text/css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
</head>


<jsp:include page="fragments/header.jsp"/>

<form method="get" action="/servlet01/project/add/">
    <div class="input-group" style="width: 500px; height: 70px;">
        <span class="input-group-addon" style="width: 100px; height: 70px;">GET</span>
        <input name="param" type="text" class="form-control" placeholder="param" aria-describedby="basic-addon1"
               style="width: 300px; height: 70px;">
        <span class="input-group-btn" style="width: 100px;">
            <button class="btn btn-default" type="submit" style="height: 70px;">Go!</button>
        </span>
    </div>
</form>

<form method="post" action="/servlet01/project/add/">
    <div class="input-group" style="width: 500px; height: 70px;">
        <span class="input-group-addon" style="width: 100px; height: 70px;">POST</span>
    <span class="input-group-addon" style="width: 300px; background-color: white;">

<div class="form-group" style="width:200px">
    <select class="form-control" name="type">
        <option value="param01">param01</option>
        <option value="param02">param02</option>
    </select>
    Special: <input type="checkbox" name="special" aria-label="">
</div>
    </span>
    <span class="input-group-btn" style="width: 100px;">
        <button class="btn btn-default" type="submit" style="height: 70px;">Go!</button>
    </span>
    </div>
</form>

Invoked Controller: <b>${controllerName}</b> <br>
Parameters: <b>${params}</b>

</body>
</html>