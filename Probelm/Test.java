/*
我们在main方法中实例了一个Two的对象,
但是程序在实例Two对象时并没有先调用Two的构造方法,
而是先初始化Two类的成员变量,Two类中有三个成员变量,
他们都是One类的对象,所以要依次执行One类的构造方法,
然后再初始化Two类的对象。
在实例化类的对象时,类中的成员变量会首先进行初始化,
如果其中的成员变量有对象，那么它们也会按照顺序执行初始化工作。
在所有类成员初始化完成后，才调用对象所在类的构造方法创建对象
。构造方法作用就是初始化。 


*/
class One   
{   
//无参构造方法
	One(){
		System.out.println("无参构造方法 one ");
	}
	//带参构造方法
    One(String str)   
    {   
    System.out.println(str);   
    }   
}   
class Two   
{   
	//成员变量
    One one_1 = new One("one-1");   
    One one_2 = new One("one-2");   
    One one_3 = new One("one-3"); 
    //无参构造方法
    Two(){
    	System.out.println("无参构造方法 two");
    }
    //带参构造方法  
    Two(String str)   
    {   
    }   
}   
public class Test   
{   
    public static void main(String[] args)   
    {   
    System.out.println("Test main() start");   
    Two two = new Two("two");   
    }   
}  