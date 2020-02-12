package br.com.rsinet.hub_BDD.PageFactory;


import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.rsinet.hub_BDD.Excel.MassaDeDadosNovaConta;
import br.com.rsinet.hub_BDD.Utils.Rolagem;

public class Criar_Conta {
	private WebDriver driver;
	private WebDriverWait wait;
	private MassaDeDadosNovaConta celula;
	private Rolagem util;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;	

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement NovaConta;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement userName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
	private WebElement checkuserName;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Confirmasenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement PrimeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement UltimoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Fone;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Estado;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private WebElement Pais;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement Endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement Cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement Cep;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	private WebElement Register;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement usuarioLogado;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxRecieveOffers")
	private WebElement termos;

	public Criar_Conta(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		wait = new WebDriverWait(this.driver, 10);
		celula = new MassaDeDadosNovaConta();
		util = new Rolagem(driver);
	}

	public void NovaConta() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(NovaConta));
		NovaConta.click();
	}

	public void Usuario() throws Exception {
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.click();
		userName.sendKeys(celula.Usuario());

	}

	public void Email() throws Exception {
		email.click();
		email.sendKeys(celula.Email());
	}

	public void Senha() throws Exception {
		senha.click();
		senha.sendKeys(celula.Senha());
	}

	public void ConfirmarSenha() throws Exception {
		Confirmasenha.click();
		Confirmasenha.sendKeys(celula.ConfirmarSenha());
	}

	public void PrimeiroNome() throws Exception {
		PrimeiroNome.click();
		PrimeiroNome.sendKeys(celula.PrimeiroNome());
	}

	public void UltimoNome() throws Exception {
		UltimoNome.click();
		UltimoNome.sendKeys(celula.UltimoNome());
	}
	public void descer() {
		util.procuraTexto("REGISTER");
	}

	public void fone() throws Exception {
		Fone.click();
		Fone.sendKeys(celula.Telefone());
	}

	public void Estado() throws Exception {
		Estado.click();
		Estado.sendKeys(celula.Estado());
	}

	public void Pais() throws Exception {
		
		Pais.click();
		
		util.clicaTexto(celula.Pais());
	}

	public void Endereco() throws Exception {
		Endereco.click();
		Endereco.sendKeys(celula.Endereco());
	}

	public void Cidade() throws Exception {
		Cidade.click();
		Cidade.sendKeys(celula.Cidade());
	}

	public void Cep() throws Exception {
		Cep.click();
		Cep.sendKeys(celula.Cep());
	}

	public void Register() throws InterruptedException {
		Register.click();
	}
	public void termos() throws InterruptedException {
		termos.click();
	}

	public void AssertErro() {
		boolean register = driver.getPageSource().contains("REGISTER");
		assertTrue(register);
	}

}
