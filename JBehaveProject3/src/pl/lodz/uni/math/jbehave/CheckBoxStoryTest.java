package pl.lodz.uni.math.jbehave;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pl.lodz.uni.math.seleniumeasy.CheckBox;

public class CheckBoxStoryTest extends JUnitStory {
	
	@Override
	public Configuration configuration()
	{
		return new MostUsefulConfiguration();
	}
	
	@Override
	public InjectableStepsFactory stepsFactory()
	{
		return new InstanceStepsFactory(configuration(), new CheckBoxSteps());
	}
	
	
}
