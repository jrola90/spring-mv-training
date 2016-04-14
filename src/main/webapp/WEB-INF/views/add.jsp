<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-04-11
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:include page="header.jsp"/>

Add Project

Form - GET
<form method="get" action="/servlet01/project/add/project">
    <input type="submit">
</form>

Form - POST
<form method="post" action="/servlet01/project/add/project">
    <select name="type">
        <option value="param01">param01</option>
        <option value="param02">param02</option>
    </select>
    <input id="special" name="special" type="checkbox"/>
    <input type="submit">
</form>

</body>
</html>