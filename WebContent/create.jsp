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

</head>
<body>
	<header>	
		<div class="navBar">
			<h3 class="header">Create a Patient</h3>
			<ul class="navigation">
				<%
					//Display username if logged in
					if (session != null && session.getAttribute("name") != null) {
						out.print("<li>| <a href='logout.jsp'>Log out</a></li>");
						out.print("<li>| Welcome " + session.getAttribute("name") + "</li>");
					} else {
						//If not logged in redirect to login page
						response.sendRedirect("login.jsp");
					}
				%>
				<li>Create</li>
				<li>Update</li>
				<li>View</a></li>
			</ul>
		</div>
	</header>

	<noscript>Javascript is disabled - It must be enabled to use this page.</noscript>
	<form name="patientInfo" method="get" action="/Dosimetry_Calculator/treatment.jsp">
	<div class="grid-container">
	<div class="anatomy">
		<h4>Patient Anatomy</h4>

		<div class="field"><label>First Name: </label>
		<input type="text" name="firstName" placeholder="First Name"/> <br/></div>
		<div class="field"><label>Last Name: </label>
		<input type="text" name="lastName" placeholder="Last Name"/> <br/></div>
		<div class="field"><label>Patient ID: </label>
		<input type="number" name="ID" placeholder="12345678"/> <br/></div>
		<div class="field"><label>Height (inches): </label>
		<input type="text" name="height" placeholder="70" /> <br/></div>
		<div class="field"><label>Gender: </label>
		<select name="Gender">
			<option value="M">Male</option>
			<option value="F">Female</option>
		</select><br/></div>
		<div class="field"><label>Age: </label>
		<input type="number" name="age" placeholder="35" /> <br/></div>
		<div class="field"><label>Weight: </label>
		<input type="number" name="weight" placeholder="170" /> <br/></div>
	</div>

	<div class="cancer">
		<h4>Cancer Details</h4>
		<div class="field"><label>Tumor Location: </label>
		<input type="text" name="tumorLocation" placeholder="location" /> <br/></div>
		<div class="field"><label>Organ Mass: </label>
		<input type="text" name="organMass" placeholder="organ mass" /> <br/></div>
		<div class="field"><label>Cancer Stage: </label>
		<input type="text" name="cancerStage" placeholder="stage"/> <br/></div>
	</div>

	<div class="blood">
		<h4>Blood Levels</h4>
		<div class="field"><label>Red Blood Count </label>
		<input type="text" name="redBlood" placeholder="red count"/><br/></div>
		<div class="field"><label>White Blood Count </label>
		<input type="text" name="whiteBlood" placeholder="white count"/><br/></div>
		<div class="field"><label>Glucose, Serum: </label>
		<input type="text" name="glucose" placeholder="mmol/L"/> <br/></div>
		<div class="field"><label>Sodium, Serum: </label>
		<input type="text" name="sodium" placeholder="mmol/L"/> <br/></div>
		<div class="field"><label>Chloride, Serum: </label>
		<input type="text" name="chloride" placeholder="mmol/L"/> <br/></div>
		<div class="field"><label>Albumin, Serum: </label>
		<input type="text" name="albumin" placeholder="mmol/L"/> <br/></div>
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