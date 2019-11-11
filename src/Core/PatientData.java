package Core;

public class PatientData {

	//Patient attributes
	private String FirstName;
	private String LastName;
	private String ID;					//unique identifier
	private double Height;				//height in inches
	private String Gender;
	private int Age;
	private double Weight;
	
	//Tumor attributes
	private String TumorLocation;		//represents what organ the tumor is on
	private double OrganMass;			//mass of the organ in kilograms
	private int CancerStage;			//Stage of cancer
	
	//Blood levels
	private double WhiteBloodCellCount;
	private double RedBloodCellCount;
	private double Glucose;
	private double Sodium;
	private double Chloride;
	private double Albumin;
	
	//Radiation results
	private double TotalDoseLowRisk;
	private double TotalDoseMedRisk;
	private double TotalDoseHighRisk;
	private int TotalTherapyWeeks;
	private String RecommendedRiskLevel;
	
	// Recommended Surgeries from Surgery Class
	private String RecomendedSurgery;
	
	// Chemotherapy Drug name and dosage amount
	private String chemoDrug;
	
	//Constructor
	public PatientData(String firstname, String lastname, String ID, double height, String gender, int age, double weight,
			String tumorlocation, double organmass, int cancerstage, 
			double whitebloodcellcount, double redbloodcellcount, double glucose, double sodium, double chloride, double albumin)
	{
		this.FirstName = firstname;
		this.LastName = lastname;
		this.ID = ID;
		this.Height = height;
		this.Gender = gender;
		this.Age = age;
		this.Weight = weight;
		
		this.TumorLocation = tumorlocation;
		this.OrganMass = organmass;
		this.CancerStage = cancerstage;
		
		this.WhiteBloodCellCount = whitebloodcellcount;
		this.RedBloodCellCount = redbloodcellcount;
		this.Glucose = glucose;
		this.Sodium = sodium;
		this.Chloride = chloride;
		this.Albumin = albumin;
	}
	
	//Setter methods
	public void SetFirstName(String firstname) {
		this.FirstName = firstname;
	}
	
	public void SetLastName(String lastname) {
		this.LastName = lastname;
	}
	
	public void SetID(String id) {
		this.ID = id;
	}
	
	public void SetHeight(double height) {
		this.Height = height;
	}
	
	public void SetGender(String gender) {
		this.Gender = gender;
	}
	
	public void SetAge(int age) {
		this.Age = age;
	}
	
	public void SetWeight(double weight) {
		this.Weight = weight;
	}
	
	public void SetTumorLocation(String tumorlocation) {
		this.TumorLocation = tumorlocation;
	}
	
	public void SetOrganMass(double organmass) {
		this.OrganMass = organmass;
	}
	
	public void SetCancerStage(int cancerstage) {
		this.CancerStage = cancerstage;
	}
	
	
	public void SetWhiteBloodCellCount(double whitebloodcellcount) {
		this.WhiteBloodCellCount = whitebloodcellcount;
	}
	
	public void SetRedBloodCellCount(double redbloodcellcount) {
		this.RedBloodCellCount = redbloodcellcount;
	}
	
	public void SetGlucose(double glucose) {
		this.Glucose = glucose;
	}
	
	public void SetSodium(double sodium) {
		this.Sodium = sodium;
	}
	
	public void SetChloride(double chloride) {
		this.Chloride = chloride;
	}
	
	public void SetAlbumin(double albumin) {
		this.Albumin = albumin;
	}
	
	//Radiation results setters
	public void SetTotalDoseLowRisk(double dose) {
		this.TotalDoseLowRisk = dose;
	}
	
	public void SetTotalDoseMedRisk(double dose) {
		this.TotalDoseMedRisk = dose;
	}
	
	public void SetTotalDoseHighRisk(double dose) {
		this.TotalDoseHighRisk = dose;
	}
	
	public void SetTotalTherapyWeeks(int weeks) {
		this.TotalTherapyWeeks = weeks;
	}
	
