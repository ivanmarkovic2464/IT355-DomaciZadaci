<%-- 
    Document   : dodavanjeKategorije
    Created on : Mar 30, 2017, 10:42:51 PM
    Author     : Ivan
--%>

 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
    <%@ include file="header.jsp" %>


    <h1 align="center">Unesite naziv kategorije</h1>
    <br/><br/><br/>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">
    <c:url var="dodavanjeKategorije" value="/dodavanjeKategorije" />
    <form:form  method="POST" action="${dodavanjeKategorije}" modelAttribute="kategorija">
 
    <% String success = (String) request.getAttribute("successMsg");%>
    <%= (success != null) ? "<div class=\"alert alert-success\">" + success + "</div>" : ""%>
 
 <div class="form-group">
            <form:label path="nazivKategorije">
                Naziv kategorije
            </form:label>
            <form:input type="nazivKategorije" id="nazivKategorije" class="form-control" path="nazivKategorije" placeholder="nazivKategorije"/>
    </div>
 <button type="submit" class="btn btn-primary">ADD</button>
 </form:form>
 </div>
</div>
<%@include file="footer.jsp" %>
