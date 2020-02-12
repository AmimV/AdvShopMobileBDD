package br.com.rsinet.hub_BDD.PageFactory;


import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosPesqLupa;
import br.com.rsinet.hub_BDD.Utils.Rolagem;


public class PesquisaLupa {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosPesqLupa celula;
	private Rolagem util;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private WebElement addToCart;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/RelativeLayoutProductControl")
	private WebElement headSetLogiTech;
	
	public PesquisaLupa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 10);
		celula = new MassaDeDadosPesqLupa();
		util = new Rolagem(driver);
	}
	
	public void escolhaProduto() throws Exception {
		util.clicaTexto(celula.ClicaProduto01());
	}

	public void confirmaProduto() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		boolean carrinho = driver.getPageSource().contains("ADD TO CART");
		assertTrue(carrinho);
	}

	public void nenhumResultado() throws InterruptedException {
		boolean nenhumResults = driver.getPageSource().contains("No results");
		driver.manage().timeouts().equals(nenhumResults);
		Assert.assertTrue(nenhumResults);
	}
}
