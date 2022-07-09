<%@ page import="date.CurrentDate" %><%--
  Created by IntelliJ IDEA.
  User: kdenn
  Date: 07.07.2022
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display the current date and time</title>
</head>
<body bgcolor=\"#f0f0f0\">
<h1 align=center>Display the current date and time </h1>
<h2 align=center>  <%=request.getAttribute("date")%>  </h2>
</body>
</html>
