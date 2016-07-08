package corelesson4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo2 {
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			// 路径写死了，项目一旦移动位置，就要修改代码。
			// prop.load(new FileInputStream(
			// "D:\\javalessons\\workspace\\coreJava\\src\\corelesson4\\aa.properties"));
			// getResourceAsStream得到的是classpath路径
			// prop.load(PropertiesDemo2.class
			// .getResourceAsStream("/corelesson4/aa.properties"));
			prop.load(PropertiesDemo2.class.getClassLoader()
					.getResourceAsStream("corelesson4/aa.properties"));
			System.out.println(prop.getProperty("aa"));
			System.out.println(prop.getProperty("bb"));
			System.out.println(prop.getProperty("cc"));
			System.out.println(prop.getProperty("dd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
