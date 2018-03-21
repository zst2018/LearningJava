package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月10日 下午2:04:41 
* 类说明 
* 内存流操作
* 用于处理临时处理信息的，程序结束数据就从内存中消失
* 字节数组
* 	ByteArrayInputStream
* 	ByteArrayOutputStream
* 字符数组
* 	CharArrayReader	
* 	CharArrayWriter
* 字符串
* 	StringReader
* 	StringWriter
* 
* ByteArrayInputStream
* public class ByteArrayInputStreamextends InputStream
* 包含一个内部缓冲区，该缓冲区包含从流中读取的字节。
* 内部计数器跟踪 read 方法要提供的下一个字节。 
* 关闭 ByteArrayInputStream 无效。
* 此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。
* 
* public class ByteArrayOutputStreamextends OutputStream
* 此类实现了一个输出流，其中的数据被写入一个 byte 数组。
* 缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString() 获取数据。 
* 关闭 ByteArrayOutputStream 无效。
* 此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。 

 
*/
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		//写数据
		//ByteArrayOutputStream 
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		for(int x = 0; x<10;x++){
			baos.write(("hello"+x).getBytes() );
		}
		
		//public byte[] toByteArray()
		byte[] bys = baos.toByteArray();
		//将写的数据转成一个字节数组
		
		
		//释放资源
		//通过查看原码。这里什么都没做，所以不需要close
		//baos.close();
		
		
		//读数据
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		
		int by = 0;
		while((by = bais.read()) != -1){
			System.out.print((char)by);
		}
		
		//bais.close();
	}
	

}












