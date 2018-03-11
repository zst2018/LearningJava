# IO流---其他流

### 基本数据类型的读写

数据输入流 
* DataInputSream（InputStream in）

数据输出流

* DataOutputStream(OutputStream out)

打印流

字节流打印流

PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式

字符流打印流

PrintWriter 向文本输出流打印对象的格式化表示形式

打印流的特点

* 	A 只有写数据的没有读取数据的，只能操作目的地，不能操作数据源
  * B 可以操作任意类型的数据
  * C 如果启动了自动刷新，就能够自动刷新
  * D 该流是可以直接操作文本文件的，

可以直接操作文本文件的如下

* 	FileInputStream
  * FileOutputStream 
  * FileReader
  * FileWriter

基本流：能够直接读文件的流

高级流：在基本流的基础上提供了一些其他的功能

可以操作任意类型

​	print println 

* 启动自动刷新，

  PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true)
* 而且要调用println() 的方法才可以,这时候不仅实现了刷新，而且自动换行

  ​				bw.write()

  println  等价于       bw.newLIne()

  ​				bw.flush();

内存流操作

用于处理临时处理信息的，程序结束数据就从内存中消失

字节数组

​	ByteArrayInputStream

​	ByteArrayOutputStream

字符数组

​	CharArrayReader	

​	CharArrayWriter

字符串

​	StringReader

​	StringWriter

ByteArrayInputStream

public class ByteArrayInputStreamextends InputStream

​	包含一个内部缓冲区，该缓冲区包含从流中读取的字节。

​	内部计数器跟踪 read 方法要提供的下一个字节。 

​	关闭 ByteArrayInputStream 无效。

​	此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。

public class ByteArrayOutputStreamextends OutputStream

​	此类实现了一个输出流，其中的数据被写入一个 byte 数组。

​	缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString() 获取数据。 

​	关闭 ByteArrayOutputStream 无效。

​	此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOExcepti	

标准输入输出流

System类中的两个成员变量

​       public static final InputStream in  “标准”输入流

​	public static final PrintStream out  “标准”输出流

​		InputStrem    is = system.in

​		Printstream   ps = System.out

### 类RandomAccessFile

支持对随机访问文件的读取和写入

RandomAccessFile 类不属于流，是Object类的子类，

但它融合了InputStream和OutputStream的功能

public RandomAccessFile(String name,String name)

第一个参数是文件的路径，第二个参数是操作文件的模式。模式有四种，最常用的是“rw”

这种模式，表示我既可以写数据也可以读数据

## 合并流

## 类 SequenceInputStream

`SequenceInputStream` 表示其他输入流的逻辑串联。它从输入流的有序集合开始，并从第一个输入流开始读取，直到到达文件末尾，接着从第二个输入流读取，依次类推，直到到达包含的最后一个输入流的文件末尾为止。

| SequenceInputStream (Enumeration<? extends InputStream> e)`           通过记住参数来初始化新创建的 `SequenceInputStream`，该参数必须是生成运行时类型为 `InputStream` 对象的 `Enumeration` 型参数。 |
| ---------------------------------------- |
| SequenceInputStream(InputStream s1, InputStream s2)`           通过记住这两个参数来初始化新创建的 `SequenceInputStream`（将按顺序读取这两个参数，先读取 `s1`，然后读取 `s2`），以提供从此 `SequenceInputStream` 读取的字节。 |

### 序列化流：将对象按照流一样的方式，存入文本文件或者在网络中传输。对象---流

* ObjectOutputStream
* 反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象，流数据---对象
* ObjectInputStream

在实际开发中，可能还需要使用以前写过的数据，不能重新写入，解决方发我：

* 因为以上问题出现的原因是ID值不匹配
* 每次修改java文件的内容的时候，class文件的ID值都会发生改变，而读取文件的时候，
* 会和class文件中的ID值进行匹配，所以就会出现问题
* 如果可以让这个ID值在java文件中是一个固定值，修改文件的时候，ID不会发生改变，这样问题就可以解决

ID值如何表示？

点击黄色警告线即可

add generated serialversion id 

需要注意的是。

看到类实现了序列化接口的时候，要想解决黄色警告线问题，就可以自动产生一个序列化ID值

而且产生这个值之后，我们对类进行任何改动，它读取以前的数据是没有问题的

注意:

一个类中可能有很多个成员变量，有些不想进行序列化，解决办法

使用transient关键字声明不需要序列化的成员变量