<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>

    <form:form action="/appointment/login" commandName="loginForm" method="post">
        <table>
            <tr>
                <td>First Name : </td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>Last Name : </td>
                <td><form:input path="lastName"/></td>
            <tr>
            <tr>
                <td></td>
                <td><input type="submit" value="login"/></td>
            </tr>

        </table>
    </form:form>
</body>
</html>