package tools;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import tools.SqlScriptResolver.Table;

public class PlaceholderHandler {

	private static final Logger logger = LoggerFactory.getLogger(PlaceholderHandler.class);

	private static final String MATCH_PLACEHOLDER = "\\$\\{(.*?)\\}";

	public static String rendering(String str, Map<String, String> placeholders) {
		Pattern p = Pattern.compile(MATCH_PLACEHOLDER);
		Matcher m = p.matcher(str);
		StringBuffer buffer = new StringBuffer();
		while (m.find()) {
			String placeholder = placeholders.get(m.group(1));
			if (StringUtils.isEmpty(placeholder)) {
				logger.error("placeholder is empty for " + m.group(1));
				continue;
			}
			m.appendReplacement(buffer, placeholder);
		}
		m.appendTail(buffer);
		return buffer.toString();
	}

	public static Map<String, String> getPlaceholders(Table table) {
		Map<String, String> placeholders = new HashMap<String, String>();
		placeholders.put("_base_package_name", "com.jeffery.template.common.base");
		placeholders.put("_dal_package_name", "com.jeffery.template.dal");
		placeholders.put("_table_name", "");
		placeholders.put("_private_fields", "");
		placeholders.put("_public_methods", "");
		placeholders.put("_table", table.getTableName());
		placeholders.put("_column_and_property", "");
		placeholders.put("_columns", "");
		placeholders.put("_sql_where", "");
		placeholders.put("_create_columns", "");
		placeholders.put("_batch_create_columns", "");
		placeholders.put("_update_columns", "");
		return placeholders;
	}

}
