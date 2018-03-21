/*
需求：计算出1~100之间，偶数之和
*/
class LoopTest2{
	public static void main(String[] args){
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		for(int x=1;x<=100;x++){
			if(x%2==0){//判断X的奇偶性
				sum1 +=x;
				System.out.println("sum1:"+sum1);
			}else{
				sum2 +=x;
				System.out.println("sum2:"+sum2);
			}
		}
		//另外一种方式  8
			System.out.println("sum1:"+sum1);
			System.out.println("sum2:"+sum2);
			for(int x=0;x<=100;x +=2){
				sum3 +=x;
			}
			for(int x=1;x<=100;x+=2){
				sum4 += x;
			}
			System.out.println("sum3:"+sum3);
			System.out.println("sum4:"+sum4);
			System.out.println("******************");
			int jc=1;
			for(int x=1;x<=5;x++){
				jc *= x ;
			}
			System.out.println("jc:"+jc);
	}
}