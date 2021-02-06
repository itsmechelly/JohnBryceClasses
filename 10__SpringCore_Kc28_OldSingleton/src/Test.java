
public class Test {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				MySingleton.getInstance();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				MySingleton.getInstance();

			}
		});

		t1.start();
		t2.start();
	}
}
