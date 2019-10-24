package Core;

public class PatientData {

	//Patient attributes
	private String FirstName;
	private String LastName;
	private String ID;					//unique identifier
	private double Height;				//height in inches
	private String Gender;
	private int Age;
	
	//Tumor attributes
	private String TumorLocation;		//represents what organ the tumor is on
	private double OrganMass;			//mass of the organ in kilograms
	private int CancerStage;			//Stage of cancer
	private double TumorMass;
	private int TumorQuantity;
	
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
	
	//Constructor
	PatientData(String firstname, String lastname, String ID, double height, String gender, int age,
			String tumorlocation, double organmass, int cancerstage, double tumormass, int tumorquantity,
			double whitebloodcellcount, double redbloodcellcount, double glucose, double sodium, double chloride, double albumin)
	{
		this.FirstName = firstname;
		this.LastName = lastname;
		this.ID = ID;
		this.Height = height;
		this.Gender = gender;
		this.Age = age;
		
		this.TumorLocation = tumorlocation;
		this.OrganMass = organmass;
		this.CancerStage = cancerstage;
		this.TumorMass = tumormass;
		this.TumorQuantity = tumorquantity;
		
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
	
	public void SetTumorLocation(String tumorlocation) {
		this.TumorLocation = tumorlocation;
	}
	
	public void SetOrganMass(double organmass) {
		this.OrganMass = organmass;
	}
	
	public void SetCancerStage(int cancerstage) {
		this.CancerStage = cancerstage;
	}
	
	public void SetTumorMass(double tumormass) {
		this.TumorMass = tumormass;
	}
	
	public void SetTumorQuantity(int tumorquantity) {
		this.TumorQuantity = tumorquantity;
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
	
	public String GetTumorLocation() {
		return this.TumorLocation;
	}
	
	public double GetOrganMass() {
		return this.OrganMass;
	}
	
	public int GetCancerStage() {
		return this.CancerStage;
	}
	
	public double GetTumorMass() {
		return this.TumorMass;
	}
	
	public int GetTumorQuantity() {
		return this.TumorQuantity;
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
		System.out.println("Tumor Mass: " + Double.toString(this.GetTumorMass()));
		System.out.println("Tumor Quantity: " + Integer.toString(this.GetTumorQuantity()));
		System.out.println("Red blood: " + Double.toString(this.GetRedBloodCellCount()));
		System.out.println("White blood: " + Double.toString(this.GetWhiteBloodCellCount()));
		System.out.println("Sodium: " + Double.toString(this.GetSodium()));
		System.out.println("Chloride: " + Double.toString(this.GetChloride()));
		System.out.println("Glucose: " + Double.toString(this.GetGlucose()));
		System.out.println("Albumin: " + Double.toString(this.GetAlbumin()));
	}
	
}