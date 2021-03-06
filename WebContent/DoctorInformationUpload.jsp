<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
	<title>Signup</title>
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
      <form action="updateDoctorInformation" method="post">
                  <div>
            <h3>
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Please enter your information: </h3>
            <table width="1005" height="365" border="0">
              <tr>
                <td width="177" height="50">&nbsp;</td>
                <td width="166"><label>
                  <div align="center">Address:</div>
                  </label></td>
                <td width="650"><input name="address" type="text" size="40"></td>
              </tr>
              <tr>
                <td height="50">&nbsp;</td>
                <td><label>
                  <div align="center">Telephone number : </div>
                  </label></td>
                <td><input name="telephoneNumber" type="text" size="40"></td>
              </tr>
			  <tr>
                <td height="50">&nbsp;</td>
                <td><label>
                  <div align="center">Gender:</div>
                  </label></td>
                <td><input name="gender" type="text" size="40"></td>
              </tr>
			  <tr>
                <td height="50">&nbsp;</td>
                <td><label>
                  <div align="center">Introduction :</div>
                  </label></td>
                <td><textarea name="introduction" cols="50" rows="10"></textarea></td>
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
	
	<script>
var myInput = document.getElementById("psw");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");

// When the user clicks on the password field, show the message box
myInput.onfocus = function() {
  document.getElementById("message").style.display = "block";
}

// When the user clicks outside of the password field, hide the message box
myInput.onblur = function() {
  document.getElementById("message").style.display = "none";
}

// When the user starts to type something inside the password field
myInput.onkeyup = function() {
  // Validate lowercase letters
  var lowerCaseLetters = /[a-z]/g;
  if(myInput.value.match(lowerCaseLetters)) {  
    letter.classList.remove("invalid");
    letter.classList.add("valid");
  } else {
    letter.classList.remove("valid");
    letter.classList.add("invalid");
  }
  
  // Validate capital letters
  var upperCaseLetters = /[A-Z]/g;
  if(myInput.value.match(upperCaseLetters)) {  
    capital.classList.remove("invalid");
    capital.classList.add("valid");
  } else {
    capital.classList.remove("valid");
    capital.classList.add("invalid");
  }

  // Validate numbers
  var numbers = /[0-9]/g;
  if(myInput.value.match(numbers)) {  
    number.classList.remove("invalid");
    number.classList.add("valid");
  } else {
    number.classList.remove("valid");
    number.classList.add("invalid");
  }
  
  // Validate length
  if(myInput.value.length >= 6 && myInput.value.length <= 12) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
}
</script>
	
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
	
