//package sep01;
//
//import java.io.*;
//
//public class ReadExample {
//
//	public static void main(String[] args) throws Exception {
//		InputStream is = new FileInputStream("./bin/sec01/test1.db");
//		
//	while(true) {
//		int data = is.read();
//		if (data == -1) {
//			break;
//		}
//		System.out.println("1byte data -> " + data);
//	}
//		
//		/*int data1 = is.read();
//		System.out.println("1byte -> " + data1);
//		int data2 = is.read();
//		System.out.println("1byte -> " + data2);
//		*/
//	
//		/*InputStream is = new FileInputStream("./bin/sec01/test2.db");
//		byte[] buffer = new byte[100];
//		
//		int readByteNum = is.read(buffer);
//		
//		for(byte b1 : buffer) {
//			System.out.println(b1); 
//		}*/
//	
//		InputStream is = new FileInputStream("./bin/sec01/test3.db");
//		byte[] buffer = new byte[5];
//		
//		// 2번째 인덱스부터 시작하여 3번째 값까지 파일에서 데이터 읽어오기
//		int readByteNum = is.read(buffer, 2, 3); // buffer[2],buffer[3],buffer[4] 까지 읽어옴
//		if (readByteNum != -1) {
//			for(byte b1 : buffer) {
//				System.out.println(b1);
//			}
//		}
//		
//		is.close();
//		} 
//
//	}
//
package sec01;


