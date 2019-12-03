<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Patient</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/style.css">
<script src="validation.js"></script>
</head>
<body>
	<header>	
		<div class="navBar">
			<h3 class="header">Create a Patient</h3>
			<ul class="navigation">
				<%
					//Display username if logged in
					if (session != null && session.getAttribute("name") != null) {
						out.print("<li><a href='logout.jsp'>Log out</a></li>");
						out.print("<li>| " + session.getAttribute("name") + "</li>");
					} else {
						//If not logged in redirect to login page
						response.sendRedirect("login.jsp");
					}
				%>
				<li>Create</li>
				<li><a href="Update.jsp">Update</a></li>
				<li><a href="View.jsp">View</a></li>
			</ul>
		</div>
	</header>

	<noscript>Javascript is disabled - It must be enabled to use this page.</noscript>
	<form name="patientInfo" method="get" action="/Dosimetry_Calculator/treatment.jsp" onsubmit="return validate()">
	<div class="grid-container">
	<div class="anatomy">
		<h4>Patient Anatomy</h4>

		<div class="field"><label>First Name: </label>
		<input type="text" name="firstName" placeholder="First Name" required/> <br/></div>
		<div class="field"><label>Last Name: </label>
		<input type="text" name="lastName" placeholder="Last Name" required/> <br/></div>
		<div class="field"><label>Patient ID: </label>
		<input type="number" name="ID" placeholder="12345678" required/> <br/></div>
		<div class="field"><label>Height (inches): </label>
		<input type="text" name="height" placeholder="70" required/> <br/></div>
		<div class="field"><label>Gender: </label>
		<select name="Gender">
			<option value="M">Male</option>
			<option value="F">Female</option>
		</select><br/></div>
		<div class="field"><label>Age: </label>
		<input type="number" name="age" placeholder="35" required/> <br/></div>
		<div class="field"><label>Weight: </label>
		<input type="number" name="weight" placeholder="170" required/> <br/></div>
	</div>

	<div class="cancer">
		<h4>Cancer Details</h4>
		<div class="field"><label>Tumor Location: </label>
		<select name="tumorLocation">
			<!--<option value="heart">Heart</option>-->
			<option value="brain">Brain</option>
			<option value="liver">Liver</option>
			<option value="stomach">Stomach</option>
			<option value="lungs">Lungs</option>
			<option value="thyroid">Thyroid</option>
		</select> <br/></div>
		<div class="field"><label>Organ Mass: </label>
		<input type="text" name="organMass" placeholder="organ mass" required/> <br/></div>
		<div class="field"><label>Cancer Stage: </label>
		<select name="cancerStage">
			<option value='1'>1</option>
			<option value='2'>2</option>
			<option value='3'>3</option>
			<option value='4'>4</option>
		</select> <br/></div>
	</div>

	<div class="blood">
		<h4>Blood Levels</h4>
		<div class="field"><label>Red Blood Count </label>
		<input type="text" name="redBlood" placeholder="million cells/mcL 4,500-10,000" required/><br/></div>
		<div class="field"><label>White Blood Count </label>
		<input type="text" name="whiteBlood" placeholder="cells/mcL 4.5-5.9" required/><br/></div>
		<div class="field"><label>Glucose, Serum: </label>
		<input type="text" name="glucose" placeholder="mmol/L" required/> <br/></div>
		<div class="field"><label>Sodium, Serum: </label>
		<input type="text" name="sodium" placeholder="mmol/L" required/> <br/></div>
		<div class="field"><label>Chloride, Serum: </label>
		<input type="text" name="chloride" placeholder="mmol/L" required/> <br/></div>
		<div class="field"><label>Albumin, Serum: </label>
		<input type="text" name="albumin" placeholder="mmol/L" required/> <br/></div>
	</div>

	<div class="other">
		<h4>Comments &amp; Concerns</h4>
		<textarea name="comments" rows="8" cols="50" placeholder="Special comments and concerns for the patient records."></textarea>
	</div>

	<div class="submit">
		<button type="submit">Submit</button>
	</div>

	</div>
	</form>
		
</body>
</html>