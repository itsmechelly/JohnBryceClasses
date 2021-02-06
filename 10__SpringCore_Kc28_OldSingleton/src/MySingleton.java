
public class MySingleton {

	// 1
	private static MySingleton instance = null;

	// 2
	private MySingleton() {
		System.out.println("CTOR IN ACTION");
	}

	// 3
	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}
		}
		return instance;
	}
}
