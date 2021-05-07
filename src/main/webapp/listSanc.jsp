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
<h4>Liste des sanctions</h4>
	<table id="table-1" class="table table-bordered">
		<thead>
			<tr>

				<th>Réference sanction</th>
				<th>Description</th>
				<th>Type de sanction</th>
				<th>Employé web</th>
				<th>Suppression</th>
				<th>Modifier</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${listsanc}" var="s">
				<tr>
					<td>${s.refSanction}</td>
					<td>${s.description}</td>
					<td>${s.typeSanction}</td>
					<td>${s.afpaEmployeweb.prenom}</td>
					<td><a href="deleteSanc?id=${s.refSanction}">Supprimer</a></td>
					<td> <a href="editSanc?id=${s.refSanction}">Editer </a> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>