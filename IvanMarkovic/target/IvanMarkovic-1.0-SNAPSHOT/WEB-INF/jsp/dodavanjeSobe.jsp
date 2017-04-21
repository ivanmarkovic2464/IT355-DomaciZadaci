<%-- 
    Document   : dodavanjeSobe
    Created on : Feb 19, 2017, 4:43:55 PM
    Author     : Ivke
--%>

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ include file="header.jsp" %>
    
    <br/><br/>
    <h1 align="center">Unesite informacije o sobi</h1>
    <br/><br/><br/>
    <form:form  method="POST" modelAttribute="soba">
       <table width="500px"  align="center" >
            <tr>                                
            <td height="50px"><form:label path="brojKreveta"><spring:message code="beds"/></form:label></td>
            <td height="50px"><form:input path="brojKreveta" /></td>
        </tr>
        
        <tr>                              
            <td height="50px"><form:label path="velicina"><spring:message code="size"/></form:label></td>
            <td height="50px"><form:input path="velicina" /></td>
        </tr>
        
        <tr>                              
            <td height="50px"><form:label path="kupatilo"><spring:message code="bathroom"/></form:label></td>
            <td height="50px"><form:input path="kupatilo" /></td>
        </tr>
        
        <tr>                              
            <td height="50px"><form:label path="tv"><spring:message code="tv"/></form:label></td>
            <td height="50px"><form:input path="tv" /></td>
        </tr>
        
        <tr>                              
            <td height="50px"><form:label path="klima"><spring:message code="airCondition"/></form:label></td>
            <td height="50px"><form:input path="klima" /></td>
        </tr>
        
        <tr>                              
            <td height="50px"><form:label path="cena"><spring:message code="price"/></form:label></td>
            <td height="50px"><form:input path="cena" /></td>
        </tr>
        
        <tr align="center">
        <td colspan="6">
            <input height="50px" type="submit" value="Dodaj sobu"/>
        </td>
        
    </tr>

    </table>  
    </form:form>
    <%@ include file="footer.jsp" %>
