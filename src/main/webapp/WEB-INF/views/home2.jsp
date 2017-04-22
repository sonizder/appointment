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
<h2>Hello World!</h2>

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <p class="navbar-text">Signed</p>
        <p class="navbar-text">Signed in</p>
        <button type="button" class="btn btn-default navbar-btn">Sign in</button>
        <form class="navbar-form navbar-right" role="search">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <a href="/appointment/login">login</a>
    </div>
    <div class="row">
        <a href="/appointment/login/allUser">get all users</a>
    </div>
    <div class="row">
        <a href="/appointment/appointment/">get boots</a>
    </div>

    <div class="input-group">
        <form:form action="/appointment/login/searchUser"  commandName="login" method="post">
            <div class="row">
                Email : <form:input path="email"/>
            </div>
            <div class="row">
                <input type="text" class="form-control" placeholder="Search for...">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="button">Go!</button>
                 </span>
            </div>
        </form:form>
    </div>
</div>










</body>
</html>