<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>

    <link rel="stylesheet" href='<c:url value="/static/css/bootstrap.min.css" />' />
    <link rel="stylesheet" href='<c:url value="/static/css/custom.css" />' />
    <script src="<c:url value="/static/js/jquery-3.2.1.js" />"></script>
    <script src="<c:url value="/static/js/bootstrap.min.js" />"></script>

</head>

<html>
<body class="loginBackgroundColor">
<div class="container vcenter">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Üye Girişi</h3>
            </div>


            <div class="panel-body">
                <form:form action="/appointment/user/login" commandName="loginForm" method="post">

                    <div class="form-group has-feedback">
                        <form:input path="email" type="text" id="username" name="email" class="form-control" placeholder="Email" />
                        <i class="glyphicon glyphicon-user form-control-feedback"></i>
                    </div>
                    <div class="form-group has-feedback">
                        <form:input path="password" type="text" id="password" name="password" class="form-control" placeholder="Şifre" />
                        <i class="glyphicon glyphicon-lock form-control-feedback"></i>
                    </div>
                    <button type="submit" class="btn btn-lg btn-primary btn-block">Giriş</button>
                </form:form>
            </div>
        </div>
    </div>
</div>

<c:import url="/template/footer"></c:import>

</body>
</html>