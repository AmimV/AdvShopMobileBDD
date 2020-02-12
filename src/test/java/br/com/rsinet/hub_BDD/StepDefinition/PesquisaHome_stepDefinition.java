package br.com.rsinet.hub_BDD.StepDefinition;

import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.PesquisaHome;
import br.com.rsinet.hub_BDD.Utils.Context;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaHome_stepDefinition {
	private Context contexto;
	private PesquisaHome pesqHome;
	private HomePage hpage;

	public PesquisaHome_stepDefinition(Context context) {
		contexto = context;
		pesqHome = contexto.getPageObjectManager().getPesquisaHome();
		hpage = contexto.getPageObjectManager().getHomePage();
	}
	
	@Dado("^que escolho uma categoria de produto$")
	public void que_escolho_uma_categoria_de_produto() throws Throwable {
		hpage.categoria();
	}

	@Quando("^escolher um produto$")
	public void escolher_um_produto() throws Throwable {
		pesqHome.escolhaProduto();
	}

	@Entao("^confirmar se o produto foi selecionado$")
	public void confirmar_se_o_produto_foi_selecionado() throws Throwable {
		pesqHome.confirmaProduto();
	}

	@Quando("^escolher as especificacoes$")
	public void escolher_as_especificacoes() throws Throwable {
		pesqHome.filtro();
		pesqHome.especificacoes();
	}

	@Entao("^confirmar que nao apareca nenhum resultado$")
	public void confirmar_que_nao_apareca_nenhum_resultado() throws Throwable {
		pesqHome.nenhumResultado();
	}
}
