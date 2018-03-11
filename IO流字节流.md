

# IO流-----字节流

IO流用来处理设备之间的数据传输

​	上传文件和下载文件

java对数据的操作是通过流的方式

java用于操作流的对象都在IO包中

OutputStream   抽象类

FileOutputStream

## 注意： 每一种基类都是以父类名作为后缀名

* 	XxxOutputStream
  * XxxInputStream
  * XxxReader
  * XxxWriter

FileOutputStream 用于写入诸如图像数据之类的原始字节的流。

要写入字符流，请考虑使用 FileWriter。

## FileOutputStream的构造方法

* FileOutputStream(File file) 
* FileOutputStream(String name)

## 字节输出流操作步骤

- A创建字节输出流对象
- B写数据
- C释放资源



```java
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节流输出对象
		//FileOutputStream(File file) 
	/*File file = new File("file.txt");
	FileOutputStream fos = new FileOutputStream(file);
*/	
		FileOutputStream fos = new FileOutputStream("fos.txt");
		
		/*
		 * 创建字节输出流对象做了几件事情
		 * 	A 调用系统功能区创建文件
		 * 	B 创建fos 对象
		 *  C 把fos 对象指向这个文件
		 * 
		 * */
		//写数据
		fos.write("hello.IO".getBytes());
		
		//释放资源
		//关闭此文件输出流并释放与此流有关的所有系统资源
		fos.close();
	
		//java.io.IOException: Stream Closed
		fos.write("java".getBytes());
	}

}
```

	 * String 类的close（） 的必要性
		 * A  让流对象编程垃圾，这样就能被垃圾回收站回收
		 * B 通知系统去释放该文件相关的资源
## 字节流写数据的方式

* public void write(int b)     写一个字节
* public void write(byte[] b)     写一个字节数组
* public void write(byte[] b.int off.int len)     写一个字节数组的一部分

## 字节流写数据常见问题

### 创建字节输出流到底做了那些事

### 数据写成功后，为什么要close（）

### 如何实现数据的换行

​	写入换行符号

notepaid++  eclipce  打开可以看到换行

			//Windows 自带的记事本打开并没有换行
			/*
			 * 因为不同的系统针对不同的换行符号识别不一样
			 * windows     \r\n
			 * linux;     \n
			 * mac   \r
			 * 而一些高级记事本软件，是可以识别任意换行符号的。
### 如何实现数据的追加写入

public FileOutputStream(String name, boolean append)

* 创建一个像具有指定name的文件中写入数据的输出文件流
* 如果第二个参数为true 则将字节写入文件末尾处，而不是写入文件开始处

## 字节流写数据加入异常处理

```java
package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月7日 下午3:27:31 
* 类说明 
* 加入异常处理的字节输出流操作
*/
public class FileOutputStreamDemo4 {
	public static void main(String[] args) {
//		//分开做异常处理，可读性查
//		
//		//创建字节输出流对象
//		FileOutputStream fos=null;
//		//赋值初始化，消除异常
//		try {
//			//此处可能隐藏异常
//			fos = new FileOutputStream("fos3.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			fos.write("java".getBytes());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			fos.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//一起做异常处理
//
//		try{
//		FileOutputStream fos = new FileOutputStream("fos3.txt");
//		
//		fos.write("java".getBytes());
//		
//		fos.close();
//		} catch (FileNotFoundException e){
//			e.printStackTrace();
//		
//		} catch (IOException e){
//			e.printStackTrace();
//			
//		}
		
		//改进
		//为了在finally里面都能够看到fos 对象，就必须定义在外面，为了访问不出问题，还必须出示话
		FileOutputStream fos = null;
		try{
			//fos = new FileOutputStream("Z:\\fos4.txt");
			fos = new FileOutputStream("fos4.txt");
			fos.write("java".getBytes());
			
			} catch (FileNotFoundException e){
				e.printStackTrace();
			
			} catch (IOException e){
				e.printStackTrace();
				
			}finally{
				
				//如果fos不是null，才close 
				//为了保证close一定会执行
				if(fos != null){
					try {
						fos.close();
					} catch (IOException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		
	}

}

```

## 字节输入流操作步骤

* 	A 创建字节输入流对象
  * B 调用read（） 方法读取数据，并输出在控制台
  * C 释放资源
  * 构造方法
  * FileInputStream(String name)
  * ​
  * 读取数据的方式
  * A int read():一次读取一个字节
  * B int read(byte[] b)：一次读取一个字节数组 

## 复制文本文件

数据源：从哪里来    

a.txt--读取数据---FileInputStream

目的地: 到哪里去  

b.txt--写数据---FileOutputStream

## 复制中文没有任何问题，原因：

首先，获取一个字节数据就把该字节数据转换成字符数据，输出在控制台，中文部分出现了；乱码
这次，通过IO 流 读取数据，写到文本文件，读取一个字节就写入一个字节，你没有做任何的转换，
它自己做转换

### 计算机是如何识别什么时候该把两个字节转换为一个中文呢

在计算机中中文的存储分两个字节:
* 第一个字节肯定是负数
* 第二个字节常见的是负数，可能是正数，但是没有影响

### 一次读取一个字节数组

* ​
* 数组的长度一般是1024 或1024 的整数倍
* int read(byte[] b)
* 返回值 int 是实际读取的字节的个数

## 字节缓冲区

字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，这是加入了数组这样的缓冲区效果，java本身再设计的时候，也考虑到了这样的设计思想，（装饰设计模式后面讲解），所以提供了字节缓冲区

字节缓冲区输出流

BufferedOutputStream(OutputStream out)

字节缓冲输入流

BufferedInputStream(InputStream in)

构造方法可以指定缓冲区大小，但是，一般不用，因为默认缓冲区大小就足够了

构造方法不传递一个具体的文件或文件路径，而是传递一个OUtputStream对象？

* 原因：字节缓冲区流仅仅提供缓冲区，为高效而设计的，但是，
* 真正的读写操作还是得考基本的流对象实现

注意：

* 	虽然我们有两种方式可以读取，但是，这两种方式针对同一个对象在一个代码中只能使用一个、

字节流四种方式复制文件：

* 基本字节流---一次读写一个字节
* 基本字节流---一次读写一个字节数组
* 高效字节流--一次读写一个字节
* 高效字节流---一次读写一个字节数组