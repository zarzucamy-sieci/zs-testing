import config.Config;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@ContextConfiguration(classes = {Config.class})
public class GetTest extends BaseApiTest {

    @Autowired
    private Config config;

    private RequestSpecification requestSpecification;

    @Test
    public void getMainPage() {
        given()
                .when()
                .get(config.getHost())
                .then()
                .statusCode(200);
    }
}
