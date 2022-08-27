package Runner;

import java.io.IOException;

import BaseData.TestBases;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature", glue = {"steps"})
public class TestRunner extends TestBases {
	

	public TestRunner() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
