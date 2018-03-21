/*
由此总结初始化顺序：
　　1．父类的静态成员
    2．子类的静态成员
    3．父类的非静态成员
　　4．父类的默认构造函数被调用。 
　　5．子类的非静态对象（变量） 
　　6．子类的构造函数。 

*/


class One {  
    One(String str) {  
        System.out.println(str+" in Class One Constror ");  
    }  
}  
  
class Two {  
    One one_1 = new One("Class Two Field one-1");  
    One one_2 = new One("Class Two Field one-2");  
    static One one_3 = new One("Class Two Static Field one-3"); 
    public Two() {  
        System.out.println("Class Two Defalut Constror ");  
    }  
    Two(String str) {  
        System.out.println(str+" in Class Two Constror +");  
    }  
}  
  
class TwoSub extends Two{  
    One one_4 = new One("Class TwoSub Field one-4");  
    static One one_5 = new One("Class TwoSub Static Field one-5");  
    public TwoSub(String str) {  
        System.out.println(str+" in Class TwoSub Constror ");  
    }  
}  
  
public class Test1 {  
 static Two two_3 = new Two("two-3");  //第一步
  
    public static void main(String[] args) {  
        System.out.println("Test main() start");  
        TwoSub twoSub = new TwoSub("twoSub");  
        Two two_1 = new Two("two-1");  
        System.out.println("------------");  
        Two two_2 = new Two("two-2");  
    }  
}  