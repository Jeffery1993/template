package tools;

import java.io.File;
import java.io.IOException;

import com.huawei.fastapi.Appender;
import com.huawei.fastapi.Generator;

public class Test {

	public static void main(String[] args) throws IOException {
		addFields();
	}

	public static void createFiles() throws IOException {
		Generator generator = new Generator(new File("sql/car.sql"));
		generator.setGenerateApi(true);
		generator.createFiles(true);
	}

	public static void addFields() throws IOException {
		Appender appender = new Appender("car_info");
		appender.addField("marks", "String");
		appender.appendFiles();
	}

}
