package com.zst_02;

import com.zst_01.Jump;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月22日 上午10:04:34 
* 类说明 
*/
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("会跳高的狗");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗爱吃骨头");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗站着睡觉");

	}

}
