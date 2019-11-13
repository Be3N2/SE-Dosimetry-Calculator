
function validate() {
	let error = [];
	
	let age = parseInt($("[name=age]").val());
	if (age == null || age < 5 || age > 110) {
		error.push("age");
	}
	
	let weight = parseInt($("[name=weight]").val());
	if (weight == null || weight < 5 || age > 1100) {
		error.push("weight");
	}
	
	let organMass = parseInt($("[name=organMass]").val());
	if (weight == null || organMass <= 0) {
		error.push("organMass");
	}
	
	let redBlood = parseInt($("[name=redBlood]").val());
	if (redBlood == null|| redBlood <= 0) {
		error.push("redBlood");
	}
	
	let whiteBlood = parseInt($("[name=whiteBlood]").val());
	if (whiteBlood == null|| whiteBlood <= 0) {
		error.push("whiteBlood");
	}
	
	let albumin = parseInt($("[name=albumin]").val());
	if (albumin == null|| albumin <= 0) {
		error.push("albumin");
	}
	
	if (error.length == 0) return true;
	else {
		for (let i = 0; i < error.length; i++) {
			let query = "[name=" + error[i] + "]";
			$(query).css({"border-color": "red"});
		}
		
		alert("Error entering data");
	}
	return false;
}	
