/*

看程序写结果，代码块部分


*/

class Student{
   	static {
   		System.out.println(" student  静态代码块");
   	}
   	{
   		System.out.println("student  构造代码块");
   	}
   	public Student(){
   		System.out.println("student 构造方法代码块");
   	}


   }
   class StudentDemo{
   	
      static  {
   		System.out.println("我想吃好吃的");
   	}
      
   	public static void main(String args[]){
   		System.out.println("我是main 方法");
   		Student s1=new Student();
   		Student s2=new Student();

   	}
}






/*E:\ZHANFSUTING\javacode\day8>java StudentDemo
我想吃好吃的
我是main 方法
 student  静态代码块
student  构造代码块
student 构造方法代码块
student  构造代码块
student 构造方法代码块
*/