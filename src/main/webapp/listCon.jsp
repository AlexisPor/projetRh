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
	<h4>Liste des cong�s</h4>
	<table id="table-1" class="table table-bordered">
		<thead>
			<tr>

				<th>R�ference cong�</th>
				<th>Date de d�but</th>
				<th>Date de fin</th>
				<th>Date demand�</th>
				<th>Solde de cong�</th>
				<th>Emply� web</th>
				<th>Suppression</th>
				<th>Modifier</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${listcon}" var="c">
				<tr>
					<td>${c.refConge}</td>
					<td>${c.dateDebut}</td>
					<td>${c.dateFin}</td>
					<td>${c.dateDemande}</td>
					<td>${c.soldeConge}</td>
					<td>${c.afpaEmployeweb.prenom}</td>
					<td><a href="deleteCon?id=${c.refConge}">Supprimer</a></td>
					<td> <a href="editCon?id=${c.refConge}">Editer </a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>