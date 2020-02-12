#language: pt
		
	Funcionalidade: Cadastrar um usuario

	Contexto:
		Dado que estou no menu
		Quando estiver na pagina de criar nova conta
		
		@CadastrarComSucesso
		Cenario: Cadastrar um usuario com sucesso
		Quando preencho o formulario de cadastro
		E clico em registrar
		Entao confirmo se foi cadastrado com sucesso
		
		@ErroAoCadastrar
		Cenario: Desmarcar a opcao de confirmar os termos de cadastro e tentar finalizar o cadastro
		Quando preencho o formulario de cadastro
		E desmarco a opcao de aceitar os termos
		Entao confirmo se e possivel realizar o cadastro