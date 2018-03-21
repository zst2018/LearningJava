/*
接口成员特点
成员变量

[只能是常量  并且是静态的]
接口中的变量默认是常量，不能再进行赋值
默认修饰符：public static final
建议：自己手动给

构造方法
接口没有构造方法
成员方法
成员方法默认是public  abstract 类型的
只能是抽象方法
默认修饰符：public abstract 
建议  自己手动给出




所有的类都默认继承自一个类 object 
类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
构造方法摘要 
Object() 
 
因为Object类只提供了无参构造，所以所有子类默认调用的都是父类的无参构造方法


*/
interface Inter{
	public int num =10;
	public final int num2 =89;
	//完整版的
	public static final int num3=40;
	//public void show (){}//错误: 接口抽象方法不能带有主体
	// abstract void show();  默认的是  public abstract void show();
	public abstract void show();
	//public void show();  默认是抽象的
}

/*
//接口名+Impl 这种格式是接口的实现类格式
class InterImpl implements Inter{
	public InterImpl(){
		super();
	}

}
*/
//上面的类 和下面的类等价，默认继承一个Object 类
class InterImpl extends Object implements Inter{
	public InterImpl(){
		super();//走的是Object中的午参构造
	}
	//void  show(){}
	/*
	 错误: InterImpl中的show()无法实现Inter中的show()
        void  show(){}
              ^
     正在尝试分配更低的访问权限; 以前为public

	*/
     public void show(){

     }

}
class InterfaceDemo2{
	public static void main(String[] args){
		Inter i=new InterImpl();
		/*
		i.num=34;
		i.num2=67;
		 错误: 无法为最终变量num分配值
                i.num=34;
                 ^
		错误: 无法为最终变量num2分配值
                i.num2=67;
		*/
		System.out.println(i.num);
		System.out.println(i.num2);

		/*
		Inter.num=45;
		Inter.num2=34;
	 	错误: 无法为最终变量num分配值
                Inter.num=45;
                     ^
		错误: 无法为最终变量num2分配值
                Inter.num2=34;

		*/
		System.out.println(Inter.num);
		System.out.println(Inter.num2);

	}
	
}