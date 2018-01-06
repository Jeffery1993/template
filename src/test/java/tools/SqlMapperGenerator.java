package tools;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tools.SqlScriptResolver.Table;

public class SqlMapperGenerator {

	private static final Logger logger = LoggerFactory.getLogger(SqlMapperGenerator.class);

	protected static boolean createFiles(String fileName) {
		List<Table> list = SqlScriptResolver.getResults(fileName);
		boolean flag = true;
		for (Table table : list) {
			if (!createFiles(table)) {
				flag = false;
			}
		}
		return flag;
	}

	protected static boolean createFiles(Table table) {
		Map<String, String> placeholders = PlaceholderHandler.getPlaceholders(table);
		// TODO

		return true;
	}

	public static void main(String[] args) {
		createFiles(System.getProperty("user.dir") + "\\sql\\car.sql");
	}

}
