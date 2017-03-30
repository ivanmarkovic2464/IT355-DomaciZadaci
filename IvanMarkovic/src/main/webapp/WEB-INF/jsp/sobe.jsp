<%-- 
    Document   : soba
    Created on : Feb 19, 2017, 5:24:44 PM
    Author     : Ivke
--%>

    <%@ include file="header.jsp" %>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@taglib prefix="sec"
              uri="http://www.springframework.org/security/tags"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <sec:authorize access="hasRole('ROLE_ADMIN')">
    <c:url value="/j_spring_security_logout" var="logoutUrl" />
 
   
    <h1 align="center">Podaci o sobama</h1>
    <br/><br/><br/><br/>
    <c:if test="${!empty sobe}">
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
       </table>
        
    </c:if>    
 
    </sec:authorize>
    <%@ include file="footer.jsp" %>
