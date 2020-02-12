package br.com.rsinet.hub_BDD.Manager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_BDD.PageFactory.Criar_Conta;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.PesquisaHome;
import br.com.rsinet.hub_BDD.PageFactory.PesquisaLupa;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {
	
	private AndroidDriver<WebElement> driver;
	private Criar_Conta cConta;
	private PesquisaHome pesqHome;
	private PesquisaLupa pesqLupa;
	private HomePage hpage;
	private WebDriverWait wait;
	
	public PageObjectManager(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	public Criar_Conta getCriaConta() {
		return (cConta == null) ? cConta = new Criar_Conta(driver) : cConta;
	}
	public PesquisaHome getPesquisaHome() {
		return (pesqHome == null) ? pesqHome = new PesquisaHome(driver) : pesqHome;
	}
	public PesquisaLupa getPesquisaLupa() {
		return (pesqLupa == null) ? pesqLupa = new PesquisaLupa(driver) : pesqLupa;
	}

	public HomePage getHomePage() {
		return (hpage == null) ? hpage = new HomePage(driver) : hpage;
	}
	public WebDriverWait getWait() {
		return (wait == null) ? wait = new WebDriverWait(driver, 10) : wait;
	}
	
}
