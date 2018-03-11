# IO流-------file（IO包）

File： 文件和目录（文件夹）路径名的抽象表示形式

构造方法

* 	File(String pathname)：               根据一个路径得到File对象
  * File(String parent, String child)： 根据一个目录和一个子文件/目录 得到一个File对象
  * File(File parent, String child)  ：   根据一个父File对象和一个子文件/目录得到File对象

创建功能

- public boolean mkdir()   创建文件夹，如果存在这样的文件夹，就不创建了。返回false
- public boolean mkdirs()  创建文件夹，如果父文件夹不存在，会帮你创建出来
- public boolean createNewFile() 创建文件，如果存在这样的文件，就不创建了。返回false



 删除功能

​	public boolean delete()  删除文件，文件夹

注意：

- 如果创建文件或者目录没有写盘符路径，则默认在项目路径下
- java中的删除不走回收站
- 要删除一个文件夹，文件夹内不能包含文件或其他的文件夹

重命名功能

​	public Boolean renameTo(File dest);

说明：

* 如果路径名相同，就是改名
* 如果路径名不同，就是剪切+改名

 判断功能

* 	public boolean isDirectory() 判断是否是目录
  * public boolean isFile()判断是否是文件
  * public boolean exists() 判断是否存在
  * public boolean canRead() 判断是否可读
  * public boolean canWrite() 判断是否可写
  * public boolean isHidden() 判断是否隐藏

获取功能

*	public String getAbsolutePath()  获取绝对路径
  *public String getPath()  获取相对路径
  *public String getName()  获取名称
  *public long length()    获取长度，字节数
  *public long lastModified()   获取上次（最后一次的）修改时间，返回的是毫秒值

高级获取功能

*   public String[] list()  获取指定目录下的所有文件或者文件夹的名称数组

  ​	返回字符串数组，该字符串是指定此抽象路径名表示的目录中的文件和目录

*   public File[] listFiles() 获取指定目录下的所有文件或者文件夹的File数组

    ​	返回的是File 对象，而对象可以拿名称，相对路径绝对路径  最大值等


接口：文件名称过滤器

* 	public String[] list(FilenameFileter filter)
* 	public File[] listFiles(FilenameFilter filter)






















