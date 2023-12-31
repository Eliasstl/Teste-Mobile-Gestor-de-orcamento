package Appium.Core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTestes {
	@Rule
	public TestName testNome = new TestName();

	@AfterClass
	public static void finalizarClasse() {
		DriverFactory.getDriver().resetApp();
	}

	@After
	public void tearDown() {
		gerarScreenShot();
		DriverFactory.killDriver();

	}

	public void gerarScreenShot() {

		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem, new File("target/screenshots/" + testNome.getMethodName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
