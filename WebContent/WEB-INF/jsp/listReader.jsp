<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>R_id</td>
        <td>R_sex</td>
        <td>R_name</td>
        <td>R_tel</td>
    </tr>
    <c:forEach items="${reader}" var="c" varStatus="st">
        <tr>
            <td>${c.r_id}</td>
            <td>${c.r_sex}</td>
            <td>${c.r_name}</td>
            <td>${c.r_tel}</td>
        </tr>
    </c:forEach>
</table>