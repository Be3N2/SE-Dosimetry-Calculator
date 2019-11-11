<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Core.*" %>
<%@ page import="Calculators.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Treatment Plan</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/treatment.css">
</head>
<body>

<%	
		//Get Input patient data From Header
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String ID = request.getParameter("ID");
		double height = Double.parseDouble(request.getParameter("height"));
		String gender = request.getParameter("Gender");
		int age = Integer.parseInt(request.getParameter("age"));
		double weight = Double.parseDouble(request.getParameter("weight"));

		String tumorlocation = request.getParameter("tumorLocation");
		double organmass = Double.parseDouble(request.getParameter("organMass"));
		int cancerstage = Integer.parseInt(request.getParameter("cancerStage"));

		double redblood = Double.parseDouble(request.getParameter("redBlood"));
		double whiteblood = Double.parseDouble(request.getParameter("whiteBlood"));
		double glucose = Double.parseDouble(request.getParameter("glucose"));
		double sodium = Double.parseDouble(request.getParameter("sodium"));
		double chloride = Double.parseDouble(request.getParameter("chloride"));
		double albumin = Double.parseDouble(request.getParameter("albumin"));

		//Construct the PatientData object from the patient data
		PatientData patient = new PatientData(firstName, lastName, ID, height, gender, age, weight, tumorlocation, organmass, cancerstage,
											  redblood, whiteblood, glucose, sodium, chloride, albumin);
		
		
		//Here is where we call the calculations:
		RadiationCalculator RadCalculator = new RadiationCalculator(patient);
		RadCalculator.CalculateTreatment();
		SurgeryCalculator SurgCalculator = new SurgeryCalculator(patient);
		SurgCalculator.CalculateTreatment();
		ChemotherapyCalculator ChemoCalculator = new ChemotherapyCalculator(patient);
		ChemoCalculator.CalculateTreatment();
		
		patient.Print();
%>
<header>	
	<div class="navBar">
		<h3 class="header">Treatment Plan</h3>
		<ul class="navigation">
			<%
					if (session != null && session.getAttribute("name") != null) {
						out.print("<li>| <a href='logout.jsp'>Log out</a></li>");
						out.print("<li>| Welcome " + session.getAttribute("name") + "</li>");
					} else {
						response.sendRedirect("login.jsp");
					}
				%>
				<li><a href="create.jsp">Create</a></li>
				<li>Update</li>
				<li>View</li>
		</ul>
	</div>
</header>

<div class="sections">
	<div class="info">
		<div class="patientName">
			<h4>Patient Name: </h4><p><%out.print(patient.GetFirstName()); %></p>
		</div>
		<div class="age">
			<h4>Age: </h4><p><%out.print(patient.GetAge()); %></p>
		</div>
		<div class="gender">
			<h4>Gender: </h4>
			<p><%out.print(patient.GetGender()); %></p>
		</div>
		<div class="height">
			<h4>Height:</h4>
			<p><%out.print(patient.GetHeight()); %></p>
		</div>
		<div class="weight">
			<h4>Weight: </h4>
			<p><%out.print(patient.GetWeight()); %></p>
		</div>
		<div class="location">
			<h4>Tumor Location</h4>
			<p><%out.print(patient.GetTumorLocation()); %></p>
		</div>
		<div class="cancer-stage">
			<h4>Cancer Stage</h4>
			<p><%out.print(patient.GetCancerStage()); %></p>
		</div>
		<div class="organ-mass">
			<h4>Organ Mass</h4>
			<p><%out.print(patient.GetOrganMass()); %></p>
		</div>
		<div class="white-blood">
			<h4>White Blood Cell Count</h4>
			<p><%out.print(patient.GetWhiteBloodCellCount()); %></p>
			<p>Abnormally High</p>
		</div>
		<div class="red-blood">
			<h4>Red Blood Cell Count</h4>
			<p><%out.print(patient.GetRedBloodCellCount()); %></p>
			<p>Abnormally Low</p>
		</div>
		<div class="albumin">
			<h4>Albumin Levels</h4>
			<p><%out.print(patient.GetAlbumin()); %></p>
			<p>Average</p>
		</div>
	</div>

	<div class="radiation">
		<h2>Radiation Plan</h2>
		<div class="top-row">
			<div class="radiation-type">
				<h4>Radiation Type</h4>
				<hr>
				<h5>3-D CRT</h5>
			</div>
			<div class="risk-level">
				<h4>Low Risk Total Dose</h4>
				<hr>
				<h5>800 Gy</h5>
				<h5><%out.print(patient.GetTotalDoseLowRisk()); %> Gy</h5>
			</div>
			<div class="risk-level">
				<h4>Medium Risk Total Dose</h4>
				<hr>
				<h5>1500 Gv</h5>
				<h5><%out.print(patient.GetTotalDoseMedRisk()); %> Gv</h5>
			</div>
			<div class="risk-level">
				<h4>High Risk Total Dose</h4>
				<hr>
				<h5>3000 Gv</h5>
				<h5><%out.print(patient.GetTotalDoseHighRisk()); %> Gv</h5>
			</div>
		</div>
		<div class="bottom-row">
			<div class="radiation-dose">
				<h4>Recommended Total Dose</h4>
				<hr>
				<h5>Low: 800 Gy</h5>
				<h5><%out.print(patient.GetRecommendedRiskLevel()); %></h5>
			</div>
			<div class="therapy-weeks">
				<h4>Total Therapy Weeks</h4>
				<hr>
				<h5>8 weeks</h5>
				<h5><%out.print(patient.GetTotalTherapyWeeks()); %> weeks</h5>
			</div>
		</div>

		<div class="calculations">
			<h4>Calculations</h4>
			<hr>
			<div>
				<div>
					<h5>Low risk absorbed dose:</h5>
					<br> 
					<h5>(9.9sv)/((5)*(2*organRiskFactor)+nearbyOrganRiskFactor)</h5>
				</div>
			
				<div>
					<h5>Low risk total dose: </h5>
					<br>
					<h5>absorbed dose*organ mass</h5>
				</div>
			</div>	
		</div>
	</div>
	<div class="chemotherapy">
		<h2>Chemotherapy</h2>
		
		<p><%out.print(patient.GetChemoDrug()); %></p>
		
	</div>
	<div class="sideEffects">
		<h2>Side Effects</h2>
		<ul id="sideEffects">
			<li>Nausea</li>
			<li>Vomiting</li>
		</ul>
	</div>
	<div class="surgery">
		<h2>Surgery</h2>
		<h4 id="surgery"><%out.print(patient.GetRecommendedSurgery()); %></h4>
	</div>
</div>


</body>
</html>