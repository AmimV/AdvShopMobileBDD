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
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosPesqHome;
import br.com.rsinet.hub_BDD.Utils.Rolagem;

public class PesquisaHome {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosPesqHome celula;
	private Rolagem util;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewFilter")
	private WebElement filtro;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
	private WebElement compativel;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
	private WebElement opcao1Compativel;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
	private WebElement conector;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout")
	private WebElement bluetooth;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[3]")
	private WebElement aplicar;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/RelativeLayoutProductControl")
	private WebElement hpElite;
	
	public PesquisaHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 10);
		celula = new MassaDeDadosPesqHome();
		util = new Rolagem(driver);
	}

	public void escolhaProduto() throws Exception {
		Thread.sleep(1000);
		util.clicaTexto(celula.produto());
	}

	public void confirmaProduto() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart));
		boolean carrinho = driver.getPageSource().contains("ADD TO CART");
		Assert.assertTrue(carrinho);
		
	}

	public void filtro() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(hpElite));
		filtro.click();
	}

	public void especificacoes() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(compativel));
		compativel.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		opcao1Compativel.click();
		compativel.click();
		conector.click();
		bluetooth.click();
		conector.click();
		aplicar.click();
	}
	public void nenhumResultado() {
		boolean nenhumResults = driver.getPageSource().contains("No results");
		assertTrue(nenhumResults);
	}
}
