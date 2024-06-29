package put_requests;

import baseUrl.ReqresBaseUrl;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import pojos.RegresGetRequestPojo;
import pojos.RegresPutRequestPojo;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegresPut_01 extends ReqresBaseUrl {

    @Test
    public void test01() {

        spec.pathParams("first", "api", "second", "users", "third", 2);

        RegresGetRequestPojo payload= new RegresGetRequestPojo("Jane Doe","zion resident");

        Response response=given(spec).body(payload).when().put("{first}/{second}/{third}");

        RegresPutRequestPojo actualData= response.as(RegresPutRequestPojo.class);

        assertEquals(200, response.statusCode());
        assertEquals(payload.getName(),actualData.getName());
        assertEquals(payload.getJob(),actualData.getJob());


    }
}
