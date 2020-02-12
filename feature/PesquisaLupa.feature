#language: pt

	Funcionalidade: Pesquisar produto pela lupa
		
		Contexto:
			Dado que estou na home do app
			
			@PesquisarProdutoComSucessoLupa
				Cenario: Pesquisar um produto utilizando a lupa e selecionar o mesmo
				Quando pesquiso algum produto pela lupa
				E seleciono algum dos que apareceu
				Entao confirmo se o mesmo foi selecionado
				
			@FalharAoPesquisarProdutoLupa
				Cenario: Pesquisar algum produto que nao existe na loja
				Quando pesquiso um produto inexistente
				Entao confirmo se me retorna nenhum produto