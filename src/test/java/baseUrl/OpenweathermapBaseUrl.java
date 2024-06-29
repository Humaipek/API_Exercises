package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

public class OpenweathermapBaseUrl {

    protected RequestSpecification spec;

    @BeforeEach
    void setUp() {

        spec= new RequestSpecBuilder()
                .setBaseUri("http://api.openweathermap.org")
                .setContentType(ContentType.JSON)
                .build();
    }
}
