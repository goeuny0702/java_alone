package sec02;

import java.io.*;
/**
 * * desc: buffered한 거와 안 한거의 성능 차이 비교
 */

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// buffered를 사용하지 않고 copy
		// copy할 파일의 path 가져오기
		String originalFilePath1
			= NonBufferVsBufferExample.class.getResource("dog1.jpg").getPath();
		System.out.println("originalFilePath1 -> " + originalFilePath1);
		
		// 복사 대상의 파일의 path세팅
		String targetFilePath1 = "./bin/sec01/dog1-copy.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		long nonBufferElaspTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을때 :\t" + nonBufferElaspTime + "ns");
		
		String originalFilePath2
			= NonBufferVsBufferExample.class.getResource("dog2.jpg").getPath();
		System.out.println("originalFilePath2 -> " + originalFilePath2);
	
		// 복사 대상의 파일과 path 세팅
		String targetFilePath2 = "./bin/sec01/dog1-copy.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		// 보조 스트링 추가
		BufferedInputStram bis = new BufferedInputStram(fis2);
		BufferedOutputStram bos = new BufferedOutputStram(fos2);
		
		long nonBufferElaspTime2 = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때:\t" + nonBufferElaspTime2 + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	
	
	
		

	}
	/**
	 * desc: 복사 함수
	 * @param is
	 * @param out
	 * @return 걸린 시간(단위는 나노)
	 * @throws Exception
	 */
	public static long copy(InputStream is, OutputStream out) throws Exception {
		int data = -1;
		
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if (data == -1) break;
			out.write(data);
		}
		out.flush();
		
		return System.nanoTime() - start;
		
	}

}
