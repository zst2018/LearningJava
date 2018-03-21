/*


*/

class getBirthInfo { 
//构造方法 
    getBirthInfo(){  //第四步   执行副类的构造方法
        System.out.println("auto");  
    }  
    //实例方法
    void aa() {  
        System.out.println("born alive.");  
    }  
}  
  
class Platypus1 extends getBirthInfo  
{  
	//构造方法			//创建子类对象的同事，调用子类的构造方法，
      Platypus1() {  
        super();//子类的构造方法中，第一个语句，调用父类的构造方法 //第三部
        System.out.println("hatch from eggs");  //第五部
        System.out.println("a mammal normally is ");  //第六部
      }  
}  
  
public class SuperTest2 {  
    public static void main(String[] args) {  //第一步
    	//创建子类的对象
        Platypus1 p1=new Platypus1(); //第二部
    }  
}  