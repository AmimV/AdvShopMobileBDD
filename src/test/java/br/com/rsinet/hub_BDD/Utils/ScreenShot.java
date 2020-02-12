//package br.com.rsinet.hub_BDD.Utils;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import com.cucumber.listener.Reporter;
//import com.google.common.io.Files;
//
//import cucumber.api.Scenario;
//
//public class ScreenShot {
//	
//	public static String getTime() {
//		return new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(new Date());
//	}
//	
//	public void gerarScreenShot(WebDriver driver, Scenario scenario) {
//		String screenShotNome = scenario.getName().replaceAll(" ", "_");
//	
//		try {
//			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			
//			File destinationPath = new File(System.getProperty("user.dir") + "/report/"
//			+ screenShotNome + getTime() + ".png");
//			
//			Files.copy(sourcePath, destinationPath);
//		
//			Reporter.addScreenCaptureFromPath(destinationPath.toString());
//		} catch(IOException e) {
//			System.out.println("erro ao copiar arquivo para a pasta" + e.getMessage());
//		}
//	}
//}
