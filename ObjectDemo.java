/*
面向过程和面向对象实现  把大象装进冰箱里
面向过程：
        动作有哪些呢？
        A  打开冰箱门
        B 装进大象
        C 关上冰箱门

        代码体现：
        class ObjectDemo{
	        public static void main(String[] args){
				       /*   System.out.println("打开冰箱门");
				//打开冰箱门的动作，这里仅用一条输出语句表示
				//其实，他可能需要做很多操作，这个时候代码就比较多一些了
				//假设要多次打开冰箱门
				//代码一多，每次都写一遍比较麻烦
			//这个时候可以用方法改进

				System.out.println("装进大象");
				System.out.println("关上冰箱门");
				      */

		/*		//写了方法以后，调用就改变了
				open();
				in();
				close();

	        }


	        public static void open(){
	        	System.out.println("打开冰箱门");
	
	        }
			public static void in(){
				System.out.println("装进大象");
	
			}
			public static void close(){
					System.out.println("关上冰箱门");
			}
        }

	}

面向对象：（UML语言）
	我们怎么才能更符合面向对象思想？
	A 有哪些类呢  
	        名词提取法 
	        大象
	        冰箱
	        main


	B 每个类有哪些东西呗
	        大象：
	        	进去
	        冰箱：
	        	开门
	        	关门
	        DEmo ：
	        	main 方法 
	C 类与类直接的关系是什么呢？
						Demo中使用大象和冰箱的功能
		代码体现：
		class 大象{
	public static void in（）{
		System.out.println("装进大象");
	}
		}
		class 冰箱{
			public static void open(){
	        	System.out.println("打开冰箱门");
	
	        }
	        public static void close(){
					System.out.println("关上冰箱门");
			}
	
		}
		class Demo{
			publc static void mian(String[] args){
				冰箱 调用 开门
				大象 调用 进去
				冰箱 调用 关门
			}
		}


*/
		//手机类
		/*
成员变量：品牌，价格。颜色
成员方法：打电话，发信息，玩游戏


		*/
class Phone{
	//品牌
	String brand;
	//价格
	int price;
	//颜色
	String color;

	//成员方法
	//打电话
	public void call(String name){
		System.out.println("给"+name+"打电话");

	}
	public void sendMessage(){
		System.out.println("群发短信0");
	}
	public void playGame(){
		System.out.println("玩游戏");
	}

}
/*class PhoneDemo{
	public static void main(String[] args){
		Phone p=new Phone();
		System.out.println(p.brand+"   "+p.price+"    "+p.color);
		p.brand="iphone";
		p.price=7999;
		p.color="white";
		System.out.prinln(p.brand+"   "+p.price+"   "+p.color);
		p.call( "小行踪");
		p.sendMessage();
		p.playGame();
	}
}*/
class PhoneDemo2{
	public static void main(String[] args){
		Phone P=new Phone ;
		p.brand="小妮";
		p.price=2790;
		p.color="红色";
		System.out.println(p.brand+"   "+p.price+"   "+p.color);
		p.call("nihoa ");
		p.sendMessage();
		p.playGame();
		Phone p2=new Phone();
		p2.brand ="huawei ";
		p2.price=2780;
		p2.color="red";
		System.out.println(p2.brand+p2.price+p2.color);
		p2.call("lidan ");
		p2.sendMessage();
		p2.playGame();


	}
}