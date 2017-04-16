<%-- 
    Document   : soba
    Created on : Feb 19, 2017, 5:24:44 PM
    Author     : Ivke
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
 
   
    <h1 align="center">Podaci o sobama</h1>
    <br/><br/><br/><br/>
    <c:if test="${!empty sobe}">
       <table class="table table-striped" width="500px" align="center">
        <thead>
        <tr>
            <th>ID</th> 
            <th>Broj kreveta</th> 
            <th>Velicina sobe u m2</th>
            <th>Kupatilo</th>
            <th>Televizor</th>
            <th>Klima</th>
            <th>Cena po danu</th>
            <th>Kategorija</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sob}" var="soba">
        
        <tr>
            <td>${soba.id}</td>
            <td>${soba.brojKreveta}</td>
            <td>${soba.velicina}</td> 
            <td>${soba.kupatilo}</td>
            <td>${soba.tv}</td> 
            <td>${soba.klima}</td> 
            <td>${soba.cena}</td>
            <td>${soba.kategorija}</td>
            <td><a href="<c:url value='/editSobu/${soba.id}' />">Izmeni</a></td>
            <td><a href="<c:url value='/deleteSobu/${soba.id}' />">Obriši</a></td>
        </tr>
            
        </c:forEach> 
        </tbody>
       </table>
        
    </c:if>    
 
    </sec:authorize>
    <%@ include file="footer.jsp" %>
