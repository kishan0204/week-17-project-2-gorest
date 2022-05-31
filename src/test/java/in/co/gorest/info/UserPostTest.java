package in.co.gorest.info;

import in.co.gorest.model.UserPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserPostTest extends TestBase {

    @Test
    public void createUser(){

        UserPojo userPojo = new UserPojo();
        userPojo.setName("Happy Potter");
        userPojo.setGender("male");
        userPojo.setEmail("harrypotter123"+getRandomValue()+"@gmail.com");
        userPojo.setStatus("active");


        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization","Bearer c426452f777927f6e49219f45652a5fd08178e3f873af217a5b982a6fdd15dac")
                .body(userPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();

    }

}