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
<table>

   <div class="container">
      <div class="page-header">
         <h1>Maalesef bu sayfaya erişim yetkiniz yok!.</h1>
      </div>
      <p>İstersen <a href="<c:url value="/home" />">Anasayfa</a> 'ya dönebilirsin.</p>
   </div>
   <div id="push"></div>


   <div id="footer" class="container">
      <nav class="navbar navbar-default navbar-fixed-bottom">
         <div class="navbar-inner navbar-content-center">
            <p class="text-muted credit">ordan burdan birşeyler</p>
         </div>
      </nav>
   </div>
</body>
</html>