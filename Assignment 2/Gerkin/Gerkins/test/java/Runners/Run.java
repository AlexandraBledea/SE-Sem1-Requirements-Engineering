package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/testLogin.feature",
                    "src/test/resources/testRegister.feature",
                    "src/test/resources/testForgotPassword.feature",
                    "src/test/resources/testApplyInternship.feature",
                    "src/test/resources/testListApplications.feature",
                    "src/test/resources/testListAnnouncements.feature",
                    "src/test/resources/testViewApplication.feature",
                    "src/test/resources/testViewAnnouncement.feature"},
        glue = {"StepsDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {
}
