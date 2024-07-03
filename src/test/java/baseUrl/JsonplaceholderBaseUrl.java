package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;

public class JsonplaceholderBaseUrl {

    protected RequestSpecification spec;

    @BeforeEach
    void setUp() {
        spec= new RequestSpecBuilder()
                .setBaseUri("POST https://jsonplaceholder.typicode.com")
                .setContentType(ContentType.JSON)
                .build();
    }
}
