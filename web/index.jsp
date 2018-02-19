<%--
  Created by IntelliJ IDEA.
  User: luis
  Date: 08/02/2018
  Time: 16:04
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
  <title>Pentatech Inicio</title>

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
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#what">Quienes somos</a></li>
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
<div class="container">
  <hr class="featurette-divider">

  <div class="row featurette">
    <div class="col-md-6">
      <h2 class="featurette-heading">Musicaaaaaaaaaaaa</h2>
      <p class="lead"> En melody band asdlmakls lasd laksm dla mksldamd laksm lasmd lakm kgjlran lkajn galk </p>
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
      <p class="lead"> En melody band asdlmakls lasd laksm dla mksldamd laksm lasmd lakm kgjlran lkajn galk </p>
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
      <p class="lead"> En melody band asdlmakls lasd laksm dla mksldamd laksm lasmd lakm kgjlran lkajn galk </p>
    </div>
    <div class="col-md-6">
      <img class="featurette-image img-responsive center-block" data-src="holder.js/500x500/auto"
           src="img/fondo3.jpg" alt="Generic placeholder image">
    </div>
  </div>

  <hr class="featurette-divider">
  <h2 class="featurette-heading" align="center">Ultimos eventos</h2>
  <hr class="featurette-divider">

  <div class="row text-center">

    <div class="col-md-4 col-sm-6 hero-feature">
      <div class="thumbnail">
        <iframe width="350" height="250" src="https://www.youtube.com/embed/W11hum5yr1E"
                frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
        <div class="caption">

          <h3>Evento N°1</h3>
          <p>Banda LODVG</p>

        </div>
      </div>
    </div>

    <div class="col-md-4 col-sm-6 hero-feature">
      <div class="thumbnail">
        <iframe width="350" height="250" src="https://www.youtube.com/embed/W11hum5yr1E"
                frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
        <div class="caption">

          <h3>Evento N°2</h3>
          <p>Agrupacion Marilyn</p>

        </div>
      </div>
    </div>

    <div class="col-md-4 col-sm-6 hero-feature">
      <div class="thumbnail">
        <iframe width="350" height="250" src="https://www.youtube.com/embed/W11hum5yr1E"
                frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
        <div class="caption">
          <h3>Evento N°3</h3>
          <p>Catarasis</p>

        </div>
      </div>
    </div>

  </div>
  <!-- /END THE FEATURETTES -->

  <jsp:include page="script.jsp"/>

  <!-- FOOTER -->

  <footer>
    <p>&copy; Utp 2017, Grupo Pentatech</p>
  </footer>

</div><!-- /.container -->

</body>
</html>
