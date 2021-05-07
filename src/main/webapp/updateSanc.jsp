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
<h2>Formulaire de modification de sanction</h2>
<form:form action="updateSanc" modelAttribute="sanc">

<form:hidden path="refSanction"/>
<br>
<form:label path="description">Description</form:label>
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
</center>
</body>
</html>