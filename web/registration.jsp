<%-- 
    Document   : registration
    Created on : Oct 25, 2023, 12:48:17 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Designined by CodingLab - youtube.com/codinglabyt -->
<html lang="en" dir="ltr">
    <head>
        <meta charset="UTF-8">
        <title>Karma Shop</title>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/linearicons.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="css/nouislider.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <!-- Start Header Area -->
        <header class="header_area sticky-header">
            <div class="main_menu">
                <nav class="navbar navbar-expand-lg navbar-light main_box">
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <a class="navbar-brand logo_h" href="index.jsp"><img src="img/logo.png" alt=""></a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                            <ul class="nav navbar-nav menu_nav ml-auto">
                                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                                <li class="nav-item submenu dropdown active">
                                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                                       aria-expanded="false">Shop</a>
                                    <ul class="dropdown-menu">
                                        <li class="nav-item active"><a class="nav-link" href="HomeControl">Shop Category</a></li>
                                        <li class="nav-item"><a class="nav-link" href="DetailControl">Product Details</a></li>
                                        <li class="nav-item"><a class="nav-link" href="checkout.jsp">Product Checkout</a></li>
                                        <li class="nav-item"><a class="nav-link" href="cart.jsp">Shopping Cart</a></li>
                                        <li class="nav-item"><a class="nav-link" href="confirmation.jsp">Confirmation</a></li>
                                    </ul>
                                </li>
                                <c:if test="${sessionScope.user != null}">
                                    <li class="nav-item submenu dropdown active">
                                        <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                                           aria-expanded="false">${sessionScope.user.username}</a>
                                        <ul class="dropdown-menu">
                                            <li class="nav-item active"><a class="nav-link" href="LogoutControl">Logout</a></li>


                                        </ul>
                                    </li>
                                </c:if>
                                <c:if test="${sessionScope.user == null}">
                                    <li class="nav-item submenu dropdown">
                                        <a href="login.jsp" class="nav-link dropdown-toggle"  role="button" aria-haspopup="true"
                                           aria-expanded="false">Login</a> 
                                    </li>
                                </c:if>

                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li class="nav-item"><a href="#" class="cart"><span class="ti-bag"></span></a></li>
                                <li class="nav-item">
                                    <button class="search"><span class="lnr lnr-magnifier" id="search"></span></button>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
<!--            <div class="search_input" id="search_input_box">
                <div class="container">
                    <form class="d-flex justify-content-between" action="SearchControl">
                        <input name="txt" type="text" class="form-control" id="search_input" placeholder="Search Here">
                        <button type="submit" class="btn"></button>
                        <span class="lnr lnr-cross" id="close_search" title="Close Search"></span>
                    </form>
                </div>
            </div>-->
        </header>
        <!-- End Header Area -->


        <div class="container">
            <div class="title">Registration</div>
            <div class="content">
                <form action="#">
                    <div class="user-details">
                        <div class="input-box">
                            <span class="details">Full Name</span>
                            <input name="fullname" type="text" placeholder="Enter your name" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Username</span>
                            <input name="user" type="text" placeholder="Enter your username" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Email</span>
                            <input name="email" type="text" placeholder="Enter your email" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Phone Number</span>
                            <input name="phone" type="text" placeholder="Enter your number" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Password</span>
                            <input name="pass" type="text" placeholder="Enter your password" required>
                        </div>
                        <div class="input-box">
                            <span class="details">Confirm Password</span>
                            <input name="repass" type="text" placeholder="Confirm your password" required>
                        </div>
                    </div>
                    <div class="button">
                        <input class="input-button" type="submit" value="Register">
                    </div>
                </form>
            </div>
        </div>

    </body>
</html>

