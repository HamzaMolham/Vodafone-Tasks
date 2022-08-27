package Vodafone.Rest_Assured_Task;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.RestAssured.given;

public class Rest_Assured_Task2 {
  @Test
  public void Validate_Status_Code() {
	  given().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200);
  }
  @Test
  public void Validate_Status_Code_bodyresp() {
	  
	  Response resp_body = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
	  Assert.assertEquals(resp_body.statusCode(), 200);
  }
}
