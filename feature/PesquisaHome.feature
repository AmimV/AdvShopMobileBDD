#language: pt

	Funcionalidade: Pesquisar produto atraves da home page

	Contexto:
		Dado que escolho uma categoria de produto
		
		@PesquisarProdutoComSucessoHome
			Cenario: Pesquisar um produto com sucesso atraves da home page do aplicativo
			Quando escolher um produto
			Entao confirmar se o produto foi selecionado
			
		@PesquisarProdutoErradoHome
			Cenario: Pesquisar um produto com sucesso porem colocar especificacoes que nao existe para nenhum
			Quando escolher as especificacoes
			Entao confirmar que nao apareca nenhum resultado