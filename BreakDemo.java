//控制跳转语句：
	//break  continue return
//作用：
//A:跳出层循环，B:终止多层循环
class BreakDemo{
	public static void main(String[] args){
		//在switch 或loop外部中断
		//break;
		//跳出单层循环
		for(int x=0;x<10;x++){
			if(x==5){
				break;
			}
			System.out.println("**");
		}

		//
		 wc:for(int a=1;a<8;a++){
			for(int b=1;b<a;b++){
				if(b==4){
					break wc;
				}
				System.out.print("*");

			}
			System.out.println();
		}

		//cntinue










		     


	}
}