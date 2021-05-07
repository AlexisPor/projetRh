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
	<h4>Liste des absences</h4>
	<table id="table-1" class="table table-bordered">
		<thead>
			<tr>

				<th>Code</th>
				<th>Nombre de jours</th>
				<th>Motif</th>
				<th>Justificatif</th>
				<th>Employé web</th>
				<th>Suppression</th>
				<th>Modifier</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${listabs}" var="a">
				<tr>
					<td>${a.idabsence}</td>
					<td>${a.nbjours}</td>
					<td>${a.motif}</td>
					<td>${a.justificatif}</td>
					<td>${a.afpaEmployeweb.prenom}</td>
					<td><a href="deleteAbs?id=${a.idabsence}">Supprimer</a></td>
					<td> <a href="editAbs?id=${a.idabsence}">Editer </a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>