package get_requests;

import baseUrl.OpenweathermapBaseUrl;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenweathermapGetRequest_01 extends OpenweathermapBaseUrl {

    @Test
    public void test01() {

        String apiKey="5d7772388ef49b72c2b4a9444b261e0f";

        spec.pathParams("first", "data", "second", "2.5", "third", "weather");

        Response response=given(spec).queryParams("q", "Istanbul","appid", apiKey).when().get("{first}/{second}/{third}");


        assertEquals(200,response.statusCode());
        assertEquals("Istanbul",response.path("name"));


    }
}
