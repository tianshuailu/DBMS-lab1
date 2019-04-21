<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>B_id</td>
        <td>author</td>
    </tr>
    <c:forEach items="${author}" var="c" varStatus="st">
        <tr>
            <td>${c.b_id}</td>
            <td>${c.author}</td>
        </tr>
    </c:forEach>
</table>