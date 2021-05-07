<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container w-25 text-center" >
		<h2>Formulaire de cong�s</h2>
		<form:form action="saveCon" modelAttribute="conge">
		<form:label path="refConge">R�ference cong�</form:label>
		<form:input path="refConge" class="form-control"/>
		<br>
		<form:label path="dateDebut">Date de d�but</form:label>
		<form:input path="dateDebut" class="form-control"/>
		<br>
		<form:label path="dateFin">Date de fin</form:label>
		<form:input path="dateFin" class="form-control"/>
		<br>
		<form:label path="dateDemande">Date demand�e</form:label>
		<form:input path="dateDemande" class="form-control" />
		<br>
		<form:label path="soldeConge">Solde de cong�</form:label>
		<form:input path="soldeConge" class="form-control"/>
		<br>
		<form:label path="afpaEmployeweb">Employ� web</form:label>
		<form:input path="afpaEmployeweb" class="form-control"/>
		<br>
		<br>
		<input type="submit" class="btn btn-primary " value="Valider">
	</form:form>
	</div>

</body>
</html>