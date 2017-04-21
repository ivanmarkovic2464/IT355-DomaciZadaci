
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
    <%@ include file="header.jsp" %>
    
    <br/><br/>
    <h1 align="center">Unesite informacije o sobi</h1>
    <br/><br/><br/>
<<<<<<< HEAD
    <div class="container">
        <div class="col-md-6 col-md-offset-3">
    <c:url var="dodavanjeSobe" value="/dodavanjeSobe" />
    <form:form  method="POST" action="${dodavanjeSobe}" modelAttribute="soba">
        
    <% String success = (String) request.getAttribute("successMsg"); %>
    <%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
        
    <div class="form-group">
            <form:label path="brojKreveta">
                Broj kreveta
            </form:label>
            <form:input type="brojKreveta" id="brojKreveta" class="form-control" path="brojKreveta" placeholder="brojKreveta"/>
    </div>
    
    <div class="form-group">
            <form:label path="velicina">
                Velicina sobe
            </form:label>
            <form:input type="velicina" id="velicina" class="form-control" path="velicina" placeholder="velicina"/>
    </div>  
    
    <div class="form-group">
            <form:label path="kupatilo">
                Kupatilo
            </form:label>
            <form:input type="kupatilo" id="kupatilo" class="form-control" path="kupatilo" placeholder="kupatilo"/>
    </div>  
    
    <div class="form-group">
            <form:label path="tv">
                TV
            </form:label>
            <form:input type="tv" id="tv" class="form-control" path="tv" placeholder="tv"/>
    </div>  
    
    <div class="form-group">
            <form:label path="klima">
                Klima
            </form:label>
            <form:input type="klima" id="klima" class="form-control" path="klima" placeholder="klima"/>
    </div>   
    
    <div class="form-group">
            <form:label path="cena">
                Cena
            </form:label>
            <form:input type="cena" id="cena" class="form-control" path="cena" placeholder="cena"/>
    </div>      
    
    <div class="form-group">
            <form:label path="kategorija">
                Kategorija
            </form:label>
            
            <form:select id="kategorija" class="form-control" path="kategorija">
                <form:option value="">Odaberi kategoriju</form:option>
                <form:options items="${kategorije}" itemValue="idKategorija" itemLabel="nazivKategorije" />
            </form:select>
    </div>            
=======
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
>>>>>>> 1f3e2861b12e725f9bca6ea7317b3220217a8d77
        
            <button class="btn btn-primary" type="submit">ADD</button>
           </form:form>
     </div>
</div>       
    <%@ include file="footer.jsp" %>
