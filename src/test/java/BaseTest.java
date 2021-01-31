import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

@Slf4j
public abstract class BaseTest extends AbstractTestNGSpringContextTests {

    @BeforeSuite(alwaysRun = true)
    public void setUp(ITestContext testContext) { log.info("SUITE STARTED: {} ", testContext.getSuite().getName()); }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method method) { log.info("TEST STARTED: {} ", method.getName()); }

    @AfterMethod(alwaysRun = true)
    public void tearDown(Method method) {log.info("TEST FINISHED: {} ", method.getName()); }

    @BeforeClass
    public void beforeClass() {log.info("CLASS STARTED: {}", getClass().getName()); }
}
