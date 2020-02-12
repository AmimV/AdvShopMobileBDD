package br.com.rsinet.hub_BDD.PageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosNovaConta;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosPesqHome;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosPesqLupa;
import br.com.rsinet.hub_BDD.Utils.Rolagem;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosNovaConta celulaAcc;
	private MassaDeDadosPesqLupa celulaLupa;
	private MassaDeDadosPesqHome celulaHome;

	private Rolagem util;


	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement usuarioLogado;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement lupa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement pesquisa;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 10);
		celulaAcc = new MassaDeDadosNovaConta();
		celulaLupa = new MassaDeDadosPesqLupa();
		celulaHome= new MassaDeDadosPesqHome();
		util = new Rolagem(driver);

	}

	public void Menu() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(menu));
		menu.click();
	}

	public void Login() throws Exception {
		login.click();
	}

	public void confirmaCadastro() throws Exception {
		Assert.assertEquals(usuarioLogado.getText(), celulaAcc.Usuario());
	}

	public void pesqProduto() throws Exception {
		lupa.click();
		lupa.sendKeys(celulaLupa.PesquisaProduto01());
		pesquisa.click();
	}

	public void pesqProdutoInexistente() throws InterruptedException {
		lupa.click();
		lupa.sendKeys("Cachorro");
		pesquisa.click();
	}
	public void categoria() throws Exception {
		util.clicaTexto(celulaHome.HeadPhones());
	}
}
