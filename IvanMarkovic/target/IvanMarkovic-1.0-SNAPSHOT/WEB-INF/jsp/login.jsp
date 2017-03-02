<%-- 
    Document   : login
    Created on : Mar 1, 2017, 3:24:54 PM
    Author     : Ivan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@include file="header.jsp"%>
 <h1>
 <title>Login Page</title>
 </h1>
 <body onload='document.loginForm.username.focus();'>
 
 <h1 align="center">Uloguj se:</h1>
 <c:if test="${not empty error}">
 <div align="center" class="error">${error}</div>
 </c:if>
 <c:if test="${not empty msg}">
 <div align="center" class="msg">${msg}</div>
 </c:if>
 
 <form 
    name='loginForm'
    action="<c:url value='/j_spring_security_check' />" 
    method='POST'>
 
 <table width="500px"  align="center">
     
 <tr>
 <td height="50px">User:</td>
 <td height="50px"><input type='text' name='username'></td>
 </tr>
 
 <tr>
 <td height="50px">Password:</td>
 <td height="50px"><input type='password' name='password' /></td>
 </tr>
 
 <tr>
 <td align="center" height="50px" colspan='2'><input name="submit" type="submit"
 value="Prijavi se" /></td>
 </tr>
 
 </table>
 
 <input type="hidden" name="${_csrf.parameterName}"
 value="${_csrf.token}" />
 
 </form>

 <%@include file="footer.jsp"%>