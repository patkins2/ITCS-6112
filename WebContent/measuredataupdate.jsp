<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8" />

	<title>masureData</title>

    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">

	<link href="css/style.css" rel='stylesheet' type='text/css' />

	<style>

	/* The message box is shown when the user clicks on the password field */

#message {

  display:none;

  background: #f1f1f1;

  color: #000;

  position: relative;

  padding: 5px;

  margin-top: 10px;

}

#message p {

  padding: 10px 35px;

  font-size: 18px;

}



/* Add a green text color and a checkmark when the requirements are right */

.valid {

  color: green;

}



.valid:before {

  position: relative;

  left: 160px;

 

}



/* Add a red text color and an "x" when the requirements are wrong */

.invalid {

  color: red;

}



.invalid:before {

  position: relative;

  left: 160px;

 

}

</style>

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

      <form action="updateMeasureData" method="post">

            <div>

            <h3>

				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Please enter your measure data: </h3>

            <table width="1005" height="305" border="0">

              <tr>

                <td width="189">&nbsp;</td>

                <td width="164"><label>

                  <div align="center">Date (mm/dd/yyyy):</div>

                </label></td>

                <td width="638"><input name="date" type="text" size="40"></td>

              </tr>
              
              <tr>

                <td>&nbsp;</td>

                <td><label>

                  <div align="center">Height (in inches):</div>

                  </label></td>

                <td><input name="height" type="text" size="40"></td>

              </tr>

              <tr>

                <td>&nbsp;</td>

                <td><label>

                  <div align="center">Weight (in pounds):</div>

                  </label></td>

                <td><input name="weight" type="text" size="40"></td>

              </tr>

              <tr>

                <td>&nbsp;</td>

                <td><label>

                  <div align="center">Blood Pressure (?/?):</div>

                  </label></td>

                <td><input name="bloodPressure" type="text" size="40"></td>

              </tr>

              <tr>

                <td>&nbsp;</td>

                <td><label>

                  <div align="center">Blood Sugar (?/?): </div>

                  </label></td>

                <td><input name="bloodSugar" type="text" size="40"></td>

              </tr>

              <tr>

                <td height="74">&nbsp;</td>

                <td><label>

                  <div align="center">Temp:</div>

                  </label></td>

                <td><input name="temp" type="text" size="40"></td>

              </tr>

        </table>

		        <p>

              

            &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

        </p>

        <p>

              

            &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;

            <input name="Save" type="submit" id=reg value="Save" />

            &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="reset" name="reset" id="reset" value="Cancel">

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

