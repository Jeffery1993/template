package tools;

import java.io.File;
import java.io.IOException;

import com.jeffery.fastapi.core.Generator;
import com.jeffery.fastapi.core.sql.SQLResource;

public class Test {

	public static void main(String[] args) throws IOException {
		String path = "sql/car.sql";
		Generator generator = new Generator(new SQLResource(new File(path)));
		generator.start();
	}

}
