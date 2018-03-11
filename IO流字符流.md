# IO流----字符流

 字节流出现的小问题

* 由于字节流操作中文不是特别方便，所以，java就提供了转换刘
* 字符流  = 字节流+编码表

## 编码表

由显示师姐的字符和对应的数值组成的一张表

ASCII 表  美国标准信息交换吗。最高位是符号位，7 位表示数据

ISO-8859-1  拉丁码表，用一个字节的8 位表示数据

GB2312  简体中文

GBK 简体中文的升级，有更多的符号

GB18030  GBK的取代版 

BIG-5 台湾，香港地区的繁体字编码方案

Unicode 国际标准码。融合了更多的中文蚊子符号，所有的蚊子都用两个字节表示，java用的Unicode 

UTF-8 最多用三个字节表示一个字符，即能用一个的就用一个，一个表示不了的，就用两个，实在不行的就用三个

UTF-8 不同，它定义了一个“区间规则”  这种规则可以与ASCII 编码 保持最大程度的兼容

Unicode     00000000-0000007F   的字符 单个字节表示

Unicode     00000000-000007FF   的字符 两个字节表示

Unicode     00000000-0000FFFF   的字符 3个字节表示

### OutputStreamWriter(OutputStream out) 字符流

* 	把字节流转换成字符流，
  * 创建使用默认字符编码的 OutputStreamWriter

### OutputStreamWriter(OutputStream out, String charsetName) 

*   创建使用指定字符集的 OutputStreamWriter。
*   根据指定编码把字节流转成 字符流

```java
	//创建对象
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("a.txt"));
		//你好吗
//		OutputStreamWriter osw = new OutputStreamWriter(
//				new FileOutputStream("a.txt"),"GBK");
		//因为默认写时候是UTF-8编码   ����
		//写数据
		osw.write("你好吗？");
```

### InputStreamReader(InputStream is) 用默认的编码读取数据

### nputStreamReader(InputStream is ,String charSetName) 用指定的编码读取数据

```java
		//创建对象，
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("a.txt"));	
//		InputStreamReader isr = new InputStreamReader(
//				new FileInputStream("a.txt"),"GBK");
		//浣犲ソ鍚楋紵
		//读取数据
		int ch = 0 ;
		while((ch = isr.read()) != -1){
			System.out.print((char) ch);
		}
```

OutputStreamWriter的方法

* public void write(int c)  写一个字符
* public void write(char[] cbuf) 写一个字符数组
* public void write(char[] cbuf,int off,int len) 写一个字符数组的一部分
* public void write(String str) 写一个字符串
* public void write(String str,int off,int len) 写一个字符串的一部分

与字节流不同的是，字符流写出的时候。要有  void flush 方法。原因是：

1 字符 = 2 字节 ，而文本文件存储的时候是用字节，所以，直接写出时，数据在缓冲区内，需要flush () 

### close()  与  flush()  的区别

A   close（） 关闭流对象，但是先刷新一次缓冲区，关闭之后，流对象不可以再使用

B flush（） 仅仅刷新缓冲区，刷新之后流对象可以继续使用

### 由于我们常见的操作都是使用本地默认的编码，所以不用指定编码

### 而转换流的名称有点长，所以，java就提供了其子类供我们使用

OutputStreamWriter = FileOutputstream + 编码表（默认<GBK ,UTF-8>）

InputStreamReader = FileInputStream + 编码表（默认<GBK   UTF-8>）

### 字符流称为高效读写，提供了相应的字符缓冲流

* BufferedWriter 字符缓冲输出流
* BufferedReader 字符缓冲输入流
* 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
* 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 

```java
//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//封装目的
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
				
		//读写数据
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);//本身没有换行符
			bw.newLine();//换行
			bw.flush();
		}
```

## BufferedReader 

* 		LineNumberReader
  * 		public int getLineNumber() 获取当前行号
    * 	public void setLineNumber(int lineNumber) 设置当前行号