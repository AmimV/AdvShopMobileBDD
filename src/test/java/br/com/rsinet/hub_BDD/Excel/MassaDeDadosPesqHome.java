package br.com.rsinet.hub_BDD.Excel;

public class MassaDeDadosPesqHome {
	public String HeadPhones() throws Exception {
	ExcelUtils.setExcelFile(Diretorio.Path_TestData + Diretorio.File_TestData, "BuscaHome");
	String HeadPhones = ExcelUtils.getCellData(0, 0);
	return HeadPhones;
	}
	public String produto() throws Exception {
		ExcelUtils.setExcelFile(Diretorio.Path_TestData + Diretorio.File_TestData, "BuscaHome");
		String produto = ExcelUtils.getCellData(1, 0);
		return produto;
	}
}
