<%-- 
    Document   : header
    Created on : Feb 19, 2017, 2:10:53 PM
    Author     : Ivke
--%>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
 String uri = request.getRequestURI();
 String pageName = uri.substring(uri.lastIndexOf("/") + 1);
%>
<html>
    <head>
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
 <script src="https://code.jquery.com/jquery-3.1.1.js" integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA=" crossorigin="anonymous"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
 <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"/>
 <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css"/>
        <script>
            $(document).ready(function(){
            $("table").DataTable();
            });
        </script>
        <title>MetHotels</title>
    </head>
    <body>
        <header>
  <div class="container-fluid">
    <nav class="navbar navbar-inverse" role="navigation">
      <div class="container">
       <button type="button" id="nav-toggle" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-nav"> 
		<span class="sr-only">Toggle navigation</span>
		<span class="icon-bar"></span> 
		<span class="icon-bar"></span> 
		<span class="icon-bar"></span>
	   </button>
        <a href="#" class="navbar-brand"><b>MetHotels</b></a> 
      </div>
      <div id="main-nav" class="collapse navbar-collapse" >
        <ul class="nav navbar-nav">
            <c:url var="pocetna" value="/" />
            <c:url var="login" value="/login" />
            <c:url var="dodavanjeSobe" value="/dodavanjeSobe" />
            <c:url var="sobe" value="/sobe" />
            <c:url var="korisnici" value="/korisnici" />
            <c:url var="dodavanjeKategorije" value="/dodavanjeKategorije" />
          <li class="<%= (pageName.equals("pocetna.jsp")) ? "active" : ""%>"><a href="${pocetna}" >Pocetna</a></li>
          <li class="<%=   (pageName.equals("login.jsp")) ? "active" : ""%>"><a href="${login}" >Login</a></li>
          <li class="<%=(pageName.equals("dodavanjeSobe.jsp")) ? "active" : ""%>"><a href="${dodavanjeSobe}" >Dodavanje sobe</a></li>
          <li class="<%=         (pageName.equals("sobe.jsp")) ? "active" : ""%>"><a href="${sobe}" >Sobe</a></li>
          <li class="<%=    (pageName.equals("korisnici.jsp")) ? "active" : ""%>"><a href="${korisnici}" >Korisnici</a></li>
          <li class="<%=    (pageName.equals("dodavanjeKategorije.jsp")) ? "active" : ""%>"><a href="${dodavanjeKategorije}" >Dodavanje kategorije</a></li>
        </ul>
      </div>
    </nav>
  </div>
</header>
<<<<<<< HEAD
<br/><br/>
=======
    <br/><br/><br/><br/>
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77

