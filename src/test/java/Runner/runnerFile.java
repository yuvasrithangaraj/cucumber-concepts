package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "featureFile",
		glue = {"StepDef"},
		dryRun = !true,
		monochrome = true,
		tags = "@practice",
		plugin = {"pretty", "html: reports/htmlreport.html", "json: reports/jsonreport.json",
					"junit: reports/xmlreport.xml"}

		)

public class runnerFile {

}


// CucumberOptions
// 1. features
// 2. glue
// 3. dry run -boolean-> true->dry run without launching, false->run launching browser
// 4. strict - boolean-> true -> browser will launch first, then it will show in the
//                       output that feature file & step definition is mapped or not.
// 5. tags
// 6. monochrome - boolean -> to make the console into human readable format
// 7. plugin
