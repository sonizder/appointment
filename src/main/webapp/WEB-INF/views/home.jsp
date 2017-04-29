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

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Randevu</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/appointment/">Home</a></li>
                <c:if test="${isLogin == false}">
                    <li><a href="/appointment/user/login">Giriş</a></li>
                </c:if>
                <c:if test="${isLogin == true}">
                    <li><a href="/appointment/user/logout">Çıkış</a></li>
                </c:if>
            </ul>
        </div>
    </div>
</div>

<div class="jumbotron">
    <div class="container">
        <h1>Hello, world!</h1>
        <p>This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
        <p><a class="btn btn-primary btn-lg">Learn more »</a></p>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-lg-1"></div>
        <div class="col-lg-2">
            <div class="container">
                <h3>Sağlık</h3>
                <img src="<c:url value='/static/images/health.png'/>" class="img-thumbnail" alt="Cinque Terre" width="180" height="180"/>
            </div>
        </div>
        <div class="col-lg-2">
            <div class="container">
                <h3>Eğitim</h3>
                <img src="<c:url value='/static/images/education.png'/>" class="img-thumbnail" alt="Cinque Terre" width="180" height="180"/>
            </div>
        </div>
        <div class="col-lg-2">
            <div class="container">
                <h3>Müzik</h3>
                <img src="<c:url value='/static/images/instrument.png'/>" class="img-thumbnail" alt="Cinque Terre" width="180" height="180"/>
            </div>
        </div>
        <div class="col-lg-2">
            <div class="container">
                <h3>Kuaför</h3>
                <img src="<c:url value='/static/images/barber.jpg'/>" class="img-thumbnail" alt="Cinque Terre" width="180" height="180"/>
            </div>
        </div>
        <div class="col-lg-2">
            <div class="container">
                <h3>Spor</h3>
                <img src="<c:url value='/static/images/sports.png'/>" class="img-thumbnail" alt="Cinque Terre" width="180" height="180"/>
            </div>
        </div>
        <div class="col-lg-1"></div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-lg-8">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
            <button class="btn btn-default" type="button">Go!</button>
          </span>
                </div><!-- /input-group -->
            </div><!-- /.col-lg-6 -->
        </div>
    </div>

    <hr>
    <footer>
        <p>© Company 2013</p>
    </footer>
</div> <!-- /container -->

</body>
</html>