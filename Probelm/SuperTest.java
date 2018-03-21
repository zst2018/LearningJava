
//实例方法和构造方法中的super关键字都用于去指向父类,
//实例方法中的super关键字是去调用父类当中的某个方法

class getBirthInfo {  
    void getBirthInfo() {  
        System.out.println("born alive.");  
    }  
}  
  
class Platypus1 extends getBirthInfo  
{  
    void getBirthInfo() {  
           System.out.println("hatch from eggs");  
           System.out.println("a mammal normally is ");  
           super.getBirthInfo();  //通过super 调用父类的 getBirthInfo（） 方法
      }  
}  
  
public class SuperTest {  
    public static void main(String[] args) {  
        Platypus1 p1=new Platypus1();  
        p1.getBirthInfo();  
    }  
}  