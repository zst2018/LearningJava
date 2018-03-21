/*包
格式：package 包面；
作用：
对类进行分类管理，把相同的类名放在不同的包里
注意事项：
package 语句必须是程序的第一条可执行语句
package 语句在一个java 文件中只能有一个
如果没有package 默认表示无报名
带包的编译和运行
编译  javac -encoding utf8 -d . 类名.java
运行  java cn.itcast.类名


*/
package cn.itcast;
class Hello{
	public static void main(String[] args){
		System.out.println("niaho ");
	}
}