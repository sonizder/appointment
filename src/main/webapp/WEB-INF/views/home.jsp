<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
<h2>Hello World!</h2>
<a href="/appointment/login">login</a>
<a href="/appointment/login/allUser">get all users</a>

<form:form action="/appointment/login/searchUser"  commandName="login" method="post">
    <table>
        <tr>
            <td>Email :</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Search User"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>