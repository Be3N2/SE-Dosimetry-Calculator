package Core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


/**
 * Servlet implementation class Create
 */
@WebServlet("/Lookup")
public class Lookup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lookup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get Input patient data From Header
		//mongodb connection
		
		String mongoUri = "mongodb+srv://admin:admin2019ysu@cluster0-lliro.mongodb.net/test?retryWrites=true&w=majority";
		MongoClientURI uri = new MongoClientURI(mongoUri);

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("Dosimetry");
		
		MongoCollection<Document> patients = database.getCollection("Patients");
		
		String ID = request.getParameter("ID");
		BasicDBObject whereQuery = new BasicDBObject();
		whereQuery.put("id", ID);
		
		FindIterable<Document> docs = patients.find(whereQuery);
		boolean ran = false;
		for (Document doc : docs) {
			ran = true;
			String redirectUrl = "treatmentView.jsp?";
	    	System.out.println("Success!" + doc.getString("Firstname"));
			redirectUrl += "firstName" + "=" + doc.getString("Firstname");
			redirectUrl += "&" + "lastName" + "=" + doc.getString("Lastname");
			redirectUrl += "&" + "ID" + "=" + doc.getString("id");
			redirectUrl += "&" + "height" + "=" + doc.getDouble("Height").toString();
			redirectUrl += "&" + "Gender" + "=" + doc.getString("Gender");
			redirectUrl += "&" + "age" + "=" + doc.getInteger("Age").toString();
			redirectUrl += "&" + "weight" + "=" + doc.getDouble("Weight").toString();
			redirectUrl += "&" + "comments" + "=" + doc.getString("Comments");
			redirectUrl += "&" + "tumorLocation" + "=" + doc.getString("TumorLocation");
			redirectUrl += "&" + "organMass" + "=" + doc.getDouble("OrganMass").toString();
			redirectUrl += "&" + "cancerStage" + "=" + doc.getInteger("CancerStage").toString();
			redirectUrl += "&" + "redBlood" + "=" + doc.getDouble("Redblood").toString();
			redirectUrl += "&" + "whiteBlood" + "=" + doc.getDouble("Whiteblood").toString();
			redirectUrl += "&" + "glucose" + "=" + doc.getDouble("Glucose").toString();
			redirectUrl += "&" + "sodium" + "=" + doc.getDouble("Sodium").toString();
			redirectUrl += "&" + "chloride" + "=" + doc.getDouble("Chloride").toString();
			redirectUrl += "&" + "albumin" + "=" + doc.getDouble("Albumin").toString();
			
			System.out.println(redirectUrl);
			response.sendRedirect(redirectUrl);
			break;
		}	
					
		if (!ran) {
			response.setHeader("Failed", "ID Not Found");
			response.sendRedirect("View.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
