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
<center>
<h2>Formulaire de modification d'employé</h2>
<form:form action="updateEmp" modelAttribute="employe">

<form:hidden path="code"/>
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
</center>
</body>
</html>