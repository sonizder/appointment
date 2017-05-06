<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>

   <link rel="stylesheet" href='<c:url value="/static/css/bootstrap.min.css" />' />
   <script src="<c:url value="/static/js/jquery-3.2.1.js" />"></script>
   <script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
</head>
<html>
<body>
   admin page
   <a href="<c:url value="/user/logout" />">Logout</a>

   <c:import url="/template/footer"></c:import>
</body>
</html>