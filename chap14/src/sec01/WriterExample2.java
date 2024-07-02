package sec01;

import java.io.*;

public class WriterExample2 {
	public static void main(String[] args) throws Exception {
		// 문자기반의 출력 스트링 예제
		Writer writer = new FileWriter("./bin/sec01/test1.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		
		System.out.println("프로그램 종료");

	}

}
