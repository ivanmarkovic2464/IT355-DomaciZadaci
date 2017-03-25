<%-- 
    Document   : rezervacija
    Created on : Mar 5, 2017, 2:46:17 PM
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<br/><br/><br/><br/><br/>
<h1 align="center">Rezervacija</h1>
 <br>
 <form align="center" method="post" action="${flowExecutionUrl}">
     <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <input type="hidden" name="_eventId" value="performRezervisi">
        <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
        
           Ime i Prezime
           <input type="text" name="imeIPrezime" maxlength="40">
        <br><br>
           Broj odraslih osoba
           <input type="text" name="brojOsoba">
        <br><br>
           Broj dece
           <input type="text" name="brojDece">   
        <br><br>
           Broj dana odsedanja
           <input type="text" name="brojDanaOdsedanja">  
        <br><br>
        <input type="submit" value="Rezervisi" />
        
     
 </form>

        <%@include file="footer.jsp" %>