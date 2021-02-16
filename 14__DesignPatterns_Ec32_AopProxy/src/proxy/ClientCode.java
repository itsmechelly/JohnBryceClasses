package proxy;

public class ClientCode {

	public static void main(String[] args) {
		
		Capitalizer cap = new CapitalizerCacheProxy();
		
		String[] codes = {"alpha", "delete", "alfa", "omega"};
		int r;
		
		for (int i = 0; i < 100; i++) {
			r = (int)(Math.random()*codes.length);
			System.out.println(cap.modify(codes[r]));
		}
	}
}
