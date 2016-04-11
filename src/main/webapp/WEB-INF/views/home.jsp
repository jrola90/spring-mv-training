<%--
  Created by IntelliJ IDEA.
  User: JrQ-
  Date: 2016-03-29
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
  <link rel="stylesheet" href="<spring:url value="/resources/styles/styles.css" />" type="text/css" />
</head>
<body>
  <h1>Home - JSP file</h1>

  <a href="<spring:url value="/servlet01/project/home"/>">Home</a> |
  <a href="<spring:url value="/servlet01/project/add"/>">Add Project</a>

    </body>
</html>