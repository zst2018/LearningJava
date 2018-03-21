/*
for 循环语句格式
for(初始化语句；判断条件语句；控制条件语句){
	循环体语句；
}
执行流程：
先执行初始化语句
然后是判断条件语句，根据结果是true 或者false ，如果是true就继续执行，如果是false就结束执行
循环体语句
控制条件语句
判断条件语句。。。。


*/ 
class LoopDemo{
	public static void main(String[] args){
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("java");
		System.out.println("***************");//以上代码不够优化，代码的重复度太高
		for(int x=1;x<=10;x++){
			//判断条件语句无论简单还是复杂，其结果是Boolean类型
			System.out.println("java");
		}

	}
}