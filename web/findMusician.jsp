<%--
  Created by IntelliJ IDEA.
  User: Maricruz
  Date: 21/02/2018
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="bootstrap.jsp"/>
    <link rel="stylesheet" href="css/footer-basic-centered.css">
    <link href="/carousel.css" rel="stylesheet">
    <title>Pentatech Encontrar Músico</title>

</head>

<!-- NAVBAR
================================================== -->
<body>
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Pentatech</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="aboutUs.jsp">Quienes somos</a></li>
                        <li class="active"><a href="#find">Find Musics</a></li>
                        <li><a href="#events">Events</a></li>
                        <li><a href="#login">Log In</a></li>
                        <li><a href="#singm">Sing Up Music</a></li>
                        <li><a href="#singo">Sing Up Organizer</a></li>
                    </ul>
                </div>
            </div>
        </nav>

    </div>
</div>

<!-- START THE FEATURETTES -->
<hr class="featurette-divider">
<h2 class="featurette-heading" align="center">ENCONTRAR MUSICO</h2>
<hr class="featurette-divider">

<div class="topnav">
    <div class="search-container">
        <form action="/action_page.php">
            <link rel="stylesheet" href="css/find.css">
            <input type="text" placeholder="Buscar..." name="search">
            <button type="submit"><i class="fa fa-search"></i></button>
        </form>
    </div>
</div>

</body>
</html>
