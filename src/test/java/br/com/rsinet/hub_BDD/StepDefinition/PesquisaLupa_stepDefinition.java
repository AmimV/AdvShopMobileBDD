package br.com.rsinet.hub_BDD.StepDefinition;

import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.PesquisaLupa;
import br.com.rsinet.hub_BDD.Utils.Context;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaLupa_stepDefinition {
	private Context contexto;
	private HomePage hpage;
	private PesquisaLupa pesqLupa;
	
	public PesquisaLupa_stepDefinition(Context context) {
		contexto = context;
		pesqLupa = contexto.getPageObjectManager().getPesquisaLupa();
		hpage = contexto.getPageObjectManager().getHomePage();

	}
	
	@Dado("^que estou na home do app$")
	public void que_clico_na_lupa() throws Throwable {

	}

	@Quando("^pesquiso algum produto pela lupa$")
	public void pesquiso_algum_produto() throws Throwable {
		hpage.pesqProduto();
	}

	@Quando("^seleciono algum dos que apareceu$")
	public void seleciono_algum_dos_que_apareceu() throws Throwable {
		pesqLupa.escolhaProduto();
	}

	@Entao("^confirmo se o mesmo foi selecionado$")
	public void confirmo_se_o_mesmo_foi_selecionado() throws Throwable {
		pesqLupa.confirmaProduto();
	}

	@Quando("^pesquiso um produto inexistente$")
	public void pesquiso_um_produto_inexistente() throws Throwable {
		hpage.pesqProdutoInexistente();
	}

	@Entao("^confirmo se me retorna nenhum produto$")
	public void confirmo_se_me_retorna_nenhum_produto() throws Throwable {
		pesqLupa.nenhumResultado();
	}
}
