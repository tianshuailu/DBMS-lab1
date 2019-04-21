<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>L_id</td>
        <td>L_sex</td>
        <td>L_name</td>
    </tr>
    <c:forEach items="${librarian}" var="c" varStatus="st">
        <tr>
            <td>${c.l_id}</td>
            <td>${c.l_sex}</td>
            <td>${c.l_name}</td>
        </tr>
    </c:forEach>
</table>