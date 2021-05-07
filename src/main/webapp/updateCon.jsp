<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<jsp:include page="menu.jsp"></jsp:include>
<h2>Formulaire de modification de congé</h2>
<form:form action="updateCon" modelAttribute="con">

<form:hidden path="refConge"/>
<br>
<form:label path="dateDebut">Date de début</form:label>
<form:input path="dateDebut" /> 
<br>
<form:label path="dateFin">Date de fin</form:label>
<form:input path="dateFin" /> 
<br>
<form:label path="dateDemande">Date demandée</form:label>
<form:input path="dateDemande" /> 
<br>
<form:label path="soldeConge">Solde de congé</form:label>
<form:input path="soldeConge" /> 
<br> 
<form:label path="afpaEmployeweb">Employé web</form:label>
<form:input path="afpaEmployeweb" /> 
<br>
<br>
<input type="submit" value="Valider">
</form:form>
</center>
</body>
</html>