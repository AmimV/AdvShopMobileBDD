package br.com.rsinet.hub_BDD.PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosPesqHome;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosPesqLupa;
import br.com.rsinet.hub_BDD.Utils.Rolagem;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;
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
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCategory")
	private WebElement waitHome;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 10);
		celulaLupa = new MassaDeDadosPesqLupa();
		celulaHome= new MassaDeDadosPesqHome();
		util = new Rolagem(driver);

	}

	public void Menu() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(waitHome));
		menu.click();
	}

	public void Login() throws Exception {
		login.click();
	}

	public void pesqProduto() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(waitHome));
		pesquisa.click();
		lupa.sendKeys(celulaLupa.PesquisaProduto01());
		pesquisa.click();
	}

	public void pesqProdutoInexistente() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(waitHome));
		lupa.click();
		lupa.sendKeys("Cachorro");
		pesquisa.click();
	}
	public void categoria() throws Exception {
		util.clicaTexto(celulaHome.HeadPhones());
	}
}
