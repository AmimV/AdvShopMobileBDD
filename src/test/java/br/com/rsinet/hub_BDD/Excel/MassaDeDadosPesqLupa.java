package br.com.rsinet.hub_BDD.Excel;

public class MassaDeDadosPesqLupa {

	public String PesquisaProduto01() throws Exception {
		ExcelUtils.setExcelFile(Diretorio.Path_TestData + Diretorio.File_TestData, "BuscaLupa");
		String pesqProduto01 = ExcelUtils.getCellData(0, 0);
		return pesqProduto01;
	}
	
	public String ClicaProduto01() throws Exception{
		String clickProduto01 = ExcelUtils.getCellData(1, 0	);
		return clickProduto01;
	}
	
	public String ProdutoInvalido() throws Exception {
		String produtoInvalido = ExcelUtils.getCellData(0, 2);
		return produtoInvalido;
	}
}
