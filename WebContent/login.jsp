<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
	<title>Login</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="css/style.css" rel='stylesheet' type='text/css' />
</head>
<body>

<header>
  <div class="container">
    <p><font size="6" face="Verdana" color="white"><strong>Health Management System - Login</strong></font></p>
  </div>
</header>

	<nav class="navbar navbar-default" role="navigation">
		<div class="container">
			<div class="navbar-header">
			
				<a class="navbar-brand" href="#">
					Welcome ! We care your health !
				</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li>
                        <a class="page-scroll" href="index.jsp">Home</a>
                    </li>
					<li>
                        <a class="page-scroll" href="login.jsp">Login</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="signup.jsp">Sign up</a>
                    </li>
				</ul>
			</div>
		</div>
	</nav>
	<div>
	<div>
<div>
<div>
	        <form action="login" method="post">
            <div>
            <h3>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                Login
			</h3>
            <p>
				&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<label for="email">Email:</label>
			</p>
			<p>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			    <input type="email" name="email" id="email">
			</p>
            <p>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<label for="password">Password:</label>
			</p>
            <p>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<input type="password" name="password" id="password">
			</p>
            <p>
                &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<input id=reg type="submit" value="Login" />
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<input type="reset" name="reset" id="reset" value="Reset">
            </p>
            <p>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				New user?&nbsp;Please Sign up&nbsp; <a href="signup.jsp">here</a>
            </p>    
            </form>    
            </div>
</div>	
	
	<footer>
		<div class="wrap-footer">
			<div class="container">
				<div class="row">
			      <div class="footer-heading"><h4>About us&nbsp;</h4></div>
					<p>People's health awareness is getting stronger and stronger, and an easy-to-use health management system is beneficial. This health management system allows non-doctor users to record their physical indicators at any time. Also, it will enable their doctors to query their health information as quickly as possible when needed. Doctors can also check the knowledge of their patients at any time and give some suggestions or supervision online.</p>
				</div>
			</div>
		</div>
	</footer>
	<div class="coppy-right">
		<div class="wrap-footer">
			<div class="clearfix">
				<div class="col-md-6 col-md-offset-3">
					<p>Copyright @ HealthManagementSystem - Designed by group 1 in ITCS 6112</a></p>
				</div>
			</div>	
		</div>
	</div>
</body>
</html>
	
