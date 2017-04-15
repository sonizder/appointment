<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
<table>
    <tr>
        <td>İsim : </td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Soyisim : </td>
        <td>${user.lastName}</td>
    <tr>
    <tr>
        <td>Meslek : </td>
        <td>${user.job}</td>
    <tr>
    <tr>
        <td>Email : </td>
        <td>${user.email}</td>
    <tr>
</table>

</body>
</html>