<%--
  Created by IntelliJ IDEA.
  User: Ayrton
  Date: 22/02/2018
  Time: 02:02 PM
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
    <title>Pentatech Quienes Somos</title>

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
                        <li class="active"><a href="#">Quienes somos</a></li>
                        <li><a href="#find">Find Musics</a></li>
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
<h2 class="featurette-heading" align="center">SOMOS PENTATECH</h2>
<hr class="featurette-divider">

< class="container">

<div class="row featurette">
    <div class="col-md-6">
        <h2 class="featurette-heading">Musicaaaaaaaaaaaa</h2>
        <p class="lead"> Somos desarrolladores asdflknaskdfal adlsk falkds malkfj klasdfj alsd </p>
    </div>
    <div class="col-md-6">
        <img class="featurette-image img-responsive center-block" data-src="holder.js/500x500/auto"
             src="img/fondo1.jpg" alt="Generic placeholder image">
    </div>
</div>

<hr class="featurette-divider">

<div class="row featurette">
    <div class="col-md-6">
        <h2 class="featurette-heading">Musicaaaaaaaaaaaa 22</h2>
        <p class="lead"> Somos desarrolladores asdflknaskdfal adlsk falkds malkfj klasdfj alsd </p>
    </div>
    <div class="col-md-6">
        <img class="featurette-image img-responsive center-block" data-src="holder.js/500x500/auto"
             src="img/fondo2.jpg" alt="Generic placeholder image">
    </div>
</div>

<hr class="featurette-divider">

<div class="row featurette">
    <div class="col-md-6">
        <h2 class="featurette-heading">Musicaaaaaaaaaaaa 33</h2>
        <p class="lead"> Somos desarrolladores asdflknaskdfal adlsk falkds malkfj klasdfj alsd </p>
    </div>
    <div class="col-md-6">
        <img class="featurette-image img-responsive center-block" data-src="holder.js/500x500/auto"
             src="img/fondo3.jpg" alt="Generic placeholder image">
    </div>
</div>
<!-- /END THE FEATURETTES -->

<jsp:include page="script.jsp"/>

<!-- FOOTER -->
<br>
<br>
<footer>
    <p>&copy; Utp 2018, Grupo Pentatech</p>
</footer>
</div>
</body>
</html>
