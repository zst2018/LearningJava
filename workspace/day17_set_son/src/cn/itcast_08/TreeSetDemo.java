package cn.itcast_08;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年2月4日 下午7:29:05 
* 类说明 
* 键盘录入5 个信息，（姓名，语文成绩，数学成绩，英语成绩）按照总分从高到低输出
* 分析：
* 		定义一个学生类
* 		创建一个TreeSet集合
* 		总分从高到低如何实现
* 		键盘录入5 个学生信息
* 		遍历TreeSet集合
*/
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建TreeSet集合
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>(){

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s2.getSum()-s1.getSum();
				//总分相同的不一订语文相同
				//总分相同的不一订数学相同
				//总分相同的不一订英语相同
				int num2 = num  ==0 ? s1.getChinese()-s2.getChinese() : num;
				int num3 = num2 ==0 ? s1.getMath()-s2.getMath():num2;
				int num4 = num3 ==0 ? s1.getEnglish()-s2.getEnglish() : num3;
				//xingming 
				int num5 = num4==0 ? s1.getName().compareTo(s2.getName()) : num4;
				return num5;
			}
			
		});
		
		for(int x = 1 ; x<=5;x++){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第："+x+ "个学生的姓名：");
			String name = sc.nextLine();
			System.out.println("请输入第："+x+ "个学生的语文成绩：");
			String chineseString = sc.nextLine();
			System.out.println("请输入第："+x+ "个学生的数学成绩：");
			String mathString = sc.nextLine();
			System.out.println("请输入第："+x+ "个学生的英语成绩：");
			String englishString = sc.nextLine();
			
			//把数据封装到学生对象中
			Student s = new Student();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));
			//把学生对象添加到集合
			ts.add(s);
				
		}
		System.out.println("学生信息录入完毕");
		System.out.println("学生信息从高到底排序如下：");
		System.out.println("姓名\t 语文成绩\t 数学成绩\t 英语成绩");
		//遍历集合
		for(Student s : ts){
			System.out.println(s.getName()+"\t"+s.getChinese()+"\t"+s.getMath()+"\t"+s.getEnglish());
		}
	}
	

}
