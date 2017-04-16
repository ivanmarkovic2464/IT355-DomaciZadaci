
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
    <%@ include file="header.jsp" %>
    
    <br/><br/>
    <h1 align="center">Unesite informacije o sobi</h1>
    <br/><br/><br/>
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
        
            <button class="btn btn-primary" type="submit">ADD</button>
           </form:form>
     </div>
</div>       
    <%@ include file="footer.jsp" %>
