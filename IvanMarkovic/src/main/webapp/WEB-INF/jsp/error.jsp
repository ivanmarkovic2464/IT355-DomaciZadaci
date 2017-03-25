<%-- 
    Document   : error
    Created on : Mar 5, 2017, 1:33:35 PM
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="header.jsp" %>

<br/><br/><br/><br/><br/>
<h1 align="center">Neuspela rezervacija, pokušajte ponovo.</h1>
<br><br><br>
<form align="center" action="${flowExecutionUrl}">
<input type="hidden" name="_eventId" value="performPokusajPonovo">
<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

<input type="submit" value="Pokušaj ponovo" />

</form>
<%@include file="footer.jsp" %>