/*
三目运算符
格式：（比较表达式）？（表达式1）：（表达式2）；
比较表达式的输出是Boolean型的
运算流程：根据比较表达式的结果是ture 还是false
如果是ture  则运算结果是执行的表达式1
如果是false，则运算结果是执行的表达式2、
*/
class OperatorDemo6 {
	public static void main(String[] args){
		int x=5;
		int y=6;
		int m=7;
		int z=(x>y)?(x):(y);//比较两个整数的最大值
		//int z=(x<y)?(x):(y);比较两个整数的最小值

		//int z=(x==y)?(x):(y);
        System.out.println(z);
        int max=(m>z)?(m):(z);//比较三个数中的最大数
        System.out.println(max);
        int max2=(x>y)?((x>m)?x:m):((y>m)?y:m);//嵌套使用三目运算符
        System.out.println(max2);//比较三个数中的最大数
        System.out.println("***************");
        	int  a=89;
        	int b=57;
        	//boolean flag=(a==b)?true:false;
        	//boolean flag=(a==b);
        	System.out.println(a==b);






	}

}