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
<h2>Formulaire de modification d'absence</h2>
<form:form action="updateAbs" modelAttribute="abs">

<form:hidden path="idabsence"/>
<br>
<form:label path="nbjours">Nombre de jours</form:label>
<form:input path="nbjours" /> 
<br>
<form:label path="motif">Motif</form:label>
<form:input path="motif" /> 
<br>
<form:label path="justificatif">Justificatif</form:label>
<form:input path="justificatif" /> 
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