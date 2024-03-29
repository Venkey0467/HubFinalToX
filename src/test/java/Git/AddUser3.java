package Git;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class AddUser3 {

	@Test
	public void CreateUser1()
	{
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"name\": \"boss\",\r\n"
					+ "    \"role\": \"sm\",\r\n"
					+ "    \"age\": 31,\r\n"
					+ "    \"city\": \"hyd\"\r\n"
					+ "}")
		.when()
			.post("http://localhost:3000/posts/")
		.then()
			.log().all();
	}
	
	@Test
	public void CreateUser2()
	{
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"name\": \"venkey\",\r\n"
					+ "    \"role\": \"qa\",\r\n"
					+ "    \"age\": 28,\r\n"
					+ "    \"city\": \"hyd\"\r\n"
					+ "}")
		.when()
			.post("http://localhost:3000/posts/")
		.then()
			.log().all();
	}

	@Test
	public void CreateUser3()
	{
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"name\": \"yuvan\",\r\n"
					+ "    \"role\": \"qa\",\r\n"
					+ "    \"age\": 22,\r\n"
					+ "    \"city\": \"hyd\"\r\n"
					+ "}")
		.when()
			.post("http://localhost:3000/posts/")
		.then()
			.log().all();
	}
	

	@Test
	public void CreateUser4()
	{
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"name\": \"vissu\",\r\n"
					+ "    \"role\": \"qa\",\r\n"
					+ "    \"age\": 29,\r\n"
					+ "    \"city\": \"hyd\"\r\n"
					+ "}")
		.when()
			.post("http://localhost:3000/posts/")
		.then()
			.log().all();
	}
}
