<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="menu.jsp"></jsp:include>
<body>
<h4>Liste des employés</h4>
	<table id="table-1" class="table table-bordered" >
		<thead>
			<tr>

				<th>Code</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Adresse</th>
				<th>Tél</th>
				<th>Salaire</th>
				<th>Suppression</th>
				<th>Modification</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${listemp}" var="e">
				<tr>
					<td>${e.code}</td>
					<td>${e.nom}</td>
					<td>${e.prenom}</td>
					<td>${e.adresse}</td>
					<td>${e.numtel}</td>
					<td>${e.salaire}</td>
					<td><a href="deleteEmp?id=${e.code}">Supprimer</a></td>
					<td><a href="editEmp?id=${e.code}">Editer</a></td>
					<td><a href="addCon?id=${e.code}">Ajout congé</a></td>
					<td><a href="addSanc?id=${e.code}">Ajout d'une sanction</a></td>
					<td><a href="addAbs?id=${e.code}">Ajout d'une absence</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>