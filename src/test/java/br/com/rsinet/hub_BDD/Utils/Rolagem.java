package br.com.rsinet.hub_BDD.Utils;

import org.openqa.selenium.WebDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;


public class Rolagem {
	private WebDriver driver;

	public Rolagem(WebDriver driver) {
		this.driver = driver;
	}
	public void clicaTexto(String celula) {
		((FindsByAndroidUIAutomator<?>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ celula + "\").instance(0))")
				.click();

	}
	public void procuraTexto(String celula) {
		((FindsByAndroidUIAutomator<?>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ celula + "\").instance(0))");

	}
	
}
