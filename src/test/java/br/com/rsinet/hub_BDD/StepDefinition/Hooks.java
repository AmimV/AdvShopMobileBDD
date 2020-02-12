package br.com.rsinet.hub_BDD.StepDefinition;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import com.cucumber.listener.Reporter;
import br.com.rsinet.hub_BDD.Utils.Context;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	private Context contexto;
	private AndroidDriver<WebElement> driver;

	public Hooks(Context context) throws MalformedURLException {
		contexto = context;
		driver = contexto.getDriverManager().createDriver();
	}

	public static String getTime() {
		return new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(new Date());
	}

	@After
	public void fechar(Scenario scenario) throws IOException {

		String screenShotNome = scenario.getName().replaceAll(" ", "_");

		File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String destinationPath = System.getProperty("user.dir") + "/target/report/" + screenShotNome + getTime()
				+ ".png";
		try {
			FileUtils.copyFile(sourcePath, new File(destinationPath));

		} catch (IOException e) {
			System.out.println("erro ao copiar arquivo para a pasta" + e.getMessage());
		}
		Reporter.addScreenCaptureFromPath(destinationPath);
		contexto.getDriverManager().fecharDriver();
	}
}
