<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
<table>
    <tr>
        <td>İsim : </td>
        <td>${loginForm.name}</td>
    </tr>
    <tr>
        <td>Soyisim : </td>
        <td>${loginForm.lastName}</td>
    <tr>
    <tr>
        <td>Meslek : </td>
        <td>${loginForm.job}</td>
    <tr>
    <tr>
</table>

</body>
</html>