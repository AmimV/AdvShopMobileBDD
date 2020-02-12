package br.com.rsinet.hub_BDD.Utils;

import java.util.Random;

public class GeradorDeUsuario {
	public String gerador(int quantidadeLetra) {
		Random quantidadedeletras = new Random();
		int index;

		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVYWXZabcdefghijklmnopqrstuvxwyz0123456789";
		String palavraRandom = "";

		for (int i = 0; i <= quantidadeLetra - 1; i++) {
			index = quantidadedeletras.nextInt(caracteres.length());
			palavraRandom += caracteres.substring(index, index + 1);
		}
		return palavraRandom;
	}

	public String username() {
		String user = gerador(6);
		return user;
	}

}
