package br.com.rsinet.hub_BDD.Utils;


import java.net.MalformedURLException;
import br.com.rsinet.hub_BDD.Manager.DriverManager;
import br.com.rsinet.hub_BDD.Manager.PageObjectManager;

public class Context {

	private DriverManager driverManager;
	private PageObjectManager pageObjectManager;

	public Context() throws MalformedURLException {
		driverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(driverManager.getDriver());
	}
	public DriverManager getDriverManager() {
		return driverManager;
	}
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
