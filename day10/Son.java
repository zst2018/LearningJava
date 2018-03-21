/*


*/
package com.zst;

class Son extends Father{
	public static void main(String[] args){
		Father f=new Father();
		f.show1();
		f.show2();
		f.show3();
		//f.show4();// show4()可以在Father中访问private
		System.out.println();

		Son s=new Son();
		s.show1();
		s.show2();
		s.show3();
		//s.show4();//错误: 找不到符号
	}
	
}