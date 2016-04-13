package eddy;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("陈奕迅-白玫瑰.mp3");//创建读取的文件
		FileOutputStream fos = new FileOutputStream("白玫瑰_copy.mp3");
		byte b[] = new byte[1024*10];
		int len = -1; //记录字符数组长度 
		while((len=fis.read(b))!=-1){
			fos.write(b, 0, len);
		}
		fos.close();
		fis.close();
		System.out.println("copy完毕");
	}

}
