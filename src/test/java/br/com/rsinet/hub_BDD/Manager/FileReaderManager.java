package br.com.rsinet.hub_BDD.Manager;

import br.com.rsinet.hub_BDD.Utils.Config;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static Config configFileReader;
	
	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public Config getConfigReader() {
		return (configFileReader == null) ? new Config() : configFileReader;
	}


}
