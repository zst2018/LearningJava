package cn.itcast_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月4日 下午9:16:54 
* 类说明 
* 以下数据看成是对象的数据
* 
* 传智博客
* 	 bj 北京校区
* 			jc 基础班
* 					林青霞    27
* 					风清扬    30
* 			jy 就业班
* 					赵雅芝    28
* 					吴欣欣    29
* 	 sh 上海校区
* 			jc 基础班
* 					郭美美    20
* 					犀利哥    22
* 			jy 就业班
* 					罗玉凤     21
*                   马征         20
* 	 gz 广州校区
* 			jc 基础班
* 					王力宏      30
* 					李靓蕾      32
* 			jy 就业班
* 					郎朗         31
* 					柳岩         33
* 	 xa 西安校区
* 			jc 基础班
* 					范冰冰      34
* 					李晨          35
* 			jy 就业班
* 					刘诗诗      26
* 					吴奇隆       46
* 
*/
public class HashMapDemo {
	public static void main(String[] args) {
		//创建大集合
		HashMap<String,HashMap<String,ArrayList<Student>>> czbkMap= new HashMap<String,HashMap<String,ArrayList<Student>>>();
		//北京校区数据
		HashMap<String,ArrayList<Student>> bjCzbkMap = new HashMap<String,ArrayList<Student>>();
		ArrayList<Student> array1 = new ArrayList<Student> ();
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("风清扬",30);
		array1.add(s1);
		array1.add(s2);
		
		
		ArrayList<Student> array2 = new ArrayList<Student> ();
		
		Student s3 = new Student("赵雅芝",29);
		Student s4 = new Student("吴欣欣",38);
		array1.add(s3);
		array1.add(s4);
		
		bjCzbkMap.put("jichuban", array1);
		bjCzbkMap.put("jiuyeban", array2);
		czbkMap.put("北京校区", bjCzbkMap);
		
		//遍历集合
		Set<String> czbkMapSet = czbkMap.keySet();
		for(String czbkMapKey:czbkMapSet){ 
			System.out.println(czbkMapKey);
			
			HashMap<String,ArrayList<Student>> czbkMapValue = czbkMap.get(czbkMapKey);
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for(String czbkMapValueKey: czbkMapValueSet){
				ArrayList<Student> czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				for(Student s : czbkMapValueValue){
					System.out.println("\t"+s.getName()+"\t"+s.getAge());
				}
			}
		}
	}

}
