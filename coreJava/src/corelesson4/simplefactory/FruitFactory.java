package corelesson4.simplefactory;

import java.util.Properties;

public class FruitFactory {
	private static Properties prop = new Properties();
	static {
		try {
			prop.load(FruitFactory.class
					.getResourceAsStream("/corelesson4/simplefactory/fruit.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Fruit getInstance(String name) {
		if ("apple".equalsIgnoreCase(name))
			return new Apple();
		if ("grape".equalsIgnoreCase(name))
			return new Grape();
		return null;
	}

	public static Fruit getInstance() {
		try {
			return (Fruit)Class.forName(prop.getProperty("fruit")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
}
