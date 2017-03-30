<%-- 
    Document   : registracija
    Created on : Mar 25, 2017, 6:54:01 PM
    Author     : Ivan
--%>

 <%@ include file="header.jsp" %>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@taglib prefix="sec"
              uri="http://www.springframework.org/security/tags"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <sec:authorize access="hasRole('ROLE_ADMIN')">
<h1 align="center">Korisnici</h1>
    <br/><br/><br/><br/>
 
 <c:if test="${!empty korisnici}">
  <table>
 
     <tr>
 <th width="350"> Username</th>
 <th width="200"> Password</th>
    </tr>
 
 <c:forEach items="${korisnici}" var="korisnik">
 
        <tr>
 <td>${korisnik.username}</td>
 <td>${korisnik.password}</td>
 <td>
 </td>
        </tr>
 </c:forEach>
  
  </table>
 </c:if>
</sec:authorize>
    <%@ include file="footer.jsp" %>