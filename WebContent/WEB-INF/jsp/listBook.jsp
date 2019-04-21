<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>B_id</td>
        <td>B_name</td>
        <td>B_publisher</td>
        <td>B_amount</td>
        <td>B_location</td>
        <td>L_id</td>
    </tr>
    <c:forEach items="${book}" var="c" varStatus="st">
        <tr>
            <td>${c.b_id}</td>
            <td>${c.b_name}</td>
            <td>${c.b_publisher}</td>
            <td>${c.b_amount}</td>
            <td>${c.b_location}</td>
            <td>${c.l_id}</td>
        </tr>
    </c:forEach>
</table>