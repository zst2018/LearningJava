/*
四种权限修饰符
public
protected
默认
private


*/
package com.zst;
class Father{
	public void show1(){
		System.out.println("show1");
	}
	 void show2(){
		System.out.println("show2");
	}
	protected void show3(){
		System.out.println("show3");
	}
	private void show4(){
		System.out.println("show4");
	}
	public static void main(String[] args){
		Father  f=new Father();
		f.show1();
		f.show2();
		f.show3();
		f.show4();
	}
}