	public void SetRecommendedRiskLevel(String level) {
		this.RecommendedRiskLevel = level;
	}
	
	public void setRecommendedSurgery(String RecommendedSurgery) {
		this.RecomendedSurgery = RecommendedSurgery;
	}
	
	// Chemotherapy Drug Setter
	public void setChemoDrug(String drug) {
		this.chemoDrug = drug;
	}
	
	
	//Getter methods
	public String GetFirstName() {
		return this.FirstName;
	}
	
	public String GetLastName() {
		return this.LastName;
	}
	
	public String GetID() {
		return this.ID;
	}
	
	public double GetHeight() {
		return this.Height;
	}
	
	public String GetGender() {
		return this.Gender;
	}
	
	public int GetAge() {
		return this.Age;
	}
	
	public double GetWeight() {
		return this.Weight;
	}
	
	public String GetTumorLocation() {
		return this.TumorLocation;
	}
	
	public double GetOrganMass() {
		return this.OrganMass;
	}
	
	public int GetCancerStage() {
		return this.CancerStage;
	}
	
	public double GetWhiteBloodCellCount() {
		return this.WhiteBloodCellCount;
	}
	
	public double GetRedBloodCellCount() {
		return this.RedBloodCellCount;
	}
	
	public double GetGlucose() {
		return this.Glucose;
	}
	
	public double GetSodium() {
		return this.Sodium;
	}
	
	public double GetChloride() {
		return this.Chloride;
	}
	
	public double GetAlbumin() {
		return this.Albumin;
	}
	
	//radiation results getters
	public double GetTotalDoseLowRisk() {
		return this.TotalDoseLowRisk;
	}
	
	public double GetTotalDoseMedRisk() {
		return this.TotalDoseMedRisk;
	}
	
	public double GetTotalDoseHighRisk() {
		return this.TotalDoseHighRisk;
	}
	
	public int GetTotalTherapyWeeks() {
		return this.TotalTherapyWeeks;
	}
	
	public String GetRecommendedRiskLevel() {
		return this.RecommendedRiskLevel;
	}
	
	public String GetRecommendedSurgery() {
		return this.RecomendedSurgery;
	}
	
	// getter method for chemotherapy drug
	public String GetChemoDrug() {
		return this.chemoDrug;
	}
	
	
	
	
	//prints all the member variables to the console for debugging
	public void Print() {
		System.out.println("First Name: " + this.GetFirstName());
		System.out.println("Last Name: " + this.GetLastName());
		System.out.println("ID: " + this.GetID());
		System.out.println("Height: " + Double.toString(this.GetHeight()));
		System.out.println("Gender: " + this.GetGender());
		System.out.println("Age: " + Integer.toString(this.GetAge()));
		System.out.println("Tumor Location: " + this.GetTumorLocation());
		System.out.println("Organ Mass: " + Double.toString(this.GetOrganMass()));
		System.out.println("Cancer Stage: " + Integer.toString(this.GetCancerStage()));
		System.out.println("Red blood: " + Double.toString(this.GetRedBloodCellCount()));
		System.out.println("White blood: " + Double.toString(this.GetWhiteBloodCellCount()));
		System.out.println("Sodium: " + Double.toString(this.GetSodium()));
		System.out.println("Chloride: " + Double.toString(this.GetChloride()));
		System.out.println("Glucose: " + Double.toString(this.GetGlucose()));
		System.out.println("Albumin: " + Double.toString(this.GetAlbumin()));
		System.out.println("Total dose low risk: " + Double.toString(this.GetTotalDoseLowRisk()));
		System.out.println("Total dose medium risk: " + Double.toString(this.GetTotalDoseMedRisk()));
		System.out.println("Total dose high risk: " + Double.toString(this.GetTotalDoseHighRisk()));
		System.out.println("Dose delivered over: " + Integer.toString(this.GetTotalTherapyWeeks()));
		System.out.println("Recommended Risk level: " + this.GetRecommendedRiskLevel());
	}
	
}
