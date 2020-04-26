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
    <p><font size="6" face="Verdana" color="white"><strong>Health Management System </strong></font></p>
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
<form action="saveCareRelationship" method="post">
            <div>
            <h3>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Please select a doctor </h3>
				<div id="empTblContainer" class="container" ng-show="doctorList.length">
           		<table id="empTbl" class="table table-bordered marginTop14">
              		<thead>
                 		<tr>
                    		<th></th> <th>Username</th> <th>E-mail</th> <th>Introduction</th>
                 		</tr>
              		</thead>
              		<tbody>
              		<%@ page import="java.util.List, cn.anxcyun.www.po.Doctor" %>
						<%	List<Doctor> l= (List<Doctor>)request.getAttribute("doctors");%>
                 		<% for(Doctor d : l){ %>
								<tr><td><label>
                      <input type="radio" name="radiobutton" value="<%= d.getEmail() %>">
                      </label></td><td><%= d.getUsername() %></td><td><%= d.getEmail() %><td><%= d.getIntroduction() %></td></tr>
						<%}%>
						<tr>
              		</tbody>
           		</table>
           	</div>    
            <p>
              <label for="label"></label>
      &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
      <input name="Save" type="submit" id=reg value="Save" />
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
	
