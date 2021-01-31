import io.restassured.RestAssured;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;

public abstract class BaseApiTest extends BaseTest {

    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) {
        super.setUp(testContext);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
