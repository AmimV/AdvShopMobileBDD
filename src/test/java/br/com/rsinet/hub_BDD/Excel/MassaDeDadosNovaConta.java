package br.com.rsinet.hub_BDD.Excel;

public class MassaDeDadosNovaConta {

	
	
	public String Usuario() throws Exception {
		ExcelUtils.setExcelFile(Diretorio.Path_TestData + Diretorio.File_TestData, "Contas");
		String nome = ExcelUtils.getCellData(1, 0);
		return nome;
	}

	public String Email() throws Exception {
		String email = ExcelUtils.getCellData(1, 1);
		return email;
	}

	public String Senha() throws Exception {
		String senha = ExcelUtils.getCellData(1, 2);
		return senha;
	}

	public String ConfirmarSenha() throws Exception {
		String cSenha = ExcelUtils.getCellData(1, 3);
		return cSenha;
	}

	public String PrimeiroNome() throws Exception {
		String pNome = ExcelUtils.getCellData(1, 4);
		return pNome;
	}

	public String UltimoNome() throws Exception {
		String uNome = ExcelUtils.getCellData(1, 5);
		return uNome;
	}

	public String Telefone() throws Exception {
		String telefone = ExcelUtils.getCellData(1, 6);
		return telefone;
	}

	public String Pais() throws Exception {
		String pais = ExcelUtils.getCellData(1, 7);
		return pais;
	}

	public String Cidade() throws Exception {
		String cidade = ExcelUtils.getCellData(1, 8);
		return cidade;
	}

	public String Endereco() throws Exception {
		String endereco = ExcelUtils.getCellData(1, 9);
		return endereco;
	}

	public String Estado() throws Exception {
		String estado = ExcelUtils.getCellData(1, 10);
		return estado;
	}

	public String Cep() throws Exception {
		String cep = ExcelUtils.getCellData(1, 11);
		return cep;
	}
}
