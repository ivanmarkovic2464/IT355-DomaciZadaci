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
 
    <form action="${logoutUrl}" 
       method="post" 
       id="logoutForm">
     
    <br/><br/>
    <h1 align="center">Podaci o sobi</h1>
    <br/><br/><br/><br/>
       <table width="200px" align="center">
        <tr>
            <td height="50px">Broj kreveta</td> 
            <td height="50px">${brojKreveta}</td> 
        </tr>
        <tr>
            <td height="50px" >Velicina sobe u m2</td>
            <td height="50px">${velicinaSobe}</td> 
        </tr>
        <tr>
            <td height="50px">Kupatilo</td>
            <td height="50px">${kupatilo}</td> 
        </tr>
        <tr>
            <td height="50px">Televizor</td>
            <td height="50px">${tv}</td> 
        </tr>
        <tr>
            <td height="50px">Klima</td>
            <td height="50px">${klima}</td> 
        </tr>
        <tr>
            <td height="50px">Cena po danu</td>
            <td height="50px">${cena}</td> 
        </tr>
    </table> 
        
    <input type="hidden" name="${_csrf.parameterName}"
        value="${_csrf.token}" />
 
    </form>
        
    </sec:authorize>
    <%@ include file="footer.jsp" %>
