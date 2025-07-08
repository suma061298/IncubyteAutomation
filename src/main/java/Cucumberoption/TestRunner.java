package Cucumberoption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src\\main\\java\\Featurefiles"
,glue = "Stepdefinations",monochrome = true,tags = "@suma",
        plugin = {"html:target/cucumber.html","json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests
{

}
