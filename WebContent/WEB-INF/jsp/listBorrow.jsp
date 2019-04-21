<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>R_id</td>
        <td>B_id</td>
        <td>borrow_date</td>
        <td>return_date</td>
    </tr>
    <c:forEach items="${borrow}" var="c" varStatus="st">
        <tr>
            <td>${c.r_id}</td>
            <td>${c.b_id}</td>
            <td>${c.borrow_date}</td>
            <td>${c.return_date}</td>
        </tr>
    </c:forEach>
</table>