<%-- 
    Document   : soba
    Created on : Feb 19, 2017, 5:24:44 PM
    Author     : Ivke
--%>

    <%@ include file="header.jsp" %>
    <%@ page language="java" pageEncoding="UTF-8"%>
<<<<<<< HEAD
    <%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
    <%@taglib prefix="sec"
              uri="http://www.springframework.org/security/tags"%>
=======
    <%@taglib prefix="sec"
              uri="http://www.springframework.org/security/tags"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
    
    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <c:url value="/j_spring_security_logout" var="logoutUrl" />
 
   
    <h1 align="center">Podaci o sobama</h1>
    <br/><br/><br/><br/>
    <c:if test="${!empty sobe}">
<<<<<<< HEAD
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
=======
       <table width="500px" align="center">
        <tr>
            <th height="50px" width="100px">ID</th> 
            <th height="50px" width="100px">Broj kreveta</th> 
            <th height="50px" width="100px">Velicina sobe u m2</th>
            <th height="50px" width="100px">Kupatilo</th>
            <th height="50px" width="100px">Televizor</th>
            <th height="50px" width="100px">Klima</th>
            <th height="50px" width="100px">Cena po danu</th>
        </tr>
        <c:forEach items="${sobe}" var="soba">
        
        <tr>
            <td height="50px" width="20px">${soba.id}</td>
            <td height="50px" width="20px">${soba.brojKreveta}</td>
            <td height="50px" width="20px">${soba.velicina}</td> 
            <td height="50px" width="20px">${soba.kupatilo}</td>
            <td height="50px" width="20px">${soba.tv}</td> 
            <td height="50px" width="20px">${soba.klima}</td> 
            <td height="50px" width="20px">${soba.cena}</td> 
        </tr>
            
        </c:forEach> 
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
       </table>
        
    </c:if>    
 
    </sec:authorize>
    <%@ include file="footer.jsp" %>
