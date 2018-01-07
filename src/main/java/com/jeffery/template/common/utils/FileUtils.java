package com.jeffery.template.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtils {

	private static final Logger logger = LoggerFactory.getLogger(FileUtils.class);

	private static final String EMPTY_STRING = "";

	public static String readFileAsString(String fileName) {
		return readFileAsString(fileName, true);
	}

	public static String readFileAsString(String fileName, boolean lineSeparated) {
		StringBuffer content = new StringBuffer();
		try {
			InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line);
				if (lineSeparated) {
					content.append(System.lineSeparator());
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			return EMPTY_STRING;
		}
		return content.toString();
	}

	public static boolean writeStringToFile(String fileName, String content) {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(content);
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
			return false;
		}
		return true;
	}

}
