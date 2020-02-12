package br.com.rsinet.hub_BDD.StepDefinition;


import br.com.rsinet.hub_BDD.PageFactory.Criar_Conta;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.Utils.Context;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CriarConta_stepDefinition {
	private Criar_Conta cc;
	private HomePage hpage;
	private Context contexto;
	
	public CriarConta_stepDefinition(Context context) {
		contexto = context;
		cc = contexto.getPageObjectManager().getCriaConta();
		hpage = contexto.getPageObjectManager().getHomePage();
	}

	@Dado("^que estou no menu$")
	public void que_estou_no_menu() throws Throwable {
		hpage.Menu();
	}

	@Quando("^estiver na pagina de criar nova conta$")
	public void estiver_na_pagina_de_criar_nova_conta() throws Throwable {
		hpage.Login();
		cc.NovaConta();
	}

	@Quando("^preencho o formulario de cadastro$")
	public void preencho_o_formulario_de_cadastro() throws Throwable {
		cc.Usuario();
		cc.Email();
		cc.Senha();
		cc.ConfirmarSenha();
		cc.PrimeiroNome();
		cc.UltimoNome();
		cc.descer();
		cc.fone();
		cc.Pais();
		cc.Estado();
		cc.Endereco();
		cc.Cidade();
		cc.Cep();
	}

	@Quando("^clico em registrar$")
	public void clico_em_registrar() throws Throwable {
		cc.Register();
		hpage.Menu();
		
	}

	@Entao("^confirmo se foi cadastrado com sucesso$")
	public void confirmo_se_foi_cadastrado_com_sucesso() throws Throwable {
		hpage.confirmaCadastro();
	}

	@Quando("^desmarco a opcao de aceitar os termos$")
	public void desmarco_a_opcao_de_aceitar_os_termos() throws Throwable {
		cc.termos();
	}

	@Entao("^confirmo se e possivel realizar o cadastro$")
	public void confirmo_se_e_possivel_realizar_o_cadastro() throws Throwable {
		cc.AssertErro();
	}
	
	
}
