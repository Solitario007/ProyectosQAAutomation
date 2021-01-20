package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//"Modulos/Login/LoginPrueba.feature"
@RunWith(Cucumber.class)
@CucumberOptions(
		
				features = {"Modulos/Login/LoginPrueba.feature"
			   },
		
//				format = {"pretty", "html:target/Destination"},
				glue = "",
			// tags  = {"@VariosFeatures"}		
		       tags = {"@tagAtester"}
		)

public class CucumberRunner {
	
}




