package sec01;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, Sring>();
		
		hashMap.put(new key(1), "홍길동");
		
		String value = hashMap.get(new key(1));
		System.out.println(value);

	}

}
