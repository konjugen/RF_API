import org.testng.annotations.Test;
import Handler.RequestHandler;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class IntegrationTests {
	
	private String url = Implementation.Constants.BaseUrl;
	private String langMethod = "clients";
	
	@Test
	public void get_clients_returns_200_with_java_language(){
		
		given()
			.get(url + langMethod + "/java")
		.then()
			.statusCode(200)
		.log().all();
	}	
	
	@Test
	public void post_clients_returns_400_with_expected_parameters(){
		
		RequestHandler req = new RequestHandler();
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.when()
		.body(req.ClientRequest())
		.post(url + langMethod + "/java")
		.then()
		.statusCode(400)
		.and()
		.log().all();
	}
}
