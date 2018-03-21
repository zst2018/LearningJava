/*
代码中我们只实例化子类一个对象,
但从执行结果上看程序一开始并不是运行子类的构造方法
而是先执行父类的默认构造方法,然后再执行子类的构造方法.
所以我们在实例化子类对象时,程序会先调用父类的默认构造方法,
然后再执行子类的构造方法。



*/
// 父类
class SuperClass   
{   
	//父类的构造方法
    SuperClass()   
    {   
        System.out.println("SuperClass constructor");   
    }   
}   
//子类继承父类
public class SubClass extends SuperClass {  
	//子类的构造方法
    SubClass()   
    {   
        System.out.println("SubClass constructor");   
    }   
    //main方法
    public static void main(String[] args) {                                     
    	//创建子类的对象
        SubClass sub = new SubClass();   
    }   
}   