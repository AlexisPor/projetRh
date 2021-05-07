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
<h2>Formulaire de sanction</h2>
<form:form action="saveSanc" modelAttribute="sanction">
<form:label path="refSanction">Réference sanction</form:label>
<form:input path="refSanction" /> 
<br>
<form:label path="description">Description de la sanction</form:label>
<form:input path="description" /> 
<br>
<form:label path="typeSanction">Type de sanction</form:label>
<form:input path="typeSanction" /> 
<br>
<form:label path="afpaEmployeweb">Employé web</form:label>
<form:input path="afpaEmployeweb" /> 
 <br> 
 <br>
<input type="submit" value="Valider">
</form:form>
</body>
</html>