package eddy;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("����Ѹ-��õ��.mp3");//������ȡ���ļ�
		FileOutputStream fos = new FileOutputStream("��õ��_copy.mp3");
		byte b[] = new byte[1024*10];
		int len = -1; //��¼�ַ����鳤�� 
		while((len=fis.read(b))!=-1){
			fos.write(b, 0, len);
		}
		fos.close();
		fis.close();
		System.out.println("copy���");
	}

}
