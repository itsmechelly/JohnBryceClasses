package proxy;

import java.util.HashMap;
import java.util.Map;

public class CapitalizerCacheProxy implements Capitalizer {

	Map<String, String> cache = new HashMap<>();
	ConcreteCapitalizer capitlizer = new ConcreteCapitalizer();

	@Override
	public String modify(String text) {
		String value = cache.get(text);
		// if that text is already in cache, use it.
		if (value != null) {
			return value;
		}
		// if that text is not in cache - process.
		value = capitlizer.modify(text);
		System.out.println("-----------------processing text");
		// save in cache for next time.
		cache.put(text, value);
		return value;
	}

}
