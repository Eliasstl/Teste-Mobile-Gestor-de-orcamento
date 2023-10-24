package Appium.Core;

import static Appium.Core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	public void escreverXpath(String xpath, String texto) {
		getDriver().findElementByXPath(xpath).sendKeys(texto);
	}

	public String textoXpath(String xpath) {
		return getDriver().findElementByXPath(xpath).getText();

	}

	public void cliqueId(String id) {
		getDriver().findElementByAccessibilityId(id).click();
	}

	public void cliqueXpath(String xpath) {
		getDriver().findElementByXPath(xpath).click();
	}

	public boolean ElementoExiste(String xpath) {
		try {
			getDriver().findElement(By.xpath(xpath));
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}
