/*


*/
class SwitchTest{
	public static void main(String[] args){
		int a=6;
		int b=4;
		switch(a){
			default:
			b++;
			break;//先走case
			case 7:
			b++;
			break;
			case 8:
			b++;
			break;
		}
		System.out.println("b:"+b);//b=5
		System.out.println("………………………………………………");
		int x=7;
		int y=3;
		switch(x){
			default:
			y++;
			case 8:
			y++;
			break;
			case 7:
			y++;

		}

		System.out.println("y:"+y);//y=5(错误)     y=4
		//switch 结构中，首先执行case语句，case=8 不执行。case=7的时候，y++，此时y=4
		//因为case=7是switch 语句的最后一条语句，在没有break 语句的情况下，switch语句也满足结束条件
	}
}