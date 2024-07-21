package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="/C:\\Users\\Sham\\Desktop\\New folder (5)\\ConflictGit\\src\\test\\java\\Features\\TC_001_Conflict.feature",
		glue = "Steps",
		dryRun= false,
		monochrome= true

)


public class RunnerTest {

}
