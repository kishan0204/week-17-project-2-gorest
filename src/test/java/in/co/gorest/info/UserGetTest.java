package in.co.gorest.info;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserGetTest extends TestBase {

    @Test
    public void getAllUserInfo(){
        Response response =  given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}