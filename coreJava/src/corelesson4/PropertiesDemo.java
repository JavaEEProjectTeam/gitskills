package corelesson4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(
					"D:\\javalessons\\workspace\\coreJava\\src\\corelesson4\\aa.properties"));
		  /*  for(Object object : prop.keySet()){
		    	String key = (String)object;
		    	System.out.println(key+"="+prop.get(key));
		    }*/
			//资源文件中的内容是可以看见的  key就是已知。
			System.out.println(prop.getProperty("aa"));
			System.out.println(prop.getProperty("bb"));
			System.out.println(prop.getProperty("cc"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



