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
<jsp:include page="menu.jsp"></jsp:include>
<h2>Formulaire d'ajout d'employé</h2>
<form:form action="saveEmp" modelAttribute="employe">
<form:label path="code">Code</form:label>
<form:input path="code" /> 
<br>
<form:label path="nom">Nom</form:label>
<form:input path="nom" /> 
<br>
<form:label path="prenom">Prénom</form:label>
<form:input path="prenom" /> 
<br>
<form:label path="adresse">adresseEmp</form:label>
<form:input path="adresse" /> 
<br>
<form:label path="numtel">Tél</form:label>
<form:input path="numtel" /> 
<br>
<form:label path="salaire">Salaire</form:label>
<form:input path="salaire" /> 
<br> <br>
<input type="submit" value="Valider">
</form:form>
</body>
</html>