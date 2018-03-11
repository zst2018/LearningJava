### 1. 集合

> Collection(单列集合)
>
> 	>List(有序可重复)
> 	>> ArrayList
> 	>> ​	底层数据结构是数组，查询快，增删慢
> 	>> ​	线程不安全，效率高
> 	>> Vector
> 	>> ​	底层数据结构是数组，查询快，增删慢
> 	>> ​	线程安全，效率低
> 	>> LinkedList
> 	>> ​	底层数据结构是脸白哦，查询慢，增删快
> 	>> ​	线程不安全，效率高
> 	>Set（无序，唯一）
> 	>> HashiSet 
> 	>> ​	底层数据结构是哈希表。
> 	>> ​	哈希表依赖两个方法：hashcode（）  he  equals()
> 	>> ​	执行顺序：
> 	>> ​		首先判断hashCode（）值是否相同
> 	>> ​			是：继续执行equals() ，看其返回值
> 	>> ​				是true：说明元素重复
> 	>> ​				是false ： 就直接添加到集合
> 	>> ​	最终，
> 	>> ​		自动生成hashCode()和equals()即可
> 	>> ​	LinkedHashSet
> 	>> ​		底层数据结构由链表和哈希表组成
> 	>> ​		由链表保证元素有序
> 	>> ​		有哈希表保证元素唯一
> 	>> TreeSet
> 	>> ​	底层数据结构是红黑树，是一种自平衡的二叉树。
> 	>> ​	如何保证元素的唯一性？
> 	>> ​		根据比较的返回值是否是0 来决定
> 	>> ​	如何决定元素的排序呢?
> 	>> ​		两种方式：
> 	>> ​			自然排序（元素具备比较性）
> 	>> ​				让元素所属的类实现Comparable 接口
> 	>> ​			比较器排序
> 	>> ​				让集合接收一个Comparator的实现类对象
>
> 
>
> Map(双列集合)
>
> ​	 map 集合的数据结构仅仅针对键有效，与值无关。
>
> ​	存储的是键值对形式的元素，键唯一，值可重复。
>
> > HashMap（线程不安全，效率高）
> >
> > > LinkedHashMap
> >
> > Hashtable（线程安全，效率低）
> >
> > TreeMap
> >
> > 

​	

## 2. 如何选择使用哪种集合

是否是键值对象形式

​	是：map

​		键是否需要排序

​			是 TreeMap

​			否 HashMap

​		不知道就用**HashMap**

​	否 ：Collection

​		元素是否唯一

​			是  Set

​				元素是否排序

​					是  TreeSet

​					否 HashSet

​		                不知道，就用**HashSet**

​			否  List

​				要安全吗

​					是   Vactor（其实我们也不用它么多线程待讲）

​					否  ArrayList 或者 LinkedList

​						增删多   LinkedList

​						查询多 ArrayList

​						不知道就用**ArrayList**

​		不知道，就使用ArrayList 

## 3.集合的常见方法及遍历方式

> Collection：

​	add()

​	remove()

​	contains()

​	iterator()

​	size()	

​	遍历方式

​		增强for

​		迭代器

​	lisr

​		get（）

​		遍历：

​			普通for

​	Set

> map

​	put()

​	remove()

​	containsKey(),                       congtainsValue()

​	keySet()

​	get()

​	value()

​	entrySet()

​	size()

​	遍历：

​		根据键找值

​		根据键值对对象分别找键和值

