package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("fos.txt");
	
		fos.write("hello.IO".getBytes());
		
		
		fos.close();
		
		fos.write("java".getBytes());
	}

}
