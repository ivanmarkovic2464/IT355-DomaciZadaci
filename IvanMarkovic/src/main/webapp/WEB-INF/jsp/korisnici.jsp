<%-- 
    Document   : registracija
    Created on : Mar 25, 2017, 6:54:01 PM
    Author     : Ivan
--%>

 <%@ include file="header.jsp" %>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
    <%@taglib prefix="sec"
              uri="http://www.springframework.org/security/tags"%>
    
    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <c:url value="/j_spring_security_logout" var="logoutUrl" />

<h1 align="center">Korisnici</h1>
    <br/><br/><br/><br/>
 
 <c:if test="${!empty korisnici}">
  <table align="center">
    <thead>
     <tr>
        <th width="350"> Username</th>
        <th width="200"> Password</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
 <c:forEach items="${koris}" var="korisnik">
 
        <tr>
            <td>${korisnik.username}</td>
            <td>${korisnik.password}</td>
            <td><a href="<c:url value='/deleteKorisnika/${korisnik.username}' />">Obriši</a></td>
            <td></td>
        </tr>
 </c:forEach>
  
  </table>
 </c:if>
</sec:authorize>
    <%@ include file="footer.jsp" %>