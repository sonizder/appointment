<!DOCTYPE html>

<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>

    <meta charset="utf-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" href='<c:url value="/static/css/bootstrap.min.css" />' />
    <link rel="stylesheet" href='<c:url value="/static/css/select2-bootstrap.css" />' />
    <link rel="stylesheet" href='<c:url value="/static/css/custom.css" />' />

    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs/jq-2.2.4/dt-1.10.15/af-2.2.0/b-1.3.1/datatables.min.css"/>

    <script language="JavaScript" type="text/javascript" src="<c:url value="/static/js/jquery-3.2.1.js" />"></script>
    <script language="JavaScript" type="text/javascript" src="<c:url value="/static/js/bootstrap.min.js" />"></script>
    <script language="JavaScript" type="text/javascript" src="<c:url value="/static/js/address.js" />"></script>
    <script language="JavaScript" type="text/javascript" src="<c:url value="/static/js/custom.js" />"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/bs/jq-2.2.4/dt-1.10.15/af-2.2.0/b-1.3.1/datatables.min.js"></script>
    <script>
        $(document).ready(function () {
            $('#searchResultTable').dataTable();
        });
    </script>
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

        <c:forEach var="sector" items="${sectorList}">
            <div class="col-lg-2">
                <div class="container">
                    <h3>${sector.name}</h3>
                    <a href="#" class="scrollToSearch">
                        <img src="<c:url value="${sector.image}"/>" class="img-thumbnail" alt="${sector.alt}" width="180" height="180"/>
                    </a>
                </div>
            </div>
        </c:forEach>

        <div class="col-lg-1"></div>
    </div>

    <p/>


    <div id="searchPanel" class="container">
        <div class="row">
            <div class="panel-body">

                <form:form action="/appointment/search" commandName="searchModel" method="get">
                    <div class="col-lg-1"></div>
                    <div class="col-lg-2">
                        <form:input path="city" id="city" list="cityList" class="form-control" placeholder="Şehir" onchange="getTown()" />
                        <datalist id="cityList">
                            <c:forEach var="city" items="${cityList}">
                                <option value="${city}"/>
                            </c:forEach>
                        </datalist>
                    </div>

                    <div class="col-lg-2">
                        <form:input path="town" id="town" list="townList" class="form-control" placeholder="İlçe" onchange="getDistrict()" />
                        <datalist id="townList">
                            <c:forEach var="town" items="${townList}">
                                <option value="${town}"/>
                            </c:forEach>
                        </datalist>
                    </div>
                    <div class="col-lg-2">
                        <form:input path="district" id="district" list="districtList" class="form-control" placeholder="Semt Yada Mahalle" />
                        <datalist id="districtList">
                            <c:forEach var="district" items="${districtList}">
                                <option value="${district}"/>
                            </c:forEach>
                        </datalist>
                    </div>

                    <div class="col-lg-4">
                        <div class="input-group">
                            <form:input path="sector" id="sector" list="sectorList" class="form-control" placeholder="Mağaza Ara" />
                            <datalist id="sectorList">
                                <c:forEach var="sector" items="${sectorList}">
                                    <option value="${sector.name}"/>
                                </c:forEach>
                            </datalist>
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="submit">Ara</button>
                        </span>
                        </div>
                    </div>
                    <div class="col-lg-1"></div>
                </form:form>
            </div>
        </div>
    </div>


    <div class="container">
        <div class="row">
            <div class="col-lg-1"></div>
            <div class="col-lg-10">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <table id="searchResultTable" class="table table-striped table-hover">
                            <thead>
                            <tr>
                                <th>Resim</th>
                                <th>Magaza İsmi</th>
                                <th>Sektörü</th>
                                <th>Adresi</th>
                            </tr>
                            </thead>
                            <tbody>
                                <datalist id="appointmentList">
                                    <c:forEach var="appointment" items="${appointmentList}">
                                        <tr>
                                            <%--<td>${appointment.id}</td>--%>
                                            <td class="vert-align"><img src="<c:url value='${appointment.imagePath}'/>" class="img-thumbnail" alt="Cinque Terre" width="70" height="70"/></td>
                                            <td class="vert-align">${appointment.name}</td>
                                            <td class="vert-align">${appointment.sector}</td>
                                            <td class="vert-align">${appointment.city}</td>
                                        </tr>
                                    </c:forEach>
                                </datalist>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="col-lg-1"></div>
        </div>
    </div>

    <p>
    <hr>
    <footer>
        <p>© Company 2017</p>
    </footer>
</div>

</body>
</html>