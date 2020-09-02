package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager getFrmInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader grtCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;

	}

}
