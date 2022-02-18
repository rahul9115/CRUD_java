<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration Form</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
   >
    <style><%@include file="/css/style.css"%></style>
</head>
<body>
<div class="main">

        <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <h2 class="form-title">Sign up</h2>
                        <form action="<%= request.getContextPath() %>/register" method="POST" class="register-form" id="register-form">
                            <div class="form-group">
                                <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="Name" id="name" placeholder="Your Name" required/>
                            </div>
                            <div class="form-group">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <input type="email" name="Email" id="email" placeholder="Your Email" required/>
                            </div>
                           <div class="form-group">
                                
                                <label for="email"><i class="zmdi zmdi-email">Choose Country</i></label>
								<br>
								<br>
								<select id="cars" name="Country" required>
								 <option value="" selected></option>
								  <option value="India">India</option>
								  <option value="USA">USA</option>
								  <option value="England">England</option>
								  
								</select>
                            </div>
                             <div class="form-group">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <input type="number" name="Age" id="email" placeholder="Your Age" required/>
                            </div>
                             <div class="form-group">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <input type="date" name="DOB" id="email" placeholder="Your Age" required/>
                            </div>
                            <div class="form-group">
                                
                                <label for="email"><i class="zmdi zmdi-email">Choose Gender</i></label>
								<br>
								<br>
								<select id="cars" name="Gender" required>
								 <option value="" selected></option>
								  <option value="Male">Male</option>
								  <option value="Female">Female</option>
								 
								  
								</select>
                            </div>
                           
                            
                            <div class="form-group form-button">
                                <input type="submit" name="signup" id="signup" class="form-submit" value="Register"/>
                            </div>
                            <div class="form-group form-button">
                                <a href="display.jsp" type="submit" name="signup" id="signup" class="form-submit" value="Register">View Users</a>
                            </div>
                        </form> 
                       
                        
                    </div>
                   
                </div>
            </div>
        </section>

       

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>