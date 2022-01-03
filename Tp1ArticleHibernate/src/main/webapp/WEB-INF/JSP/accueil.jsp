<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<<<<<<< HEAD
<title>Accueil V2</title>
=======
<title>Accueil V2 by nabil</title>
>>>>>>> 2833a92e316c0c4ad99af4474757f3e98dbed399
</head>
<body>
    <h1>Article :</h1>
    <hr><hr>
    <c:forEach  var="current" items="${articles}">
       <h2>${current.nom }</h2>
       <p> ${current.prix }</p>
        <p> ${current.pays }</p>
        <hr>
    </c:forEach>
    <hr>
</body>
</html>